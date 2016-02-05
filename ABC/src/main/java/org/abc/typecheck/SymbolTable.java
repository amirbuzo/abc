package org.abc.typecheck;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Scope root; // Root of scope tree

    private Scope current; // Current scope

    private HashMap<String, ClassRecord> classmap;// = new HashMap<String,
                                                  // ClassRecord>();

    public SymbolTable() {
        root = new Scope(null);
        current = root;
        classmap = new HashMap<String, ClassRecord>();
    }

    public void enterScope() {
        current = current.nextChild();
    }

    public void exitScope() {
        current = current.getParent();
    }

    public void put(String key, Record item) {
        current.put(key, item);
        if (item instanceof ClassRecord)
            classmap.put(key, (ClassRecord) item);
    }

    public Record lookup(String key) {
        return current.lookup(key);
    }

    public void printTable() {
        root.printScope();
    }

    public void resetTable() {
        root.resetScope();
    }

    public Scope returnCurrentScope() {
        return current;
    }

    public Map<String, Record> getCurrentRecord() {
        return current.getCurrentRecord();
    }

    public Record checkCurrentRecord(String key) {
        if (current.getCurrentRecord().containsKey(key)) // Check if in current
                                                         // scope
        {
            return current.getCurrentRecord().get(key);
        } else
            return null;
    }

    public HashMap<String, ClassRecord> getClasses() {
        return this.classmap;
    }

    public ClassRecord getClass(String clas) {
        return this.classmap.get(clas);
    }
}
