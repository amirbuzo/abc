package org.abc.interpret;

import java.io.File;
import java.util.Stack;

import org.abc.compile.ClassRepository;


public class StackMachine implements ICodes {
    private Stack<Object> dataStack;// = new Stack();

    private Stack<Activation> activationStack;// = new Stack();

    private ClassFile clasfile;

    private ClassRepository classRepo;

    private int code = 0;

    private Instruction instruction;

    private String fileName;

    private Method method;

    private Activation currentActivation;

    public StackMachine(String file) {
        dataStack = new Stack<Object>();
        activationStack = new Stack<Activation>();
        classRepo = new ClassRepository(file);
        clasfile = classRepo.getClassFile();
        fileName = file.replace(".tjc", "");
    }

    public StackMachine(File file) {
        dataStack = new Stack<Object>();
        activationStack = new Stack<Activation>();
        classRepo = new ClassRepository(file.getName());
        clasfile = classRepo.getClassFile();
        fileName = file.getName().replace(".tjc", "");
    }

    public void execute() {
        method = clasfile.getMethod(fileName + ".kryesore");
        while (code != STOP) {
            instruction = method.nextInstruction();

            code = instruction.getCode();

            Object arg = instruction.getArgument();

            // System.out.println(dataStack);
            switch (code) {

            case ICONST: // push integer value arg
                // System.out.println(arg.toString());
                dataStack.push(arg.toString());
                break;
            case IADD: // v1 = pop(), v2 = pop(), push(v1+v2)
                Object x1 = dataStack.pop();
                Object x2 = dataStack.pop();
                if ((x1.toString().startsWith("\""))) {
                    dataStack.push("\"" + check(x2.toString())
                            + check(x1.toString()) + "\"");
                } else if ((x2.toString().startsWith("\""))) {
                    dataStack.push("\"" + check(x2.toString())
                            + check(x1.toString()) + "\"");
                } else if (x2.toString().equals("true")) {
                    dataStack.push("\"vertete" + check(x1.toString()) + "\"");
                } else if (x2.toString().equals("false")) {
                    dataStack.push("\"fals" + check(x1.toString()) + "\"");
                } else if (x1.toString().equals("false")) {
                    dataStack.push("\"" + check(x2.toString()) + "fals\"");
                } else if (x1.toString().equals("true")) {
                    dataStack.push("\"" + check(x2.toString()) + "vertete\"");
                } else {
                    dataStack.push(Integer.parseInt(x2.toString())
                            + Integer.parseInt(x1.toString()));
                }
                break;
            case GOTO: // pc = arg
                method.setCounter(Integer.parseInt(arg.toString()));
                break;
            case IF_FALSE: // v = pop(), let pc = arg if v=0
                if (Boolean.parseBoolean(dataStack.pop().toString()) == false) {
                    method.setCounter(Integer.parseInt(arg.toString()));
                }
                break;
            case IMULT:
                dataStack.push(Integer.parseInt(dataStack.pop().toString())
                        * Integer.parseInt(dataStack.pop().toString()));
                break;
            case ISUB:
                int x = Integer.parseInt(dataStack.pop().toString());
                int y = Integer.parseInt(dataStack.pop().toString());
                dataStack.push(y - x);
                break;
            case ILT:
                int v1 = Integer.parseInt(dataStack.pop().toString());
                int v2 = Integer.parseInt(dataStack.pop().toString());
                if (v2 < v1)
                    dataStack.push(true);
                else
                    dataStack.push(false);
                break;
            case IBT:
                int v7 = Integer.parseInt(dataStack.pop().toString());
                int v6 = Integer.parseInt(dataStack.pop().toString());
                if (v6 > v7)
                    dataStack.push(true);
                else
                    dataStack.push(false);
                break;
            case IAND:
                if (Boolean.parseBoolean(dataStack.pop().toString())
                        && (Boolean.parseBoolean(dataStack.pop().toString())))
                    dataStack.push(false);
                else
                    dataStack.push(true);
                break;
            case IOR:
                if (Boolean.parseBoolean(dataStack.pop().toString())
                        || Boolean.parseBoolean(dataStack.pop().toString()))
                    dataStack.push(true);
                else
                    dataStack.push(false);
                break;
            case INVOKEVIRTUAL:
                int c = method.getCounter();
                activationStack.push(new Activation(method, c));
                method = this.clasfile.getMethod(arg.toString());
                method.setCounter(0);
                break;
            case STOP:
                // System.exit(0);
                break;
            case RETURN:
                currentActivation = activationStack.pop();
                method = currentActivation.getMethod();
                method.setCounter(currentActivation.getCounter());
                break;
            case PRINT:
                String z = dataStack.pop().toString();
                if (z.toString().startsWith("\"")
                        && z.toString().endsWith("\""))
                    System.out.println(z.substring(1, z.length() - 1));
                else
                    System.out.println(check(z));
                break;
            case ILOAD:
                int loadAt = (Integer) arg;
                dataStack.push(method.loadVariable(loadAt));
                break;
            case ISTORE:
                int args = (Integer) arg;
                method.storeVariable(args, dataStack.pop());
                break;
            case INOT:
                if (Boolean.parseBoolean(dataStack.pop().toString()))
                    dataStack.push(true);
                else
                    dataStack.push(false);
                break;
            }
        }
    }

    public String check(String x) {
        if (x.toString().startsWith("\"") && x.toString().endsWith("\""))
            return x.substring(1, x.length() - 1);
        else if (x.toString().equals("true"))
            return "vertete";
        else if (x.toString().equals("false"))
            return "fals";

        return x;
    }
}
