package nodes.expressions;

import nodes.Expression;

public class FieldAccess implements Expression {

    private int line;
    private int column;
    private Expression expression;
    private String fieldName;

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

    public String getFieldName() {
        return fieldName;
    }
}
