package org.abc.interpret;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public class ClassFile implements Serializable {

    private HashMap<String, Method> mapMethods;// = new HashMap();

    private String nameFile;

    public ClassFile(String nameOfFile) {
        mapMethods = new HashMap<String, Method>();
        nameFile = nameOfFile;
    }

    public void addMethod(String key, Method a) {
        mapMethods.put(key, a);
    }

    public Method getMethod(String key) { // Method m = new Method();
                                          // m =
        return mapMethods.get(key);
        // return m;
    }

    public String getNameFile() {
        return this.nameFile;
    }

    public String toString() {
        String codeisntruction = "";
        Iterator<Method> i = mapMethods.values().iterator();
        while (i.hasNext()) {
            codeisntruction = codeisntruction + i.next().toString();
        }
        return codeisntruction;
    }

    public void print() {
        Iterator<Method> i = mapMethods.values().iterator();
        while (i.hasNext()) {
            i.next().print();
        }
    }

}
