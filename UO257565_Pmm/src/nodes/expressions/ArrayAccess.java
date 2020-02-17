package nodes.expressions;

import nodes.Expression;

public class ArrayAccess implements Expression {

    private int line;
    private int column;
    private Expression LValue;
    private Expression RValue;

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
}
