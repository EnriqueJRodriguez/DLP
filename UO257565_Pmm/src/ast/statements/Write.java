package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class Write extends AbstractStatement {

    private Expression expression;

    public Write(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
