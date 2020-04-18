package ast.definitions;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {
    public Type getType();
    public String getName();
    public void setName(String name);
    public int getScope();
    public void setScope(int scope);
}
