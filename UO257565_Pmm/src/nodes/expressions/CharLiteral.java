package nodes.expressions;

import nodes.Expression;

public class CharLiteral implements Expression {

    private int line;
    private int column;
    private char value;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public char getValue() {
        return value;
    }
}
