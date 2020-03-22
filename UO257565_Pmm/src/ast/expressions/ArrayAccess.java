package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

public class ArrayAccess extends AbstractExpression {

    private Expression array;
    private Expression accessed;

    public ArrayAccess(int line, int column, Expression array, Expression accessed) {
        super(line, column);
        this.array = array;
        this.accessed = accessed;
    }

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public Expression getAccessed() {
        return accessed;
    }

    public void setAccessed(Expression accessed) {
        this.accessed = accessed;
    }

    public Type getArrayType(){
        return array.getType();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
