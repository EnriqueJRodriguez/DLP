package nodes.expressions;

import nodes.Expression;

public class UnaryNegation implements Expression {
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
