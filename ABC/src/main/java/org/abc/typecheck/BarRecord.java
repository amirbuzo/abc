package org.abc.typecheck;

public class BarRecord extends Record {

    public BarRecord(String identifie, String types) {
        super(identifie, types);
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "var " + identifier + " Type " + type;
    }

    public String getType() {
        return type;
    }

}
