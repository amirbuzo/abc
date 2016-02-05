package org.abc.test;

class testArray {

    public static void main(String[] args) {
        System.out.println(new Amir5().zx());
    }
}

class Amir5 {

    int[] b;

    public int zx() {
        b = new int[9];
        b[7] = 7;
        b[8] = b[new f().g(3)];

        return b[8];
    }

    public int[] e() {
        int[] a;
        a = new int[9];
        return a;
    }

}

class f {

    public int g(int i) {
        return 7;
    }

}