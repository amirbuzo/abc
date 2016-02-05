package org.abc.interpret;

public interface ICodes {
    public static final int ILOAD = 1;

    public static final int ICONST = 2;

    public static final int ISTORE = 3;

    public static final int IADD = 4;

    public static final int IMULT = 5;

    public static final int ISUB = 6;

    public static final int ILT = 7;

    public static final int IAND = 8;

    public static final int INOT = 9;

    public static final int GOTO = 10;

    public static final int IF_FALSE = 11;

    public static final int INVOKEVIRTUAL = 12;

    public static final int RETURN = 13;

    public static final int PRINT = 14;

    public static final int STOP = 15;

    public static final int IOR = 16;

    public static final int IBT = 17;

    // iload #n Push integer value stored in local variable n.
    // iconst v Push integer value v.
    // istore #n Pop value v and store it in local variable n.
    // iadd Pop value v1, Pop value v2, Push v2 + v1.
    // imul Pop value v1, Pop value v2, Push v2 v1.
    // isub Pop value v1, Pop value v2, Push v2 v1.
    // ilt Pop value v1, Pop value v2, Push 1 if v2 < v1 else Push 0.
    // iand Pop value v1, Pop value v2, Push 0 if v1 v2 = 0 else Push 1.
    // inot Pop value v, Push 1 if v = 0 else Push 0.
    // goto i Jump to instruction i .
    // if false i Pop value v, if v = 0 jump to instruction i , else continue.
    // invokevirtual m Push current activation and switch to the method named m.
    // return Pop activation and continue.
    // print Pop value and print.
    // stop Execution completed.
}
