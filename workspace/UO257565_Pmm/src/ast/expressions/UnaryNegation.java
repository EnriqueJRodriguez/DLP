package ast.expressions;

public class UnaryNegation extends AbstractExpression {

    private Expression operand;

    public UnaryNegation( int line, int column, Expression operand) {
        super(line, column);
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }
}
