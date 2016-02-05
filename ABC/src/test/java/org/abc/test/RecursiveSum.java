package org.abc.test;

class RecursiveSum {
    public static void main(String[] a) {
        System.out.println(new Test().sum(10));
    }
}

class Test {
    public int sum(int num) {
        int sum;
        sum = 0;
        if (num < 2)
            sum = 1;
        else
            sum = num + this.sum(num - 1);

        return sum;
    }
}
