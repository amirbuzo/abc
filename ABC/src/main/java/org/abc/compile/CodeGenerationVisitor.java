package org.abc.compile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import org.abc.interpret.ClassFile;
import org.abc.interpret.ICodes;
import org.abc.interpret.Method;
import org.abc.typecheck.ClassRecord;
import org.abc.typecheck.MethodRecord;
import org.abc.typecheck.Record;
import org.abc.typecheck.SymbolTable;
import org.antlr.runtime.tree.CommonTree;


public class CodeGenerationVisitor extends MJVisitor implements ICodes {
    private SymbolTable symTab;

    private Method currentMethod;

    private String currentClass;

    private ClassFile classfile;

    public CodeGenerationVisitor(SymbolTable a) {
        symTab = a;
    }

    public Object visitMethodDecl(CommonTree node) {
        currentMethod = new Method();
        String name = node.getChild(1).toString(); // Method name
        MethodRecord mrec = (MethodRecord) symTab.lookup(name);
        currentMethod.setClassName(currentClass);
        currentMethod.setName(name);
        List<Record> var = mrec.getLocals();
        currentMethod.addVariableList(var);
        symTab.enterScope();
        visitParamDeclList((CommonTree) node.getChild(2)); // generate
                                                           // ParamDeclList code
        visit((CommonTree) node.getChild(3)); // generate MethodBody code
        symTab.exitScope();

        classfile.addMethod(currentClass + "." + name, currentMethod);
        currentMethod = null;
        return null;
    }

    public Object visitParamDeclList(CommonTree node) {
        for (int i = node.getChildCount() - 1; i >= 0; i--) {
            // we store parameter when we call a method in reverse way in stack
            // and read them in the right order
            int index = currentMethod.getIndexOf(node.getChild(i).getChild(1).toString());
            currentMethod.addInstruction(ISTORE, index);
        }
        return null;
    }

    public Object visitClassDecl(CommonTree node) {
        String retType = (String) visit((CommonTree) node.getChild(0)).toString();
        ; // Return type
        String cName = node.getChild(0).getText(); // Class name
        currentClass = cName;
        symTab.enterScope(); // Enter method scope
        visit((CommonTree) node.getChild(1));// Visit Varlist
        visit((CommonTree) node.getChild(2)); // Visit MethodList
        symTab.exitScope();
        return null;
    }

    public Object visitVarDecl(CommonTree node) {

        String retType = (String) visit((CommonTree) node.getChild(0)).toString();
        ; // Return type

        String varName = node.getChild(1).getText(); // Method name

        return null;
    }

