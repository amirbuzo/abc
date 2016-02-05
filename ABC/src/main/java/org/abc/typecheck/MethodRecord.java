package org.abc.typecheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodRecord extends Record {
    private List<ParamRecord> paramList = new ArrayList<ParamRecord>();

    private List<BarRecord> varList = new ArrayList<BarRecord>();

    private Map<String, Record> records = new HashMap<String, Record>(); // Symbol
                                                                         // to
                                                                         // Record
                                                                         // map

    public MethodRecord(String identifie, String types) {
        super(identifie, types);
        // TODO Auto-generated constructor stub
    }

    public void setParamList(List<ParamRecord> paramList) {
        this.paramList = paramList;
    }

    public int getParamListSize() {
        return this.paramList.size();
    }

    public List<ParamRecord> getParamList() {
        return paramList;
    }

    public void setArgList(List<BarRecord> argList) {
        this.varList = argList;
    }

    public void addRecords(Record rec, String key) {
        if (rec instanceof BarRecord) {
            this.varList.add((BarRecord) rec);
            this.records.put(key, rec);
        } else if (rec instanceof ParamRecord) {
            this.paramList.add((ParamRecord) rec);
            this.records.put(key, rec);
        }
    }

    public List<BarRecord> getArgList() {
        return varList;
    }

    public String toString1() {
        String vars = "";
        for (int i = 0; i < varList.size(); i++)
            vars = vars + "\n			" + varList.get(i).toString() + "";

        String param = "";
        for (int i = 0; i < paramList.size(); i++)
            param = param + "\n			" + paramList.get(i).toString() + "";

        String x = "Method " + identifier + " Type " + type + "";// +param+"\n			"+vars;
        if (paramList.size() > 0) {
            x = x + param;
        }
        if (varList.size() > 0) {
            x = x + vars;
        }
        return x;
    }

    public String toString() {
        return "Method " + identifier + " Type " + type;
    }

    public List<Record> getLocals() {
        // TODO Auto-generated method stub
        List<Record> list = new ArrayList<Record>();
        for (int i = 0; i < paramList.size(); i++)
            list.add(paramList.get(i));
        for (int i = 0; i < varList.size(); i++)
            list.add(varList.get(i));

        return list;
    }

}
