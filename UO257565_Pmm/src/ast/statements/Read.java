package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class Read extends AbstractStatement {

    private List<Expression> expressions;

    public Read(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }
}
