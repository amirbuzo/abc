// A test program for TinyJava that computes the faculty
// and the Fibonacci number for two different integers.
// Correct answers are 120 and 55.
package org.abc.test;

class FacFib {
    public static void main(String[] a) {
        System.out.println(new FacFibImpl().compute(5, 6, 7));
    }
}

class FacFibImpl {
    public int compute(int first, int second, int z) {
        int fac;
        int fib;
        int returnValue;

        System.out.println(first);
        System.out.println(second);
        System.out.println(z);

        fac = this.computeFac(first);

        if (1 < first) {

            fib = this.computeFib(second);
            // System.out.println(fib);
            returnValue = 1;
        } else {
            returnValue = 0;
        }
        return returnValue;
    }

    public int computeFac(int num) {
        int fac;

        System.out.println(num);
        if (num < 1)
            fac = 1;
        else
            fac = num * (this.computeFac(num - 1));

        System.out.println(fac);
        return fac;
    }

    public int computeFib(int num) {
        int f0;
        int f1;
        int fib;
        int i;

        f0 = 0;
        f1 = 1;
        fib = num;

        i = 1;
        while (i < num) {
            fib = f1 + f0;
            f0 = f1;
            f1 = fib;
            i = i + 1;
        }
        return fib;
    }

}