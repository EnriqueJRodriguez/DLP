package ast.types;

import visitor.Visitor;

public class ArrayType extends AbstractType {

    private int size;
    private Type type;


    public ArrayType(Type type, int line, int column) {
        super(line, column);
        this.type = type;
    }

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public int getSize() {
        return size * type.getSize();
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Type squareBrackets(Type t) {
        if(!(t instanceof Int)){
            return null;
        }
        return type;
    }

    @Override
    public String toString() {
        return "ArrayType[of:" + type.toString() + ",size:" + size + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
