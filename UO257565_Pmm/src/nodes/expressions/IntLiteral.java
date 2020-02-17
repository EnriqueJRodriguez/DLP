package nodes.expressions;

import nodes.Expression;

public class IntLiteral implements Expression {

    private int line;
    private int column;
    private int value;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }
}
