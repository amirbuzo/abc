package org.abc.test;

class test1 {

    public static void main(String[] args) {
        // Prints an expression
        System.out.println(new Amir().testBoolean());
    }
}

class Amir {
    // boolean variables
    boolean x;

    boolean y;

    boolean z;

    boolean c;

    boolean d;

    boolean b;

    int e;

    Amir1 amir;

    public int testBoolean() {
        x = true;
        y = true;
        z = false;
        c = true;
        b = false;
        e = this.testBoolean();
        this.testBoolean();
        // new Amir1().testBoo();
        return 1;
    }

    public void testBoolean2() {
        x = true;
        y = true;
        z = false;
        c = true;
        b = false;
        // e = this.testBoolean();
        // amir.testBoo(1);
        // new Amir1().testBoo();
    }

}

class Amir1 {
    boolean x;

    boolean y;

    boolean z;

    boolean c;

    boolean d;

    boolean b;

    public void testBoo(int i) {
    }

}
