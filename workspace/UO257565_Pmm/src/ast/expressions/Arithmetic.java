package ast.expressions;

public class Arithmetic extends AbstractExpression {

    private String operator;
    private Expression leftOperand;
    private Expression rightOperand;

    public Arithmetic(int line, int column, String operator, Expression leftOperand, Expression rightOperand) {
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
