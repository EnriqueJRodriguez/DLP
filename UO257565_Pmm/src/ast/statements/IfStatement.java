package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class IfStatement extends AbstractStatement {

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;
    private Expression condition;

    public IfStatement(int line, int column, List<Statement> ifStatements, List<Statement> elseStatements, Expression condition) {
        super(line, column);
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
        this.condition = condition;
    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Statement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Statement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
