package visitor;

import ast.expressions.Arithmetic;
import ast.expressions.ArrayAccess;
import ast.expressions.Cast;
import ast.expressions.FieldAccess;
import ast.statements.Assignment;
import ast.statements.Read;
import ast.types.ErrorType;

public class LValueVisitor extends AbstractVisitor<Void, Void>{

    @Override
    public Void visit(Arithmetic a, Void parameter) {
        a.setLValue(false);
        super.visit(a, parameter);
        return null;
    }

    @Override
    public Void visit(ArrayAccess aa, Void parameter) {
        aa.setLValue(true);
        super.visit(aa, parameter);
        return null;
    }

    @Override
    public Void visit(Assignment ass, Void parameter) {
        super.visit(ass, parameter);
        if(!ass.getLeft().getLValue()){
            new ErrorType(ass.getLine(), ass.getColumn(), "The expression "+
                    ass.getLeft() + " can't be the left part of an assignment");
        }
        return null;
    }

    @Override
    public Void visit(FieldAccess fila, Void parameter) {
        fila.setLValue(true);
        super.visit(fila, parameter);
        return null;
    }

    @Override
    public Void visit(Read red, Void parameter) {
        super.visit(red, parameter);
        if(!red.getExpression().getLValue()){
            new ErrorType(red.getLine(), red.getColumn(), "The expression "+
                    red.getExpression() + " can't be read as an input");
        }
        return null;
    }
}
