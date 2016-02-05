package org.abc.interpret;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.abc.typecheck.Record;


public class Method implements Serializable {
    private List<String> variables;// = new ArrayList();

    private List<Instruction> instruction;// = new ArrayList();

    private String nameOfMethod;

    private String className;

    private int counter;

    public Method() {
        variables = new ArrayList<String>();
        instruction = new ArrayList<Instruction>();
        counter = 0;
    }

    public Method(String nameOfMetho) {
        nameOfMethod = nameOfMetho;
        variables = new ArrayList<String>();
        instruction = new ArrayList<Instruction>();
    }

    public void setName(String name) {
        this.nameOfMethod = name;
    }

    public void setClassName(String name) {
        this.className = name;
    }

    public void print() {
        System.out.println("Method	" + className + "." + nameOfMethod
                + variables);
        for (int i = 0; i < instruction.size(); i++) {
            System.out.println("	" + i + "	" + instruction.get(i).toString());
            // System.out.print(instruction.get(i).toString()+ "\n");
        }
    }

    public String toString() {
        String a = "Method	" + className + "." + nameOfMethod + variables
                + "\n";
        for (int i = 0; i < instruction.size(); i++) {
            a = a + "	" + i + "	" + instruction.get(i).toString() + "\n";
            // System.out.print(instruction.get(i).toString()+ "\n");
        }
        return a;
    }

    public int getIndexOf(String lhs) {

        int e = -1;// TODO Auto-generated method stub
        for (int i = 0; i < variables.size(); i++) {
            if (variables.get(i).equals(lhs)) {
                e = i;
                break;
            }
        }
        return e;
    }

    public Instruction getInstruction(int gotolabel) {
        // TODO Auto-generated method stub
        return this.instruction.get(gotolabel);
    }

    public int getLastInstruction() {
        // TODO Auto-generated method stub
        return instruction.size();
    }

    public void addInstruction(int ifFalse, Object object) {
        // TODO Auto-generated method stub
        instruction.add(new Instruction(ifFalse, object));
    }

    public void addVariableList(List<Record> locals) {
        // TODO Auto-generated method stub
        for (int i = 0; i < locals.size(); i++)
            variables.add(locals.get(i).getIdentifier());
    }

    public void updateInstruction(int ifIstruction, int gotoIstruction) {
        // TODO Auto-generated method stub
        // System.out.println("AmirifIstruction" + ifIstruction);
        this.instruction.get(ifIstruction).setArgument(gotoIstruction);
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return this.counter;
    }

    public Instruction nextInstruction() {
        // TODO Auto-generated method stub
        try {
            Instruction in = this.instruction.get(counter);
            counter++;
            return in;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void storeVariable(int storeAt, Object value) {
        this.variables.remove(storeAt);
        this.variables.add(storeAt, value.toString());
    }

    public Object loadVariable(int loadAt) {
        return this.variables.get(loadAt);
    }

}
