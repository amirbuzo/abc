package org.abc.interpret;

public class Interpreter {

    public static void main(String[] args) {
        String file;

        if (args == null) {
            file = args[0];
        } else {
            file = "KOTI.tjc";
        }

        // int x = file.lastIndexOf("//");
        // file = file.substring(x+2);

        // The file .tjc to be executed should be in the same folder with other
        // classes.

        System.out.println("CODE EXECUTION " + file
                + "\n__________________________________________");
        StackMachine interpreter = new StackMachine(file);
        interpreter.execute();
    }

    // public String removeFirstLast(String st)
    // {
    // return st.substring(1, st.length()-1);
    // }

}
