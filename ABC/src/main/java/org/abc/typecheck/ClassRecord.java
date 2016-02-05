package org.abc.typecheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRecord extends Record {

    private List<MethodRecord> methodList = new ArrayList<MethodRecord>();

    private List<BarRecord> varList = new ArrayList<BarRecord>();

    private Map<String, Record> records = new HashMap<String, Record>(); // Symbol
                                                                         // to
                                                                         // Record
                                                                         // map

    public ClassRecord(String identifie, String types) {
        super(identifie, types);
        // TODO Auto-generated constructor stub
    }

    public void setMethodList(List<MethodRecord> methodList) {
        this.methodList = methodList;
    }

    public List<MethodRecord> getMethodList() {
        return methodList;
    }

    public void setParamList(List<BarRecord> paramList) {
        this.varList = paramList;
    }

    public List<BarRecord> getParamList() {
        return varList;
    }

    public void putMethod(String mName, Record currentRecord) {
        // TODO Auto-generated method stub
        if (currentRecord instanceof BarRecord) {
            this.varList.add((BarRecord) currentRecord);
            records.put(mName, currentRecord);
        } else if (currentRecord instanceof MethodRecord) {
            this.methodList.add((MethodRecord) currentRecord);
            this.records.put(mName, currentRecord);

        }
    }

    public Record checkMethod(String key) {
        return records.get(key);
    }

    public String toString1() {
        String method = "";
        for (int i = 0; i < methodList.size(); i++)
            method = method + "			" + methodList.get(i).toString() + "\n";

        String param = "";
        for (int i = 0; i < varList.size(); i++)
            param = param + "			" + varList.get(i).toString() + "\n";

        return "Class " + identifier + " Type " + type + "\n		Variable List\n"
                + param + "\n		Method List\n" + method;

    }

    public String toString() {
        return "Class " + identifier + " Type " + type;
    }
}
