package ast.types;

import visitor.Visitor;

public class Char extends AbstractType {

    private static Char staticInstance;

    private Char(int line, int column) {
        super(line, column);
    }

    public static Char getInstance() {
        if (staticInstance == null) {
            staticInstance = new Char(0, 0);
        }
        return staticInstance;
    }

    @Override
    public Type arithmetic(Type t) {
        if(t instanceof Char) {
            return Int.getInstance();
        }
        return super.arithmetic(t);
    }

    @Override
    public Type comparison(Type t) {
        if(t instanceof Char) {
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
        return Int.getInstance();
    }

    @Override
    public boolean promotesTo(Type t) {
        return t instanceof Char;
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
