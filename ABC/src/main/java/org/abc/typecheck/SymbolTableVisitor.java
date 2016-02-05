package org.abc.typecheck;

import org.antlr.runtime.tree.CommonTree;

public class SymbolTableVisitor extends AbstractMiniJavaVisitor {
    private SymbolTable symTab;

    private MethodRecord methodRecord;

    private ClassRecord classRecord;

    public SymbolTableVisitor() {
        symTab = new SymbolTable();
    }

    public Object visitMethodDecl(CommonTree node) {
        String retType = (String) visit((CommonTree) node.getChild(0)); // Return
                                                                        // type
        String mName = node.getChild(1).getText(); // Method name
        methodRecord = new MethodRecord(mName, retType);
        classRecord.putMethod(mName, methodRecord);
        symTab.put(mName, methodRecord); // Store record in SymTab
        symTab.enterScope(); // Enter method scope
        visit((CommonTree) node.getChild(2));// visitParam
        visitVarDeclInMethod((CommonTree) node.getChild(3).getChild(0));
        symTab.exitScope();
        methodRecord = null;
        return null;
    }

    public Object visitClassDecl(CommonTree node) {
        String retType = (String) visit((CommonTree) node.getChild(0)).toString();
        ; // Return type
        String cName = node.getChild(0).getText(); // Class name
        classRecord = new ClassRecord(retType, retType);
        symTab.put(cName, classRecord); // Store record in SymTab
        symTab.enterScope(); // Enter method scope
        if (node.getChild(1).toString().equals("extends")) {
            visitExtendsList((CommonTree) node.getChild(1));
            visit((CommonTree) node.getChild(2));
            visit((CommonTree) node.getChild(3));
        } else {
            visit((CommonTree) node.getChild(1));// Visit Varlist
            visit((CommonTree) node.getChild(2)); // Visit MethodList

        }
        symTab.exitScope();
        classRecord = null;
        return null;
    }

    public Object visitVarDecl(CommonTree node) {
        String retType = (String) visit((CommonTree) node.getChild(0)).toString();
        ; // Return type
        String varName = node.getChild(1).getText(); // Method name
        BarRecord currentvar = new BarRecord(varName, retType);
        classRecord.putMethod(varName, currentvar);

        symTab.put(varName, currentvar);
        return null;
    }

    public Object visitVarDeclInMethod(CommonTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            String retType = node.getChild(i).getChild(0).getChild(0).toString(); // Return
                                                                                  // type
            String varName = node.getChild(i).getChild(1).toString(); // Method
                                                                      // name
            BarRecord currentvar = new BarRecord(varName, retType);
            methodRecord.addRecords(currentvar, varName);
            symTab.put(varName, currentvar);
        }
        return null;
    }

    public Object visitFile(CommonTree node) {

        Record program = new ProgramRecord("ROOT", "ROOT");
        symTab.put("Root", program);
        for (int i = 0; i < node.getChildCount(); i++) {
            symTab.enterScope();
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
            symTab.exitScope(); // Exit Program scope
        }
        return null;
    }

    public Object visitMainClass(CommonTree node) {
        String cname = (String) visit((CommonTree) node.getChild(0)).toString(); // Return
                                                                                 // type
                                                                                 // or
                                                                                 // Identifier
        String mainClass1 = node.getChild(1).getText(); // Class name
        ClassRecord mainClass = new ClassRecord(cname, null);
        symTab.put(mainClass1, mainClass); // Store record in SymTab
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
        // System.out.println("		"+node.toString()+" return ");
        MethodRecord mainMethod = new MethodRecord(node.toString(), null);
        symTab.put(main, mainMethod); // Store record in SymTab
        symTab.enterScope();
        visit((CommonTree) node.getChild(1));
        symTab.exitScope();
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
            ParamRecord currentparam = new ParamRecord(nameparam, returnType);
            methodRecord.addRecords(currentparam, nameparam);
            symTab.put(nameparam, currentparam);
        }
        return null;
    }
    // protected Object visitExtendsList(CommonTree tree) {
    // // TODO Auto-generated method stub
    // String extendsName=tree.getChild(0).getChild(0).toString();
    // ClassRecord currentClass=new ClassRecord(extendsName,"extends" );//
    // (extendsName,"extends");
    // symTab.put(extendsName+"extends", currentClass);
    // return null;
    // }
}
