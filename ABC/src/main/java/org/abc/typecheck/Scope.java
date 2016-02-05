package org.abc.typecheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Scope {
    private int next = 0; // Next child to visit

    private Scope parent; // Parent scope

    private List<Scope> children = new ArrayList<Scope>(); // Children scopes

    private Map<String, Record> records = new HashMap<String, Record>(); // Symbol
                                                                         // to
                                                                         // Record
                                                                         // map

    public Scope(Scope parent1) {
        parent = parent1;
    }

    public Scope() {

    }

    public Scope nextChild() {
        // Creates new children on demand
        Scope nextC;
        if (next >= children.size()) {
            // Child does not exist
            nextC = new Scope(this); // ==> create new Scope
            children.add(nextC);
        } else // Child exists
        {
            nextC = children.get(next);
            // ==> visit child
        }
        next++;
        return nextC;
    }

    public Record lookup(String key) {
        // Iterator<Record> it= records.values().iterator();
        // while(it.hasNext())
        // {
        // System.out.println(it.next().toString());
        // }
        if (records.containsKey(key)) // Check if in current scope
        {
            return (Record) records.get(key);
        } else {
            // Move to enclosing/parent scope
            if (parent == null) {
                return null; // Identifier not in table
            } else {
                return parent.lookup(key);
            }
        }
    }

    public void resetScope() {
        // Must be called after each traversal
        next = 0;
        for (int i = 0; i < children.size(); i++)
            children.get(i).resetScope();
    }

    public void printScope() {
        this.print(this, "");
        // TODO Auto-generated method stub

    }

    private void print(Scope s, String a) {
        System.out.println(s.toStringRecords(a).toString());
        for (int i = 0; i < s.children.size(); i++) {
            a = a + "\t";
            print(s.children.get(i), a);
            a = a.replaceFirst("\t", "");
        }
    }

    public void put(String key, Record item) {
        // TODO Auto-generated method stub
        records.put(key, item);
    }

    public Scope getParent() {
        // TODO Auto-generated method stub
        return this.parent;
    }

    public String toStringRecords(String e) {
        String a = "";
        Iterator<Record> it = records.values().iterator();
        while (it.hasNext()) {
            a += "\n" + e + it.next().toString();
        }
        return a;
    }

    public String toString1() {
        return "next" + next;
    }

    public Map<String, Record> getCurrentRecord() {
        return records;
    }

}