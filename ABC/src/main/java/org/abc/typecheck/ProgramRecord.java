package org.abc.typecheck;

import java.util.ArrayList;
import java.util.List;

public class ProgramRecord extends Record {
    private List<ClassRecord> classes = new ArrayList<ClassRecord>();

    public ProgramRecord(String identifie, String types) {
        super(identifie, types);
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        String classes1 = "";
        for (int i = 0; i < classes.size(); i++)
            classes1 = classes1 + classes.get(i).toString1();

        return "ROOT" + "	" + classes1;
    }

}
