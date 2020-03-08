package ast.expressions;

public class Logical extends AbstractExpression {

    private String operator;
    private Expression leftOperand;
    private Expression rightOperand;

    public Logical(int line, int column, String operator, Expression leftOperand, Expression rightOperand) {
        super(line, column);
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Expression leftOperand) {
        this.leftOperand = leftOperand;
    }

    public Expression getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Expression rightOperand) {
        this.rightOperand = rightOperand;
    }
}
