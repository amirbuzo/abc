package org.abc.compile;

import java.io.EOFException;

import org.abc.interpret.ClassFile;


public class ClassRepository {
    private ClassFile classfile;

    private String nameOfFile;

    public ClassRepository(String nameOfFil) {
        nameOfFile = nameOfFil;
        read();
    }

    private void read() {
        ObjectReader read = new ObjectReader(nameOfFile);
        try {
            classfile = read.getObjectFromFile();
        } catch (EOFException e) {
            read.close();
            e.printStackTrace();
        }
        read.close();
    }

    public void print() {
        System.out.println(classfile);
    }

    public ClassFile getClassFile() {
        return classfile;
    }
}
