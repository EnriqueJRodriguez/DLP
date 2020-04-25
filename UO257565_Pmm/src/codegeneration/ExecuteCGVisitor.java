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

    @Override
    public Void visit(FunctionInvocation funi, Definition parameter) {
        return super.visit(funi, parameter);
    }

    @Override
    public Void visit(IfStatement ifs, Definition parameter) {
        return super.visit(ifs, parameter);
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
     * execute[[ ReturnStatement: statement -> expression]]()=
     * value[[expression]]()
     * <ret> expression.type.size funcDefinition.localVariablesBytes functionType.parametersSize
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

    @Override
    public Void visit(While whl, Definition parameter) {
        return super.visit(whl, parameter);
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
