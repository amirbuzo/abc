package org.abc.interpret;

public class Activation {
    private Method method;

    private int counter;

    public Activation(Method m, int c) {
        method = m;
        counter = c;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Method getMethod() {
        return method;

    }
}
