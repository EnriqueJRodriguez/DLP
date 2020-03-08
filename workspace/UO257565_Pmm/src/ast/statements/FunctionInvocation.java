package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private List<Expression> parameters;
    private Variable variable;

    public FunctionInvocation(int line, int column, List<Expression> parameters, Variable variable) {
        super(line, column);
        this.parameters = parameters;
        this.variable = variable;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

}
