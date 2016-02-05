package org.abc.compile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import org.abc.interpret.ClassFile;


public class ObjectReader {

    private ObjectInputStream input;

    ObjectReader(String filename) {

        try {
            input = new ObjectInputStream(new FileInputStream(filename));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Invalid File Name (Read)",
                    "File " + filename + " Not Found",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public ClassFile getObjectFromFile() throws EOFException {

        ClassFile c = null;
        try {
            Object obj = input.readObject();

            if (obj instanceof ClassFile) {
                c = (ClassFile) obj;
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Unable to create Object while reading from file",
                    e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            if (e instanceof EOFException)
                throw (EOFException) e;
            else
                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage(),
                        "Abnormal situation while reading the Object from the file",
                        JOptionPane.ERROR_MESSAGE);
        }
        return c;

    }

    public void close() {

        try {
            input.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error closing file",
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
