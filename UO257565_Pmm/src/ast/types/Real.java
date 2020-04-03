package ast.types;

import visitor.Visitor;

public class Real extends AbstractType {

    private static Real staticInstance;

    private Real(int line, int column) {
        super(line, column);
    }

    public static Real getInstance() {
        if (staticInstance == null) {
            staticInstance = new Real(0, 0);
        }
        return staticInstance;
    }

    @Override
    public Type arithmetic(Type t) {
        if(t instanceof Real){
            return t;
        }
        return super.arithmetic(t);
    }

    @Override
    public Type comparison(Type t) {
        if(t instanceof Real) {
            return Int.getInstance();
        }
        return super.comparison(t);
    }

    @Override
    public boolean isBuiltInType() {
        return true;
    }

    @Override
    public Type unaryMinus() {
        return this;
    }

    @Override
    public String toString() {
        return "real";
    }

    @Override
    public boolean promotesTo(Type t) {
        return t instanceof Real;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
