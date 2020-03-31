package visitor;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR>{

    @Override
    public TR visit(Program p, TP parameter) {
        for(Definition definition:p.getDefinitions()){
            definition.accept(this, parameter);
        }
        return null;
    }

    @Override
    public TR visit(FieldDefinition fild, TP parameter) {
        fild.getType().accept(this,parameter);
        return null;
    }

    @Override
    public TR visit(FunctionDefinition fund, TP parameter) {
        fund.getType().accept(this,parameter);
        for(Statement statement: fund.getStatements()){
            statement.accept(this,parameter);
        }
        return null;
    }

    @Override
    public TR visit(VariableDefinition vd, TP parameter) {
        vd.getType().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP parameter) {
        a.getLeftOperand().accept(this, parameter);
        a.getRightOperand().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(ArrayAccess aa, TP parameter) {
        aa.getArray().accept(this, parameter);
        aa.getAccessed().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Cast c, TP parameter) {
        c.getExpression().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(CharLiteral cl, TP parameter) {
        return null;
    }

    @Override
    public TR visit(Comparison com, TP parameter) {
        com.getLeftOperand().accept(this, parameter);
        com.getRightOperand().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(FieldAccess fila, TP parameter) {
        fila.getAccessed().accept(this,parameter);
        return null;
    }

    @Override
    public TR visit(IntLiteral il, TP parameter) {
        return null;
    }

    @Override
    public TR visit(Logical l, TP parameter) {
        l.getLeftOperand().accept(this, parameter);
        l.getRightOperand().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(RealLiteral rl, TP parameter) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus um, TP parameter) {
        um.getOperand().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(UnaryNegation un, TP parameter) {
        un.getOperand().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Variable v, TP parameter) {
        return null;
    }

    @Override
    public TR visit(Assignment ass, TP parameter) {
        ass.getLeft().accept(this, parameter);
        ass.getRight().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation funi, TP parameter) {
        for(Expression expression: funi.getParameters()){
            expression.accept(this, parameter);
        }
        funi.getVariable().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(IfStatement ifs, TP parameter) {
        for(Statement ifStatement: ifs.getIfStatements()){
            ifStatement.accept(this, parameter);
        }
        for(Statement elseStatement: ifs.getElseStatements()){
            elseStatement.accept(this, parameter);
        }
        ifs.getCondition().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Read red, TP parameter) {
        red.getExpression().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(ReturnStatement rts, TP parameter) {
        rts.getExpression().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(While whl, TP parameter) {
        for(Statement statement: whl.getStatements()){
            statement.accept(this, parameter);
        }
        whl.getCondition().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Write wrt, TP parameter) {
        wrt.getExpression().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(ArrayType arrt, TP parameter) {
        arrt.getType().accept(this, parameter);
        return null;
    }

    @Override
    public TR visit(Char cht, TP parameter) {
        return null;
    }

    @Override
    public TR visit(ErrorType err, TP parameter) {
        return null;
    }

    @Override
    public TR visit(FunctionType funt, TP parameter) {
        funt.getReturnType().accept(this, parameter);
        for(VariableDefinition variableDefinition: funt.getVariableDefinitions()){
            variableDefinition.accept(this, parameter);
        }
        return null;
    }

    @Override
    public TR visit(Int intt, TP parameter) {
        return null;
    }

    @Override
    public TR visit(Real ret, TP parameter) {
        return null;
    }

    @Override
    public TR visit(Struct stt, TP parameter) {
        for(FieldDefinition fieldDefinition: stt.getFields()){
            fieldDefinition.accept(this, parameter);
        }
        return null;
    }

    @Override
    public TR visit(VoidType vdt, TP parameter) {
        return null;
    }
}
