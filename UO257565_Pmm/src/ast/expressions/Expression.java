package ast.expressions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {

    public Type getType();

    public void setType(Type type);

    public boolean getLValue();

    public void setLValue(boolean lvalue);
}
