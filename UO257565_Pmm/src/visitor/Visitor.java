package visitor;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP,TR> {

    public TR visit(Program p, TP parameter);

    public TR visit(FieldDefinition fild, TP parameter);

    public TR visit(FunctionDefinition fund, TP parameter);

    public TR visit(VariableDefinition vd, TP parameter);

    public TR visit(Arithmetic a, TP parameter);

    public TR visit(ArrayAccess aa, TP parameter);

    public TR visit(Cast c, TP parameter);

    public TR visit(CharLiteral cl, TP parameter);

    public TR visit(Comparison com, TP parameter);

    public TR visit(FieldAccess fila, TP parameter);

    public TR visit(IntLiteral il, TP parameter);

    public TR visit(Logical l, TP parameter);

    public TR visit(RealLiteral rl, TP parameter);

    public TR visit(UnaryMinus um, TP parameter);

    public TR visit(UnaryNegation un, TP parameter);

    public TR visit(Variable v, TP parameter);

    public TR visit(Assignment ass, TP parameter);

    public TR visit(FunctionInvocation funi, TP parameter);

    public TR visit(IfStatement ifs, TP parameter);

    public TR visit(Read red, TP parameter);

    public TR visit(ReturnStatement rts, TP parameter);

    public TR visit(While whl, TP parameter);

    public TR visit(Write wrt, TP parameter);

    public TR visit(ArrayType arrt, TP parameter);

    public TR visit(Char cht, TP parameter);

    public TR visit(ErrorType err, TP parameter);

    public TR visit(FunctionType funt, TP parameter);

    public TR visit(Int intt, TP parameter);

    public TR visit(Real ret, TP parameter);

    public TR visit(Struct stt, TP parameter);

    public TR visit(VoidType vdt, TP parameter);

}
