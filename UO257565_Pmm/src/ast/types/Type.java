package ast.types;

import ast.ASTNode;
import ast.expressions.Variable;

import java.util.List;

public interface Type extends ASTNode {

    public Type arithmetic(Type t);

    public Type canBeCast(Type t);

    public Type comparison(Type t);

    public Type dot(String name);

    public int getSize();

    public boolean isBuiltInType();

    public boolean isLogical();

    public Type unaryMinus();

    public Type unaryNegate();

    public Type logical(Type t);

    public Type parenthesis(List<Type> types);

    public boolean promotesTo(Type t);

    public Type squareBrackets(Type t);
}
