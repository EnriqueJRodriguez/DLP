package ast.types;

import visitor.Visitor;

public class Int extends AbstractType {

    private static Int staticInstance;

    private Int(int line, int column) {
        super(line, column);
    }

    public static Int getInstance() {
        if (staticInstance == null) {
            staticInstance = new Int(0, 0);
        }
        return staticInstance;
    }


    @Override
    public Type arithmetic(Type t) {
        if(t instanceof Int) {
            return t;
        }
        return super.arithmetic(t);
    }

    @Override
    public Type comparison(Type t) {
        if(t instanceof Int) {
            return Int.getInstance();
        }
        return super.comparison(t);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type unaryMinus() {
        return this;
    }

    @Override
    public Type unaryNegate() {
        return this;
    }

    @Override
    public Type logical(Type t) {
        if(t instanceof Int){
            return t;
        }
        return super.logical(t);
    }

    @Override
    public boolean isBuiltInType() {
        return true;
    }

    @Override
    public boolean promotesTo(Type t) {
        return t instanceof Int;
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
