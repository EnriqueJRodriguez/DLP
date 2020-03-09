package ast;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.List;

public class ErrorHandler {

    private List<ErrorType> errors;
    private static ErrorHandler staticInstance;

    public ErrorHandler(){}

    public static ErrorHandler getInstance() {
        if (staticInstance == null) {
            staticInstance = new ErrorHandler();
        }
        return staticInstance;
    }

    public boolean anyError(){
        if(errors.isEmpty()){
            return false;
        } else{
            return true;
        }
    }

    public void addError(ErrorType error){
        errors.add(error);
    }

    public void showErrors(PrintStream out){
        for (ErrorType e : errors) {
            out.println(e);
        }
    }
}
