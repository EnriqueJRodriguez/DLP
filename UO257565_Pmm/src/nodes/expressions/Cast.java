package nodes.expressions;

import nodes.Expression;
import nodes.Type;

public class Cast implements Expression {
    private int line;
    private int column;
    private Expression expression;
    private Type castType;

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

    public Type getCastType() {
        return castType;
    }
}
