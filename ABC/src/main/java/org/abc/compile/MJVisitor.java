package org.abc.compile;

import org.abc.typecheck.ABCLexer;
import org.antlr.runtime.tree.CommonTree;


public abstract class MJVisitor {

    protected void visit1(CommonTree root) {
        // System.out.println(root.childIndex);

        for (int i = 0; i < root.getChildCount(); i++) {
            CommonTree child = (CommonTree) root.getChild(i);
            visit1(child);
        }
    }

    protected Object visitClassDecl(CommonTree node) {
        visitChildren(node); // Default action
        return null;
    }

    protected Object visitVarList(CommonTree node) {
        visitChildren(node); // Default action
        return null;
    }

    // ... One for each node type
    protected void visitChildren(CommonTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree child = (CommonTree) node.getChild(i);
            visit(child);
        }
    }

    protected Object visitMethodList(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        return null;
    }

    public Object visit(CommonTree tree) {
        // System.out.println(tree.toString());
        switch (tree.getType()) {
        case ABCLexer.FILE:
            return visitFile(tree);
        case ABCLexer.MAIN_CLASS:
            return visitMainClass(tree);
        case ABCLexer.MAIN_METHOD:
            return visitMainMethod(tree);
        case ABCLexer.PARAM:
            return visitParam(tree);
        case ABCLexer.CLASS:
            return visitClassDecl(tree);
        case ABCLexer.VAR_LIST:
            return visitVarList(tree);
        case ABCLexer.METHOD_LIST:
            return visitMethodList(tree);
        case ABCLexer.METHOD_CALL:
            return visitMethodCall(tree);
        case ABCLexer.METHOD_DECL:
            return visitMethodDecl(tree);
        case ABCLexer.ARRAY_ASSIGN:
            return visitArrayAssign(tree);
        case ABCLexer.WHILE:
            return visitWhile(tree);
        case ABCLexer.STMNT_LIST:
            return visitSTMNTList(tree);
        case ABCLexer.ARRAY_READ:
            return visitArrayRead(tree);
        case ABCLexer.CONST:
            return visitConstant(tree);
        case ABCLexer.NEW:
            return visitNew(tree);
        case ABCLexer.VAR_DECL:
            return visitVarDecl(tree);
        case ABCLexer.PARAM_LIST:
            return visitParamList(tree);
        case ABCLexer.BT:
            return visitBig(tree);
        case ABCLexer.LOGIC_AND:
            return visitLogicAnd(tree);
        case ABCLexer.IF:
            return visitIF(tree);
        case ABCLexer.EXPR_LIST:
            return visitExprList(tree);
        case ABCLexer.METHOD_BODY:
            return visitMethodBody(tree);
        case ABCLexer.SYSOUT:
            return visitSYSSOUT(tree);
        case ABCLexer.VAR_REF:
            return visitVarRef(tree);
        case ABCLexer.TYPE_REF:
            return visitTypeRef(tree);
        case ABCLexer.RETURN:
            return visitReturn(tree);
        case ABCLexer.ASSIGN:
            return visitAssign(tree);
        case ABCLexer.SUFFIX_PART:
            return visitSuffixPart(tree);
        case ABCLexer.LT:
            return visitLess(tree);
        case ABCLexer.MINUS:
            return visitMinus(tree);
        case ABCLexer.PLUS:
            return visitPlus(tree);
        case ABCLexer.MULT:
            return visitMult(tree);
        case ABCLexer.UNARY_NOT:
            return visitUnaryNOT(tree);
        case ABCLexer.THIS:
            return visitTHIS(tree);
        case ABCLexer.TRUE:
            return visitTRUE(tree);
        case ABCLexer.FALSE:
            return visitFALSE(tree);
        case ABCLexer.LOGIC_OR:
            return visitLogicOr(tree);
        }
        return tree;

    }

    protected Object visitFALSE(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitTRUE(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitExtends(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitLogicOr(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitTHIS(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitUnaryNOT(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMult(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    public Object visitPlus(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        return null;
    }

    protected Object visitMinus(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitLess(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitBig(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitParam(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        return null;
    }

    protected Object visitParamList(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        return null;
    }

    protected Object visitTypeRef(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        CommonTree child = (CommonTree) tree.getChild(0);
        return child.toString();

    }

    protected Object visitSuffixPart(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitArrayLengthReference(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitAssign(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitReturn(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitSYSSOUT(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitVarRef(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMethodBody(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);
        return null;
    }

    protected Object visitExprList(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitIF(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitIntArrayNew(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitLogicAnd(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitExtendsList(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitVarDecl(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitArrayType(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitNew(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitConstant(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitArrayRead(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitSTMNTList(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitWhile(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitArrayAssign(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMethodDecl(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMethodCall(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMainMethod(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitMainClass(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

    protected Object visitFile(CommonTree tree) {
        // TODO Auto-generated method stub
        visitChildren(tree);

        return null;
    }

}
