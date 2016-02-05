// A test program for TinyJava
package org.abc.test;

class Sum {
    public static void main(String[] a) {
        System.out.println(new Teste().sum(10));
    }
}

class Teste {
    public int sum(int num) {
        int sum;
        sum = 0;
        while (0 < num) {
            sum = sum + num;
            num = num - 1;
        }
        return sum;
    }
}