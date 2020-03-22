package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    private Type type;
    private boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
