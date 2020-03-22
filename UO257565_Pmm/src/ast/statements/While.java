package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameter) {
        return visitor.visit(this, parameter);
    }
}
