package ast.expressions;

import visitor.Visitor;

public class FieldAccess extends AbstractExpression {

    private Expression accessed;
    private String field;

    public FieldAccess(int line, int column, Expression accessed, String field) {
        super(line, column);
        this.accessed = accessed;
        this.field = field;
    }

    public Expression getAccessed() {
        return accessed;
    }

    public void setAccessed(Expression access) {
        this.accessed = access;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
