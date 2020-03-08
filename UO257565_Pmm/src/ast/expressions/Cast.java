package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression {

    private Expression expression;

    public Cast(int line, int column, Expression expression, Type castType) {
        super(line, column);
        super.setType(castType);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
