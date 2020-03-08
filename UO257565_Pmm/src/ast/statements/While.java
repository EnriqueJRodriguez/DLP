package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class While extends AbstractStatement {

    private List<Statement> statements;
    private Expression condition;

    public While(int line, int column,List<Statement> statements, Expression condition) {
        super(line, column);
        this.statements = statements;
        this.condition = condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