    public Object visitVarDeclInMethod(CommonTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            String retType = node.getChild(i).getChild(0).getChild(0).toString(); // Return
                                                                                  // type
            String varName = node.getChild(i).getChild(1).toString(); // Method
                                                                      // name
        }
        return null;
    }

    public Object visitFile(CommonTree node) {
        classfile = new ClassFile(node.getChild(0).getChild(0).toString());
        for (int i = 0; i < node.getChildCount(); i++) {
            symTab.enterScope();
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
            symTab.exitScope(); // Exit Program scope
        }
        this.writeToFile();
        saveClassFile();
        return null;
    }

    public Object visitMainClass(CommonTree node) {
        String cname = (String) visit((CommonTree) node.getChild(0)).toString(); // Return
                                                                                 // type
                                                                                 // or
                                                                                 // Identifier
        String mainClass1 = node.getChild(1).getText(); // Class name
        currentClass = cname;
        symTab.enterScope(); // Enter class scope
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
        }
        symTab.exitScope(); // Exit class scope
        return null;
    }

    public Object visitMainMethod(CommonTree node) {

        String main = (String) node.getChild(0).toString();
        String name = "kryesore";
        currentMethod = new Method();
        currentMethod.setName(name);
        currentMethod.setClassName(currentClass);
        symTab.enterScope();
        visitChildren(node);
        symTab.exitScope();
        currentMethod.addInstruction(STOP, "");
        classfile.addMethod(currentClass + "." + name, currentMethod);
        currentMethod = null;
        return null;
    }

    public SymbolTable getSymbolTable() {
        return symTab;
    }

    public Object visitMethodList(CommonTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            visit((CommonTree) node.getChild(i));
        }
        return null;
    }

    public Object visitParamList(CommonTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree child = (CommonTree) node.getChild(i).getChild(0).getChild(
                    0);
            String returnType = child.toString();
            child = (CommonTree) node.getChild(i).getChild(1);
            String nameparam = child.toString();
        }
        return null;
    }

    public ClassFile getClassFile() {
        return classfile;
    }

    public Object visitVarRef(CommonTree node) { // Only within expressions
        int index = currentMethod.getIndexOf(node.getChild(0).toString());
        currentMethod.addInstruction(ILOAD, index);
        return null;
    }

    public Object visitAssign(CommonTree node) {
        String lhs = node.getChild(0).getChild(0).getText(); // LHS name
        visit((CommonTree) node.getChild(1)); // Generate RHS code
        int index = currentMethod.getIndexOf(lhs);
        currentMethod.addInstruction(ISTORE, index);
        return null;
    }

    public Object visitMult(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(IMULT, "");
        return null;
    }

    public Object visitPlus(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(IADD, "");
        return null;
    }

    public Object visitMinus(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(ISUB, "");
        return null;
    }

    public Object visitIF(CommonTree node) {
        visit((CommonTree) node.getChild(0)); // Generate condition
        currentMethod.addInstruction(IF_FALSE, null);
        int ifid = currentMethod.getLastInstruction() - 1;
        visit((CommonTree) node.getChild(1)); // Generate if-body
        currentMethod.updateInstruction(ifid,
                currentMethod.getLastInstruction() + 1);
        currentMethod.addInstruction(GOTO, null);
        int elseid = currentMethod.getLastInstruction() - 1;
        visit((CommonTree) node.getChild(2)); // Generate else-body
        currentMethod.updateInstruction(elseid,
                currentMethod.getLastInstruction());
        return null;
    }

    public Object visitConstant(CommonTree node) {
        if (node.getChild(0).toString().equals("vertete")) {
            currentMethod.addInstruction(ICONST, true);
        } else if (node.getChild(0).toString().equals("fals")) {
            currentMethod.addInstruction(ICONST, false);
        } else {
            currentMethod.addInstruction(ICONST, node.getChild(0).toString());
        }
        return null;
    }

    public Object visitSYSSOUT(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(PRINT, "");
        return null;
    }

    public Object visitWhile(CommonTree node) {
        int firstIstruction = currentMethod.getLastInstruction();

        visit((CommonTree) node.getChild(0));// visit boolean expression
        currentMethod.addInstruction(IF_FALSE, null);
        int ifIstruction = currentMethod.getLastInstruction();
        visit((CommonTree) node.getChild(1));// visit Statementlist
        currentMethod.addInstruction(GOTO, firstIstruction);
        int gotoIstruction = currentMethod.getLastInstruction();
        currentMethod.updateInstruction(ifIstruction - 1, gotoIstruction);
        return null;
    }

    public Object visitLess(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(ILT, "");
        return null;
    }

    public Object visitBig(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(IBT, "");
        return null;
    }

    public Object visitLogicAnd(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(IAND, "");
        return null;
    }

    public Object visitLogicOr(CommonTree node) {

        visitChildren(node);
        currentMethod.addInstruction(IOR, "");
        return null;
    }

    public Object visitUnaryNOT(CommonTree node) {

        visitChildren(node);
        currentMethod.addInstruction(INOT, "");
        return null;
    }

    public Object visitReturn(CommonTree node) {
        visitChildren(node);
        currentMethod.addInstruction(RETURN, "");
        return null;
    }

    public Object visitMethodCall(CommonTree node) {
        visitChildren((CommonTree) node.getChild(1));
        if (node.getChild(0).toString().equals("NEW")) {
            String classx = node.getChild(0).getChild(0).toString();
            ClassRecord rec = symTab.getClass(classx);
            if (rec != null) {
                String mName = node.getChild(1).getChild(0).getText();
                MethodRecord record = (MethodRecord) rec.checkMethod(mName);
                if (record != null) {
                    currentMethod.addInstruction(INVOKEVIRTUAL, classx + "."
                            + mName);
                }
            }
        } else if (node.getChild(0).toString().equals("ky")) {
            // System.out.println(currentClass);
            ClassRecord rec = symTab.getClass(currentClass);
            if (rec != null) {
                String mName = node.getChild(1).getChild(0).getText();
                MethodRecord record = (MethodRecord) rec.checkMethod(mName);
                if (record != null) {
                    currentMethod.addInstruction(INVOKEVIRTUAL, currentClass
                            + "." + mName);
                }
            }
        }
        return null;
    }

    public void saveClassFile() {
        ObjectWriter write = new ObjectWriter(classfile.getNameFile() + ".tjc",
                classfile);
        write.close();
    }

    public void writeToFile() {
        try {
            FileWriter fstream = new FileWriter(this.classfile.getNameFile()
                    + ".txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(classfile.toString());
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

}
