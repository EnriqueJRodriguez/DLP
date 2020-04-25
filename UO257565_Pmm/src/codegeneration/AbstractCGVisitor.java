package codegeneration;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FieldDefinition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public abstract class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR>{

    private CodeGenerator codeGenerator;

    public AbstractCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public CodeGenerator getCodeGenerator(){
        return codeGenerator;
    }

    @Override
    public TR visit(Program p, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FieldDefinition fild, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionDefinition fund, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VariableDefinition vd, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Arithmetic a, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayAccess aa, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Cast c, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(CharLiteral cl, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Comparison com, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FieldAccess fila, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IntLiteral il, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Logical l, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(RealLiteral rl, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(UnaryMinus um, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(UnaryNegation un, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Variable v, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Assignment ass, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionInvocation funi, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(IfStatement ifs, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Read red, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ReturnStatement rts, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(While whl, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Write wrt, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ArrayType arrt, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Char cht, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(ErrorType err, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(FunctionType funt, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Int intt, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Real ret, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(Struct stt, TP parameter) {
        throw new IllegalStateException();
    }

    @Override
    public TR visit(VoidType vdt, TP parameter) {
        throw new IllegalStateException();
    }
}
