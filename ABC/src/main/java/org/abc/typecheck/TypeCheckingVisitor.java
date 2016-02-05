package org.abc.typecheck;

import java.util.HashMap;

import org.antlr.runtime.tree.CommonTree;

public class TypeCheckingVisitor extends AbstractMiniJavaVisitor {
    private SymbolTable symTab;

    private HashMap<CommonTree, String> map = new HashMap<CommonTree, String>();

    public TypeCheckingVisitor(SymbolTable a) {
        symTab = a;

    }

    public Object visitWhile(CommonTree node) {

        visitChildren(node);

        if (map.containsKey(node.getChild(0))) {
            if (map.get(node.getChild(0)).equals("bul")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException(
                        "While condition is expected to have boolean type and not type "
                                + map.get(node.getChild(0)) + ".");
            }
        }
        return null;
    }

    public Object visitLogicAnd(CommonTree node) {

        visitChildren(node);

        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {
            if (map.get(node.getChild(0)).equals("bul")
                    && map.get(node.getChild(1)).equals("bul")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException(
                        "Logical And is expected to have boolean type childrens, not types "
                                + map.get(node.getChild(0)) + " "
                                + map.get(node.getChild(1)) + ".");
            }
        }

        visit((CommonTree) node.getChild(1)); // Visit StmtBlock

        return null;
    }

    public Object visitUnaryNOT(CommonTree tree) {
        // TODO Auto-generated method stub

        visitChildren(tree);
        // System.out.println(map.get(tree.getChild(0)));
        map.put(tree, map.get(tree.getChild(0)));
        // map.put(tree, map.get(tree.getChild(0)));

        // System.out.println(map.get(tree));
        return null;
    }

    public Object visitLogicOr(CommonTree node) {

        visitChildren(node);

        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            if (map.get(node.getChild(0)).equals("bul")
                    && map.get(node.getChild(1)).equals("bul")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException(
                        "Logical Or is expected to have boolean type childrens, not types "
                                + map.get(node.getChild(0)) + " "
                                + map.get(node.getChild(1)) + ".");
            }
        }

        visit((CommonTree) node.getChild(1)); // Visit StmtBlock

