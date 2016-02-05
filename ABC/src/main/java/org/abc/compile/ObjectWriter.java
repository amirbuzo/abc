package org.abc.compile;

/*
 * Author: AMIR BUZO 
 *This class was implemented to realize object persistency.
 *The idea was taken by a project that I have realized 4 years ago.
 * 
 * */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class ObjectWriter {

    private ObjectOutputStream output;

    ObjectWriter(String filename, Object c) {

        try {
            output = new ObjectOutputStream(new FileOutputStream(filename));
            putObjectToFile(c);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File " + filename
                    + " Not Found", "Invalid File Name (Write)",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void putObjectToFile(Object c) {

        try {
            output.writeObject(c);
            output.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Unable to write Object while writing to file",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public void close() {

        try {
            output.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error closing file",
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
