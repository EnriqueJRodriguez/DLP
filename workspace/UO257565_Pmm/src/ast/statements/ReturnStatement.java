package ast.statements;

import ast.expressions.Expression;
import ast.types.Type;

public class ReturnStatement extends AbstractStatement {

    private Expression expression;

    public ReturnStatement(int line, int column, Expression expression) {
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