        return null;
    }

    public Object visitVarRef(CommonTree tree) {

        String varref = tree.getChild(0).toString();
        // System.out.println("--"+ varref);
        Record r = symTab.checkCurrentRecord(varref);

        symTab.getCurrentRecord();

        if (r != null) {
            map.put((CommonTree) tree.getChild(0), r.getType());
            map.put((CommonTree) tree, r.getType());

        } else {
            r = symTab.lookup(varref);
            if (r != null) {
                map.put((CommonTree) tree.getChild(0), r.getType());
                map.put((CommonTree) tree, r.getType());

            } else {
                throw new RuntimeException("Variable Reference " + varref
                        + " not declared");
            }
        }
        return null;
    }

    public Object visitConstant(CommonTree node) {
        String retType = (String) node.getChild(0).toString(); // Constant type
        if (retType.equals("vertete") || retType.equals("fals")) {
            map.put((CommonTree) node.getChild(0), "bul");
            map.put((CommonTree) node, "bul");
        } else if (retType.startsWith("\"")) {
            map.put((CommonTree) node.getChild(0), "Tekst");
            map.put((CommonTree) node, "Tekst");
        } else {
            map.put((CommonTree) node.getChild(0), "numer");
            map.put((CommonTree) node, "numer");

        }
        return null;
    }

    public Object visitPlus(CommonTree node) {
        visitChildren(node);
        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            // if(map.get(node.getChild(0)).equals(map.get(node.getChild(1))) &&
            // map.get(node.getChild(0)).equals("numer"))
            // {
            // map.put((CommonTree)node, map.get(node.getChild(0)));
            // }
            // else
            // {
            // throw new RuntimeException("+ Operator can not" +" add type " +
            // map.get(node.getChild(0)) + " and "+ map.get(node.getChild(1)) +
            // ".");
            // }
        }

        return null;
    }

    public Object visitLess(CommonTree node) {

        visitChildren(node);
        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            if (map.get(node.getChild(0)).equals(map.get(node.getChild(1)))
                    && map.get(node.getChild(0)).equals("numer")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException("< operator can not compare "
                        + map.get(node.getChild(0)) + " and "
                        + map.get(node.getChild(1)) + ".");
            }
        }

        return null;
    }

    public Object visitBig(CommonTree node) {

        visitChildren(node);
        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            if (map.get(node.getChild(0)).equals(map.get(node.getChild(1)))
                    && map.get(node.getChild(0)).equals("numer")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException("> operator can not compare "
                        + map.get(node.getChild(0)) + " and "
                        + map.get(node.getChild(1)) + ".");
            }
        }

        return null;
    }

    public Object visitIF(CommonTree node) {

        visitChildren(node);
        // System.out.println("ee" + map.get(node.getChild(0)));
        if (map.containsKey(node.getChild(0))) {

            if (map.get(node.getChild(0)).equals("bul")) {
                map.put((CommonTree) node, "bul");
            } else {
                throw new RuntimeException(
                        "If condition is expected to have boolean type and not type "
                                + map.get(node.getChild(0)) + ".");
            }
        } else
            System.out.println(node.toString() + "Not found");

        return null;
    }

    public Object visitMinus(CommonTree node) {
        visitChildren(node);
        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            if (map.get(node.getChild(0)).equals(map.get(node.getChild(1)))
                    && map.get(node.getChild(0)).equals("numer")) {
                map.put((CommonTree) node, map.get(node.getChild(0)));
            } else {
                throw new RuntimeException("- operator can not substract type "
                        + map.get(node.getChild(0)) + " and "
                        + map.get(node.getChild(1)) + ".");
            }
        }

        return null;
    }

    public Object visitMult(CommonTree node) {

        visitChildren(node);

        if (map.containsKey(node.getChild(0))
                && map.containsKey(node.getChild(1))) {

            if (map.get(node.getChild(0)).equals(map.get(node.getChild(1)))
                    && map.get(node.getChild(0)).equals("numer")) {
                map.put((CommonTree) node, map.get(node.getChild(0)));
            } else {
                throw new RuntimeException("* Operator can not multiply type "
                        + map.get(node.getChild(0)) + " and "
                        + map.get(node.getChild(1)) + ".");
            }
        }

        return null;
    }

    public Object visitMethodDecl(CommonTree node) {
        symTab.enterScope(); // Enter method scope
        visit((CommonTree) node.getChild(3).getChild(1));// visit method body
        symTab.exitScope();
        return null;
    }

    public Object visitSuffixPart(CommonTree node) {
        visitChildren(node);
        if (node.getParent().getChild(0).toString().equals("NEW")) {
            String classx = node.getParent().getChild(0).getChild(0).toString();
            ClassRecord rec = symTab.getClass(classx);
            if (rec != null) {
                String mName = node.getChild(0).getText();
                MethodRecord record = (MethodRecord) rec.checkMethod(mName);
                if (record != null) {
                    map.put((CommonTree) node.getParent(), record.getType());
                    if (record.getParamListSize() != node.getChild(1).getChildCount()) {
                        throw new RuntimeException(
                                "The number of parameters in method " + mName
                                        + " is not equal as declared in class "
                                        + classx + ".");
                    } else {
                        visitChildren((CommonTree) node.getChild(1));
                        for (int i = 0; i < record.getParamList().size(); i++) {
                            if (map.get(node.getChild(1).getChild(i)).equals(
                                    record.getParamList().get(i).getType())) {

                            } else {
                                throw new RuntimeException(
                                        "The parameter "
                                                + i
                                                + " in method "
                                                + mName
                                                + " is expected to be of type "
                                                + record.getParamList().get(i).getType()
                                                + " but is of type "
                                                + map.get(node.getChild(1).getChild(
                                                        i)) + ".");
                            }
                        }

                    }
                } else {
                    throw new RuntimeException("Method " + mName
                            + " is not defined in class " + classx + ".");
                }
            } else {
                throw new RuntimeException("Class " + classx + " is not found.");
            }
        } else if (node.getParent().getChild(0).toString().equals("ky")) {
            String mName = node.getChild(0).getText(); // Method name
            MethodRecord r = (MethodRecord) symTab.lookup(mName);
            if (r != null) {
                map.put((CommonTree) node.getParent(), r.getType());
                map.put(node, r.getType());
                // System.out.println("dsdsd"+r.getType());
                if (r.getParamListSize() != node.getChild(1).getChildCount()) {
                    throw new RuntimeException(
                            "The number of parameters in method call "
                                    + mName
                                    + " is not equal as declared in this class.");
                } else {
                    visitChildren((CommonTree) node.getChild(1));
                    for (int i = 0; i < r.getParamList().size(); i++) {
                        if (map.get(node.getChild(1).getChild(i)).equals(
                                r.getParamList().get(i).getType())) {

                        } else {
                            throw new RuntimeException("The parameter " + i
                                    + " in method call " + mName
                                    + " is expected to be of type "
                                    + r.getParamList().get(i).getType()
                                    + " but is of type "
                                    + map.get(node.getChild(1).getChild(i))
                                    + ".");
                        }
                    }
                }
            } else {
                throw new RuntimeException("Method " + mName
                        + " not defined in this class.");
            }
        } else {
            String classx = map.get(node.getParent().getChild(0).getChild(0));
            ClassRecord rec = symTab.getClass(classx);
            String mName = node.getChild(0).getText();
            MethodRecord record = (MethodRecord) rec.checkMethod(mName);
            if (record != null) {
                // System.out.println(node.getChild(0));

                map.put((CommonTree) node.getParent(), record.getType());
                map.put(node, record.getType());

                if (record.getParamListSize() != node.getChild(1).getChildCount()) {
                    throw new RuntimeException(
                            "The number of parameters in method " + mName
                                    + " is not equal as declared in class "
                                    + classx + ".");
                } else {
                    visitChildren((CommonTree) node.getChild(1));
                    for (int i = 0; i < record.getParamList().size(); i++) {
                        if (map.get(node.getChild(1).getChild(i)).equals(
                                record.getParamList().get(i).getType())) {
                        } else {
                            throw new RuntimeException("The parameter " + i
                                    + " in method " + mName
                                    + " is expected to be of type "
                                    + record.getParamList().get(i).getType()
                                    + " but is of type "
                                    + map.get(node.getChild(1).getChild(i))
                                    + ".");
                        }
                    }

                }
            } else {
                throw new RuntimeException("Method " + mName
                        + " is not defined in class " + classx + ".");
            }
        }
        return null;
    }

    public Object visitMethodCall(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        // System.out.println(tree.getChild(0) + map.get(tree.getChild(0)));
        // System.out.println(tree.getChild(1) + map.get(tree.getChild(1)));
        map.put(tree, map.get(tree.getChild(1)));
        return null;
    }

    public Object visitClassDecl(CommonTree node) {
        symTab.enterScope(); // Enter method scope
        // visit((CommonTree) node.getChild(1));// Visit Varlist
        // visit((CommonTree) node.getChild(2)); // Visit MethodList
        if (node.getChild(1).toString().equals("extends")) {
            visitExtendsList((CommonTree) node.getChild(1));
            visit((CommonTree) node.getChild(2));// Visit Varlist
            visit((CommonTree) node.getChild(3));// Visit MethodList
        } else {
            visit((CommonTree) node.getChild(1));// Visit Varlist
            visit((CommonTree) node.getChild(2)); // Visit MethodList
        }
        symTab.exitScope();
        return null;
    }

    public Object visitFile(CommonTree node) {

        for (int i = 0; i < node.getChildCount(); i++) {
            symTab.enterScope();
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
            symTab.exitScope(); // Exit Program scope
        }
        return null;
    }

    public Object visitMainClass(CommonTree node) {

        symTab.enterScope(); // Enter class scope
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
        }
        symTab.exitScope(); // Exit class scope
        return null;
    }

    public Object visitMainMethod(CommonTree node) {

        symTab.enterScope();
        visit((CommonTree) node.getChild(1));
        symTab.exitScope();
        return null;
    }

    public Object visitMethodList(CommonTree node) {

        for (int i = 0; i < node.getChildCount(); i++) {
            visit((CommonTree) node.getChild(i));
        }
        return null;
    }

    public Object visitParamList(CommonTree node) {

        return null;
    }

    public String toStringMap() {
        return map.toString();
    }

    public Object visitAssign(CommonTree node) {

        visitChildren(node);
        if (map.containsKey(node.getChild(0).getChild(0))
                && map.containsKey(node.getChild(1).getChild(0))) {
            if (node.getChild(1).toString().equals("INTARRAY_NEW")) {
                if (map.get(node.getChild(0).getChild(0)).equals(
                        map.get(node.getChild(1)))) {
                    // System.out.println(node.getChild(0).toString()+" "+node.getChild(1).toString());
                    map.put((CommonTree) node.getChild(0),
                            map.get(node.getChild(0).getChild(0)));
                    map.put((CommonTree) node.getChild(1), "ARRAY_TYPE");
                } else {
                    throw new RuntimeException("Reference "
                            + node.getChild(0).getChild(0).toString()
                            + " of type "
                            + map.get(node.getChild(0).getChild(0))
                            + " can not be assign to a new array of type "
                            + map.get(node.getChild(1).getChild(0)) + ".");
                }
            } else if (node.getChild(1).toString().equals("METHOD_CALL")) {
                // System.out.println(node.getChild(1).getChild(1));
                if (map.get(node.getChild(0).getChild(0)).equals(
                        map.get(node.getChild(1).getChild(1)))) {

                } else {
                    throw new RuntimeException("Reference "
                            + node.getChild(0).getChild(0).toString()
                            + " of type "
                            + map.get(node.getChild(0).getChild(0))
                            + " can not be assign to type "
                            + map.get(node.getChild(1).getChild(0)) + ".");
                }
            } else if (node.getChild(1).toString().equals("ARRAY_READ")) {
                // System.out.println(node.getChild(1).getChild(1));
                if (map.get(node.getChild(0).getChild(0)).equals(
                        map.get(node.getChild(1).getChild(1)))) {
                } else {
                    throw new RuntimeException("Reference "
                            + node.getChild(0).getChild(0).toString()
                            + " of type "
                            + map.get(node.getChild(0).getChild(0))
                            + " can not be assign to type "
                            + map.get(node.getChild(1).getChild(0)) + ".");
                }
            } else {
                if (map.get(node.getChild(0).getChild(0)).equals(
                        map.get(node.getChild(1).getChild(0)))) {
                    // System.out.println(node.getChild(0).toString()+" "+node.getChild(1).toString());
                    map.put((CommonTree) node.getChild(0),
                            map.get(node.getChild(0).getChild(0)));
                    map.put((CommonTree) node.getChild(1),
                            map.get(node.getChild(1).getChild(0)));

                } else {
                    throw new RuntimeException("Reference "
                            + node.getChild(0).getChild(0).toString()
                            + " of type "
                            + map.get(node.getChild(0).getChild(0))
                            + " can not be assign to "
                            + node.getChild(1).getChild(0).toString()
                            + " of type "
                            + map.get(node.getChild(1).getChild(0)) + ".");
                }
            }

        }

        return null;
    }

    protected Object visitArrayAssign(CommonTree node) {
        // TODO Auto-generated method stub
        visitChildren(node);

        if (map.containsKey(node.getChild(0).getChild(0))
                && map.containsKey(node.getChild(1).getChild(0))
                && map.containsKey(node.getChild(2).getChild(0))) {
            if (map.get(node.getChild(0).getChild(0)).equals("ARRAY_TYPE")
                    && map.get(node.getChild(2).getChild(0)).equals("numer")) {
                if (map.get(node.getChild(1).getChild(0)).equals("numer")) {
                    map.put((CommonTree) node.getChild(0),
                            map.get(node.getChild(0).getChild(0)));
                    map.put((CommonTree) node.getChild(1),
                            map.get(node.getChild(1).getChild(0)));
                    map.put((CommonTree) node.getChild(2),
                            map.get(node.getChild(2).getChild(0)));
                } else {
                    throw new RuntimeException("Index of array refernce "
                            + node.getChild(0).getChild(0).toString()
                            + " is of type "
                            + map.get(node.getChild(1).getChild(0))
                            + " and is expected to be int.");
                }
            } else if (map.get(node.getChild(0).getChild(0)).equals(
                    "ARRAY_TYPE")
                    && map.get(node.getChild(2).getChild(0)).equals(
                            "ARRAY_TYPE")) {
                if (map.get(node.getChild(1).getChild(0)).equals("numer")) {
                    map.put((CommonTree) node.getChild(0),
                            map.get(node.getChild(0).getChild(0)));
                    map.put((CommonTree) node.getChild(1),
                            map.get(node.getChild(1).getChild(0)));
                    map.put((CommonTree) node.getChild(2),
                            map.get(node.getChild(2).getChild(0)));
                } else {
                    throw new RuntimeException("Index of array refernce "
                            + node.getChild(0).getChild(0).toString()
                            + " is of type "
                            + map.get(node.getChild(1).getChild(0))
                            + " and is expected to be int.");
                }
            } else {
                System.out.println(node.getChild(0).getChild(0).toString()
                        + " " + node.getChild(1).getChild(0).toString());

                throw new RuntimeException("Referenceddd "
                        + node.getChild(0).getChild(0).toString() + " of type "
                        + map.get(node.getChild(0).getChild(0))
                        + " is expected to be array reference.");
            }
        }
        return null;
    }

    protected Object visitArrayRead(CommonTree node) {
        visitChildren(node);

        if (map.containsKey(node.getChild(0).getChild(0))
                && map.containsKey(node.getChild(1).getChild(0))) {
            if (map.get(node.getChild(0).getChild(0)).equals("ARRAY_TYPE")) {
                if (map.get(node.getChild(1).getChild(0)).equals("numer")) {
                    // System.out.println(node.getChild(0).toString()+" "+node.getChild(1).toString());
                    map.put((CommonTree) node.getChild(0),
                            map.get(node.getChild(0).getChild(0)));
                    map.put((CommonTree) node.getChild(1),
                            map.get(node.getChild(1).getChild(0)));
                    map.put((CommonTree) node, "numer");
                } else {
                    throw new RuntimeException("Index of array refernce "
                            + node.getChild(0).getChild(0).toString()
                            + " is of type "
                            + map.get(node.getChild(1).getChild(0))
                            + " and is expected to be int.");
                }
            } else {
                throw new RuntimeException("Reference "
                        + node.getChild(0).getChild(0).toString() + " of type "
                        + map.get(node.getChild(0).getChild(0))
                        + " is expected to be array reference.");
            }
        }
        return null;
    }

    public Object visitReturn(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        if (map.get(tree.getChild(0)).toString().equals(
                tree.getParent().getParent().getParent().getChild(0).getChild(0).toString())) {

        } else {
            throw new RuntimeException(
                    "In method declaration "
                            + tree.getParent().getParent().getParent().getChild(
                                    1)
                            + " the type is "
                            + tree.getParent().getParent().getParent().getChild(
                                    0).getChild(0)
                            + " but the Return Statement returns type "
                            + map.get(tree.getChild(0)).toString());
        }

        return null;
    }

    public Object visitIntArrayNew(CommonTree tree) {
        visitChildren(tree);
        if (map.get(tree.getChild(0)) != null) {
            map.put(tree, "ARRAY_TYPE");
        }
        return null;
    }

    public Object visitArrayLengthReference(CommonTree tree) {
        visitChildren(tree);
        if (map.get(tree.getChild(0)).equals("ARRAY_TYPE")) {
            map.put(tree, "numer");
            map.put((CommonTree) tree.getChild(0), "numer");
            // System.out.println("haha"+map.get(tree.getChild(0)));
            // System.out.println(tree);//)
        }
        return null;
    }

}
