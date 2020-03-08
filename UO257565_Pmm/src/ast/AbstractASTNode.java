package ast;

public abstract class AbstractASTNode implements ASTNode{
    /**
     * Abstract class that simplifies the handling of subclasses that must implement the ASTNode interface
     */
    private int line;
    private int column;

    public AbstractASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
