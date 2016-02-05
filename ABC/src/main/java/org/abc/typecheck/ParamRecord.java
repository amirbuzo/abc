package org.abc.typecheck;

public class ParamRecord extends Record {

    public ParamRecord(String identifie, String types) {
        super(identifie, types);
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Param " + identifier + " Type " + type;
    }

}
