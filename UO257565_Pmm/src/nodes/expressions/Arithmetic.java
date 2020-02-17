package nodes.expressions;

import nodes.Expression;

public class Arithmetic implements Expression {

    private int line;
    private int column;
    private Expression LValue;
    private Expression RValue;
    private String operator;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Expression getLvalue() {
        return LValue;
    }

    public Expression getRvalue() {
        return RValue;
    }

    public String getOperator() {
        return operator;
    }
}
