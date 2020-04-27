package codegeneration;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FieldDefinition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Definition,Void>{

    private ValueCGVisitor valueCGVisitor;
    private AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        super(codeGenerator);
        valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor = new AddressCGVisitor(codeGenerator);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
    }

    /**
     * execute[[ Program: program -> definition* ]] () =
     * for(Definition definition : definition*)
     *      if(definition instanceof VariableDefinition)
     *          execute[[ definition ]]()
     *
     * <call main>
     * <halt>
     *
     * for(Definition definition : definition*)
     *      if(definition instanceof FunctionDefinition)
     *          execute[[ definition ]]()
     */
    @Override
    public Void visit(Program p, Definition parameter) {
        for(Definition definition : p.getDefinitions()){
            if(definition instanceof VariableDefinition){
                definition.accept(this, null);
            }
        }

        super.getCodeGenerator().mainInvocation();

        for(Definition definition: p.getDefinitions()){
            if(definition instanceof FunctionDefinition){
                definition.accept(this,null);
            }
        }
        return null;
    }

    /**
     * execute[[FunctionDefinition: definition -> ID type statements* ]]() =
     * <enter> definition.localVariableBytes
     * <Comment> Parameters:
     * for(VariableDefinition variableDefinition : type.variableDefinitions)
     *      execute[[ definition ]]()
     *<Comment> Local Variables
     * for(Statement statement: definition.statements)
     *      execute[[ statement ]]()
     * if( definition.type.returnType instanceof VoidType)
     *      if(definition.type.variableDefinitions.size > 0)
     *          <ret> definition.localVariableBytes definition.type.parametersSize
     *      else
     *          <ret> definition.localVariableBytes
     *
     */
    @Override
    public Void visit(FunctionDefinition fund, Definition parameter) {
        super.getCodeGenerator().line(fund.getLine());
        super.getCodeGenerator().label(fund.getName());
        super.getCodeGenerator().comment("Parameters");
        for(VariableDefinition variableDefinition : ((FunctionType)fund.getType()).getVariableDefinitions()){
            variableDefinition.accept(this,null);
        }
        super.getCodeGenerator().comment("Local variables");

        int numberOfVariableDefinitions = fund.getNumberOfVariableDefinitions();
        List<Statement> statements = fund.getStatements();
        for(int i=0; i < statements.size(); i++){
            if(i == numberOfVariableDefinitions){
                super.getCodeGenerator().enter(fund.getLocalVariablesBytes());
            }
            statements.get(i).accept(this, fund);
        }
        if( ((FunctionType) fund.getType()).getReturnType() instanceof VoidType){
            if(((FunctionType) fund.getType()).getVariableDefinitions().size() >0){
                super.getCodeGenerator().ret(0, fund.getLocalVariablesBytes(), ((FunctionType) fund.getType()).getParametersSize());
            } else {
                super.getCodeGenerator().ret(0, fund.getLocalVariablesBytes(),0);
            }
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition vd, Definition parameter) {
        super.getCodeGenerator().comment(vd.getType().toString() + " " +
                vd.getName() + " (offset " + vd.getOffset() +")");
        return null;
    }

    /**
     * Execute[[ Assignment: statement -> expression1 expression2]]()=
     * address[[expression1]]()
     * value[[expression2]]()
     * <store> expression1.type.suffix
     */
    @Override
    public Void visit(Assignment ass, Definition parameter) {
        super.getCodeGenerator().line(ass.getLine());
        super.getCodeGenerator().comment("Assignment");
        ass.getLeft().accept(addressCGVisitor, parameter);
        ass.getRight().accept(valueCGVisitor, parameter);
        super.getCodeGenerator().store(ass.getLeft().getType().suffix());
        return null;
    }

    /**
     * execute[[FunctionInvocation: statement -> expression expression*]]()=
     * value[[(Expression) statement]]()
     * if(!((Expression)statement.type instanceof VoidType))
     *      <pop> ((Expression)statement).type.suffix
     */
    @Override
    public Void visit(FunctionInvocation funi, Definition parameter) {
        super.getCodeGenerator().line(funi.getLine());
        funi.accept(valueCGVisitor, parameter);
        if(!(funi.getType() instanceof VoidType)){
            super.getCodeGenerator().pop(funi.getType().suffix());
        }
        return null;
    }

    /**
     * execute[[IfStatement: statement -> expression statement1* statement2*]]()=
     * int else = cg.getLabel();
     * int end = cg.getLabel();
     * value[[ expression ]]()
     * <jz label> else
     * for(Statement statement : statement1*)
     *      execute[[ statement ]]()
     * <jmp label> end
     * <label> else <:>
     * for(Statement statement : statement2*)
     *      execute[[statement]]()
     * <label> end <:>
     */
    @Override
    public Void visit(IfStatement ifs, Definition parameter) {
        super.getCodeGenerator().line(ifs.getLine());
        super.getCodeGenerator().comment("If");
        int _else = super.getCodeGenerator().getLabel();
        int end = super.getCodeGenerator().getLabel();
        ifs.getCondition().accept(valueCGVisitor, parameter);
        super.getCodeGenerator().jz("else" + _else);
        super.getCodeGenerator().comment("if body");
        for(Statement statement : ifs.getIfStatements()){
            statement.accept(this, parameter);
        }
        super.getCodeGenerator().jmp("end" + end);
        super.getCodeGenerator().label("else" + _else);
        super.getCodeGenerator().comment("else body");
        for(Statement statement : ifs.getElseStatements()){
            statement.accept(this, parameter);
        }
        super.getCodeGenerator().label("end" + end);
        return null;
    }

    /**
     * execute[[ Read: statement -> expression ]]() =
     * address[[ expression ]]()
     * <in> expression.type.suffix
     * <store> expression.type.suffix
     */
    @Override
    public Void visit(Read red, Definition parameter) {
        super.getCodeGenerator().line(red.getLine());
        super.getCodeGenerator().comment("Read");
        red.getExpression().accept(addressCGVisitor,parameter);
        super.getCodeGenerator().in(red.getExpression().getType().suffix());
        super.getCodeGenerator().store(red.getExpression().getType().suffix());
        return null;
    }

    /**
     * execute[[ ReturnStatement: statement -> expression]]( functionDefinition)=
     * value[[expression]]()
     * <ret> expression.type.size <,>
     *       funcDefinition.localVariablesBytes <,>
     *       functionDefinition.type.parametersSize
     */
    @Override
    public Void visit(ReturnStatement rts, Definition parameter) {
        super.getCodeGenerator().line(rts.getLine());
        super.getCodeGenerator().comment("Return");
        rts.getExpression().accept(valueCGVisitor,parameter);
        super.getCodeGenerator().ret(rts.getExpression().getType().getSize(),
                ((FunctionDefinition)parameter).getLocalVariablesBytes(),
                ((FunctionType) parameter.getType()).getParametersSize());
        return null;
    }

    /**
     * execute[[ WhileStatement: statement -> expression statement*]]()=
     * int condition = codeGenerator.getLabel();
     * int end = codeGenerator.getLabel();
     * <label> condition <:>
     * value[[ expression ]]()
     * <jz label> end
     * for(Statement statement: statement*)
     *      execute[[ statement ]]()
     * <jmp label> condition
     * <label> end <:>
     */
    @Override
    public Void visit(While whl, Definition parameter) {
        super.getCodeGenerator().line(whl.getLine());
        super.getCodeGenerator().comment("While");
        int condition = super.getCodeGenerator().getLabel();
        int end = super.getCodeGenerator().getLabel();
        super.getCodeGenerator().label("label" + condition);
        whl.getCondition().accept(valueCGVisitor, parameter);
        super.getCodeGenerator().jz("label" + end);
        super.getCodeGenerator().comment("While body");
        for(Statement statement: whl.getStatements()){
            statement.accept(this, parameter);
        }
        super.getCodeGenerator().jmp("label" + condition);
        super.getCodeGenerator().label("label" + end);
        return null;
    }

    /**
     * execute[[ Write: statement -> expression ]]() =
     * address[[ expression ]]()
     * <out> expression.type.suffix
     */
    @Override
    public Void visit(Write wrt, Definition parameter) {
        super.getCodeGenerator().line(wrt.getLine());
        super.getCodeGenerator().comment("Write");
        wrt.getExpression().accept(valueCGVisitor,parameter);
        super.getCodeGenerator().out(wrt.getExpression().getType().suffix());
        return null;
    }
}
