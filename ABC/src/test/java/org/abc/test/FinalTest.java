package org.abc.test;

class FinalTest {

    public static void main(String[] args) {
        System.out.println(new Final().testAssigment(1));
    }
}

class Final {
    int first;

    int second;

    int third;

    int b;

    int c;

    int d;

    int a;

    boolean v1;

    boolean v2;

    public int testAssigment(int i) {
        first = 1;
        second = first + 2;
        first = 1 + first;
        second = first - 1;
        third = first + 3 * second;
        System.out.println(first + second + third);

        b = a + 1;
        c = a + 3 * b;
        d = (a + b) * (a - b);
        v2 = true;
        v1 = 8 < a + 1;
        v2 = 4 < a && 5 < a;

        System.out.println(new ff().testStatement());

        return 0;

    }

}

class ff {

    int n;

    int fac;

    int count;

    int fib;

    int prev;

    int prevPrev;

    public int testStatement() {
        count = 1;
        fac = 1;
        n = 100;
        while (count < n) {
            count = count + 1;
            fac = fac * count;
        }
        // Compute fibonacci(n)
        if (n < 2) {
            count = 2;
            prev = 1;
            prevPrev = 1;
            while (count < n) {
                fib = prev + prevPrev;
                prevPrev = prev;
                prev = fib;
                count = count + 1;
            }
        } else {
            fib = 1;
        }

        if (fib < 1) {
            System.out.println(fib);
        } else {

        }

        return 8;

    }

}