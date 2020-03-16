package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition implements Statement, Definition {

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VariableDefinition other = (VariableDefinition) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        return true;
    }
}
