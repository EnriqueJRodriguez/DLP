package nodes.expressions;

import nodes.Expression;

public class RealLiteral implements Expression {

    private int line;
    private int column;
    private double value;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public double getValue() {
        return value;
    }
}
