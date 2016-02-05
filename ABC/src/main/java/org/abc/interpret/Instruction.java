package org.abc.interpret;

import java.io.Serializable;

public class Instruction implements ICodes, Serializable {
    // private static int code = 0;
    private Object argument;

    private int code;

    public Instruction(int a, Object b) {
        setCode(a);
        setArgument(b);
    }

    public void setArgument(Object argument) {
        this.argument = argument;
    }

    public Object getArgument() {
        return argument;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String toString() {
        if (code == ICONST) {
            return "ICONST" + " " + argument.toString() + " Code" + code;
        } else if (code == ILOAD) {
            return "ILOAD" + " #" + argument.toString();
        } else if (code == ISTORE) {
            return "ISTORE" + " #" + argument.toString();
        } else if (code == IADD) {
            return "IADD" + " " + argument.toString();
        } else if (code == IMULT) {
            return "IMULT" + " " + argument.toString();
        } else if (code == ISUB) {
            return "ISUB" + " " + argument.toString();
        } else if (code == ILT) {
            return "ILT" + " " + argument.toString();
        } else if (code == IAND) {
            return "IAND" + " " + argument.toString();
        } else if (code == INOT) {
            return "INOT" + " " + argument.toString();
        } else if (code == GOTO) {
            return "GOTO" + " " + argument;
        } else if (code == IF_FALSE) {
            return "IF_FALSE" + " " + argument;
        } else if (code == INVOKEVIRTUAL) {
            return "INVOKEVIRTUAL" + " " + argument.toString();
        } else if (code == RETURN) {
            return "RETURN" + " " + argument.toString();
        } else if (code == PRINT) {
            return "PRINT" + " " + argument.toString();
        } else if (code == STOP) {
            return "STOP" + " " + argument.toString();
        } else if (code == IOR) {
            return "IOR" + " " + argument.toString();
        } else
            return null;
    }
}
