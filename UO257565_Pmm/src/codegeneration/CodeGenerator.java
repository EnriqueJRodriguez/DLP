package codegeneration;

import ast.types.Char;
import ast.types.Int;
import ast.types.Real;
import ast.types.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    private int label;

    public CodeGenerator(String input, String output){
        label = 0;
        try {
            out = new PrintWriter(output);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        this.source(input);
    }

    public int getLabel() {
        return label++;
    }

    public void label(String label) {
        out.println(label + ":");
        out.flush();
    }

    private void source(String input) {
        out.println("\n#source\t\"" + input + "\"");
        out.flush();
    }

    public void mainInvocation() {
        out.println("\n' Invocation to the main function");
        out.println("call main");
        out.println("halt");
        out.flush();
    }

    public void line(int line) {
        out.println("\n#line\t" + line + "");
        out.flush();
    }

    public void comment(String comment) {
        out.println("\t' * " + comment);
        out.flush();
    }

    public void enter(int index) {
        out.println("\tenter\t" + index);
        out.flush();
    }

    public void ret(int typeSize, int localVariablesBytes, int parametersSize) {
        out.println("\tret\t" + typeSize + ", "+ localVariablesBytes + ", "+ parametersSize);
        out.flush();
    }

    public void store(char suffix) {
        out.println("\tstore" + suffix);
        out.flush();
    }

    public void load(char suffix) {
        out.println("\tload" + suffix);
        out.flush();
    }

    public void out(char suffix) {
        out.println("\tout" + suffix);
        out.flush();
    }

    public void in(char suffix) {
        out.println("\tin" + suffix);
        out.flush();
    }

    public void pusha(int a) {
        out.println("\tpusha\t" + a);
        out.flush();
    }

    public void pushb(char b) {
        out.println("\tpushb\t" + (int) b);
        out.flush();
    }

    public void pushf(double f) {
        out.println("\tpushf\t" + f);
        out.flush();
    }

    public void pushi(int i) {
        out.println("\tpushi\t" + i);
        out.flush();
    }

    public void pushBp() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void arithmetic(String operator, char suffix) {
        switch(operator) {
            case "+":
                add(suffix);
                break;
            case "-":
                sub(suffix);
                break;
            case "*":
                mul(suffix);
                break;
            case "/":
                div(suffix);
                break;
            case "%":
                mod(suffix);
                break;
        }
    }

    public void compare(String operator, char suffix) {
        switch(operator) {
            case ">":
                gt(suffix);
                break;
            case "<":
                lt(suffix);
                break;
            case ">=":
                ge(suffix);
                break;
            case "<=":
                le(suffix);
                break;
            case "==":
                eq(suffix);
                break;
            case "!=":
                ne(suffix);
                break;
        }
    }

    public void logical(String operator) {
        switch(operator) {
            case "&&":
                and();
                break;
            case "||":
                or();
                break;
        }
    }

    public void add(char suffix) {
        out.println("\tadd" + suffix);
        out.flush();
    }

    public void sub(char suffix) {
        out.println("\tsub" + suffix);
        out.flush();
    }

    public void mul(char suffix) {
        out.println("\tmul" + suffix);
        out.flush();
    }

    public void div(char suffix) {
        out.println("\tdiv" + suffix);
        out.flush();
    }

    public void mod(char suffix) {
        out.println("\tmod" + suffix);
        out.flush();
    }

    public void gt(char suffix) {
        out.println("\tgt" + suffix);
        out.flush();
    }

    public void lt(char suffix) {
        out.println("\tlt" + suffix);
        out.flush();
    }

    public void ge(char suffix) {
        out.println("\tge" + suffix);
        out.flush();
    }

    public void le(char suffix) {
        out.println("\tle" + suffix);
        out.flush();
    }

    public void eq(char suffix) {
        out.println("\teq" + suffix);
        out.flush();
    }

    public void ne(char suffix) {
        out.println("\tne" + suffix);
        out.flush();
    }

    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public void castTo(Type original, Type newType) {
        if(original.getClass() == newType.getClass())
            return;
        if(original instanceof Char) {
            b2i();
            if(newType instanceof Real)
                i2f();
        }
        if (original instanceof Int) {
            if(newType instanceof Real)
                i2f();
            else if (newType instanceof Char)
                i2b();
        }
        if (original instanceof Real) {
            f2i();
            if (newType instanceof Char)
                i2b();
        }
    }

    public void b2i() {
        out.println("\tb2i");
        out.flush();
    }

    public void i2f() {
        out.println("\ti2f");
        out.flush();
    }

    public void f2i() {
        out.println("\tf2i");
        out.flush();
    }

    public void i2b() {
        out.println("\ti2b");
        out.flush();
    }

}
