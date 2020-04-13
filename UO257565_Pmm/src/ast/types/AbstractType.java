package ast.types;

import ast.AbstractASTNode;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type{

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type t) {
        if (t instanceof ErrorType) {
            return t;
        }
        return null;
    }

    @Override
    public Type canBeCast(Type t) {
        if(t.isBuiltInType()){
            return t;
        }
        return null;
    }

    @Override
    public Type comparison(Type t) {
        if (t instanceof ErrorType) {
            return t;
        }
        return null;
    }

    @Override
    public Type dot(String name) {
        return null;
    }

    @Override
    public int getSize() {
        throw new RuntimeException("Size must accesed on the concrete type class");
    }

    @Override
    public boolean isBuiltInType() {
        return false;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type unaryMinus() {
        return null;
    }

    @Override
    public Type unaryNegate() {
        return null;
    }

    @Override
    public Type logical(Type t) {
        if (t instanceof ErrorType) {
            return t;
        }
        return null;
    }

    @Override
    public Type parenthesis(List<Type> types) {
        return null;
    }

    @Override
    public boolean promotesTo(Type t) {
        return false;
    }

    @Override
    public void setSize(int size){
        throw new RuntimeException("Size must defined on the concrete type class");
    }

    @Override
    public Type squareBrackets(Type t) {
        return null;
    }

}
