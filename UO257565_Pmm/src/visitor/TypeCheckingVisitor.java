package visitor;

import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void>{

    @Override
    public Void visit(Arithmetic a, Type parameter) {
        super.visit(a, parameter);
        a.setLValue(false);
        a.setType(a.getLeftOperand().getType().arithmetic(a.getRightOperand().getType()));
        if(a.getType() == null){
            a.setType(new ErrorType(a.getLine(), a.getColumn(), "Not supported operation between operands on arithmetic operation"));
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess aa, Type parameter) {
        super.visit(aa, parameter);
        aa.setLValue(true);
        aa.setType(aa.getArray().getType().squareBrackets(aa.getAccessed().getType()));
        if(aa.getType() == null){
            aa.setType(new ErrorType(aa.getLine(), aa.getColumn(),"Wrong way of indexing the array."));
        }
        return null;
    }

    @Override
    public Void visit(Assignment ass, Type parameter) {
        super.visit(ass, parameter);
        if(!ass.getLeft().getLValue()){
            new ErrorType(ass.getLine(), ass.getColumn(), "The expression "+
                    ass.getLeft().getType() + " can't be the left part of an assignment");
        }
        if(!(ass.getLeft().getType().promotesTo(ass.getRight().getType())) &&
                !(ass.getLeft().getType() instanceof ErrorType) && !(ass.getRight().getType() instanceof ErrorType)){
            new ErrorType(ass.getLine(), ass.getColumn(), "Type mismatch in the assignment.");
        }
        return null;
    }

    @Override
    public Void visit(Cast c, Type parameter) {
        super.visit(c, parameter);
        c.setLValue(false);
        c.setType(c.getExpression().getType().canBeCast(c.getType()));
        if(c.getType() == null){
            c.setType( new ErrorType(c.getLine(),c.getColumn(),"Cast operation not supported for this type."));
        }
        return null;
    }

    @Override
    public Void visit(CharLiteral cl, Type parameter) {
        super.visit(cl, parameter);
        cl.setLValue(false);
        cl.setType(Char.getInstance());
        return null;
    }

    @Override
    public Void visit(Comparison com, Type parameter) {
        super.visit(com, parameter);
        com.setLValue(false);
        com.setType(com.getLeftOperand().getType().comparison(com.getRightOperand().getType()));
        if(com.getType() == null){
            com.setType(new ErrorType(com.getLine(), com.getColumn(), "The type of the operands are not compatible with the comparison operation"));
        }
        return null;
    }

    @Override
    public Void visit(FieldAccess fila, Type parameter) {
        super.visit(fila, parameter);
        fila.setLValue(true);
        fila.setType(fila.getAccessed().getType().dot(fila.getField()));
        if(fila.getType() == null){
            fila.setType( new ErrorType(fila.getLine(), fila.getColumn(), "Field name not defined in the struct."));
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition fund, Type parameter) {
        return super.visit(fund, fund.getReturnType());
    }

    @Override
    public Void visit(FunctionInvocation funi, Type parameter) {
        List<Type> types = new ArrayList<Type>();
        for(Expression expression : funi.getParameters()){
            expression.accept(this, parameter);
            types.add(expression.getType());
        }
        funi.getVariable().accept(this, parameter);
        funi.setLValue(false);
        funi.setType(funi.getVariable().getType().parenthesis(types));
        if(funi.getType() == null){
            funi.setType(new ErrorType(funi.getLine(), funi.getColumn(), "Used parameters do not match with the function declaration."));
        }
        return null;
    }

    @Override
    public Void visit(IfStatement ifs, Type parameter) {
        ifs.getCondition().accept(this, parameter);
        if(!ifs.getCondition().getType().isLogical()){
            ifs.getCondition().setType(new ErrorType(ifs.getLine(), ifs.getColumn(), "The condition of this statement is a non logical type."));
        }
        for(Statement statement : ifs.getIfStatements()){
            statement.accept(this, parameter);
        }
        for(Statement statement : ifs.getElseStatements()){
            statement.accept(this, parameter);
        }
        return null;
    }

    @Override
    public Void visit(IntLiteral il, Type parameter) {
        super.visit(il, parameter);
        il.setLValue(false);
        il.setType(Int.getInstance());
        return null;
    }

    @Override
    public Void visit(Logical l, Type parameter) {
        super.visit(l, parameter);
        l.setLValue(false);
        l.setType(l.getLeftOperand().getType().logical(l.getRightOperand().getType()));
        if(l.getType() == null){
            l.setType( new ErrorType(l.getLine(), l.getColumn(), "Non logical operands using a logical operator."));
        }
        return null;
    }

    @Override
    public Void visit(RealLiteral rl, Type parameter) {
        super.visit(rl, parameter);
        rl.setLValue(false);
        rl.setType(Real.getInstance());
        return null;
    }

    @Override
    public Void visit(UnaryMinus um, Type parameter) {
        super.visit(um, parameter);
        um.setLValue(false);
        um.setType(um.getOperand().getType().unaryMinus());
        if(um.getType() == null){
            um.setType(new ErrorType(um.getLine(), um.getColumn(), "Minus operation not supported for this operand."));
        }
        return null;
    }

    @Override
    public Void visit(UnaryNegation un, Type parameter) {
        super.visit(un, parameter);
        un.setLValue(false);
        un.setType(un.getOperand().getType().unaryNegate());
        if(un.getType() == null){
            un.setType(new ErrorType(un.getLine(), un.getColumn(), "Non compatible operand with the unary negation"));
        }
        return null;
    }

    @Override
    public Void visit(Read red, Type parameter) {
        super.visit(red, parameter);
        if(!red.getExpression().getLValue()){
            new ErrorType(red.getLine(), red.getColumn(), "The expression "+
                    red.getExpression().getType() + " can't be read as an input");
        }
        if(!red.getExpression().getType().isBuiltInType()){
            new ErrorType(red.getLine(), red.getColumn(), "The expression "+
                    red.getExpression().getType() + " can't be read as an input");
        }
        return null;
    }



    @Override
    public Void visit(ReturnStatement rts, Type parameter) {
        super.visit(rts, parameter);
        if(!rts.getExpression().getType().promotesTo(parameter)){
            new ErrorType(rts.getLine(), rts.getColumn(), "The return type does not match the returned type.");
        }
        return null;
    }

    @Override
    public Void visit(While whl, Type parameter) {
        whl.getCondition().accept(this, parameter);
        if(!whl.getCondition().getType().isLogical()){
            whl.getCondition().setType(new ErrorType(whl.getLine(), whl.getColumn(), "The condition of this statement is a non logical type."));
        }
        for(Statement statement : whl.getStatements()){
            statement.accept(this,parameter);
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Type parameter) {
        super.visit(v, parameter);
        v.setLValue(true);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Write wrt, Type parameter) {
        super.visit(wrt, parameter);
        if(!wrt.getExpression().getType().isBuiltInType()){
            new ErrorType(wrt.getLine(), wrt.getColumn(), "The expression "+
                    wrt.getExpression().getType() + " can't be printed");
        }
        return null;
    }
}
