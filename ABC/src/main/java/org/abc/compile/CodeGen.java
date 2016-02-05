package org.abc.compile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.abc.typecheck.ABCLexer;
import org.abc.typecheck.ABCParser;
import org.abc.typecheck.SymbolTable;
import org.abc.typecheck.SymbolTableVisitor;
import org.abc.typecheck.TypeCheckingVisitor;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


public class CodeGen {

    /**
     * @param args
     */
    public static void main(String[] args) throws RecognitionException,
            FileNotFoundException, IOException {

        String file;
        if (args == null) {
            file = args[0];
        } else {
            file = "D://ikubworkspace//ABC//binarytree.abc";
            // file="ShumaAmir.abc";
        }

        ANTLRReaderStream input = new ANTLRReaderStream(new FileReader(file));
        ABCLexer lexer = new ABCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ABCParser parser = new ABCParser(tokens);

        CommonTree root = (CommonTree) parser.goal().getTree();

        // parser.pr
        // System.out.println(root.getLine());

        SymbolTableVisitor stVisitor = new SymbolTableVisitor();
        stVisitor.visit(root);
        SymbolTable symTab = stVisitor.getSymbolTable();
        System.out.println("SymbolTable\n____________________________________________________");
        symTab.printTable();
        symTab.resetTable();

        System.out.println("Type Chechecking\n____________________________________________________");

        TypeCheckingVisitor typecheck = new TypeCheckingVisitor(symTab);
        try {
            typecheck.visit(root);
            System.out.println("Type Checking did not found any error.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        symTab.resetTable();

        System.out.println("CodeGeneration\n____________________________________________________");
        CodeGenerationVisitor codeGeneration = new CodeGenerationVisitor(symTab);
        codeGeneration.visit(root);
        codeGeneration.getClassFile().print();
    }

}
