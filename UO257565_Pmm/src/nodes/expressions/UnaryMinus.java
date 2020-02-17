package nodes.expressions;

import nodes.Expression;

public class UnaryMinus implements Expression {
    private int line;
    private int column;
    private Expression expression;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public Expression getExpression() {
        return expression;
    }
}
