package visitor;

import ast.expressions.*;
import ast.statements.Assignment;
import ast.statements.Read;
import ast.types.ErrorType;

public class LValueVisitor extends AbstractVisitor<Void, Void>{

    @Override
    public Void visit(Arithmetic a, Void parameter) {
        super.visit(a, parameter);
        a.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess aa, Void parameter) {
        super.visit(aa, parameter);
        aa.setLValue(true);
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
    public Void visit(Cast c, Void parameter) {
        super.visit(c, parameter);
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral cl, Void parameter) {
        super.visit(cl, parameter);
        cl.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparison com, Void parameter) {
        super.visit(com, parameter);
        com.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fila, Void parameter) {
        super.visit(fila, parameter);
        fila.setLValue(true);
        return null;
    }

    @Override
    public Void visit(IntLiteral il, Void parameter) {
        super.visit(il, parameter);
        il.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logical l, Void parameter) {
        super.visit(l, parameter);
        l.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RealLiteral rl, Void parameter) {
        super.visit(rl, parameter);
        rl.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus um, Void parameter) {
        super.visit(um, parameter);
        um.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNegation un, Void parameter) {
        super.visit(un, parameter);
        un.setLValue(false);
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

    @Override
    public Void visit(Variable v, Void parameter) {
        super.visit(v, parameter);
        v.setLValue(true);
        return null;
    }
}
