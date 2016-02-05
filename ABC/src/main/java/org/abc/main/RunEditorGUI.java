package org.abc.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import org.abc.compile.CodeGenerationVisitor;
import org.abc.interpret.StackMachine;
import org.abc.texteditor.CapturePane;
import org.abc.texteditor.CustomOutputStream;
import org.abc.texteditor.SyntaxDocument;
import org.abc.typecheck.ABCLexer;
import org.abc.typecheck.ABCParser;
import org.abc.typecheck.SymbolTable;
import org.abc.typecheck.SymbolTableVisitor;
import org.abc.typecheck.TypeCheckingVisitor;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


@SuppressWarnings("serial")
public class RunEditorGUI extends JFrame implements ActionListener {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
        new RunEditorGUI();
    }

    // ============================================
    // FIELDS
    // ============================================

    // Menus
    private JMenu fileMenu;

    private JMenu compileMenu;

    private JMenu editMenu;

    private JMenuItem newFile, openFile, saveFile, saveAsFile, exit;

    private JMenuItem undoEdit, redoEdit, selectAll, copy, paste, cut;

    private JMenuItem compile, run;

    private CapturePane capturePane;

    // Window
    private JFrame editorWindow;

    // Text Area
    private Border textBorder;

    private JScrollPane scrollcodepane;

    // private JScrollPane scrolloutput;
    private JEditorPane codepane;
    // private JTextArea textAreaOutput;
    private Font textFont;


    public PageFormat format;

    // Is File Saved/Opened
    private boolean opened = false;

    private boolean saved = false;

    // Record Open File for quick saving
    private File openedFile;

    // Undo manager for managing the storage of the undos
    // so that the can be redone if requested
    private UndoManager undoManager = new UndoManager();
    protected UndoHandler undoHandler = new UndoHandler();
    private UndoAction undoAction = null;
    private RedoAction redoAction = null;
    // ============================================
    // CONSTRUCTOR
    // ============================================

    public RunEditorGUI() {
        super("JavaEdit");

        // Create Menus
        fileMenu();
        editMenu();
        compileMenu();

        // Create Text Area
        createCodeTextPane();

        // Create Undo Manager for managing undo/redo commands


        // Create Window
        createEditorWindow();
    }

    private JFrame createEditorWindow() {
        editorWindow = new JFrame("ABCEdit");
        editorWindow.setVisible(true);
        editorWindow.setExtendedState(Frame.MAXIMIZED_BOTH);
        editorWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Create Menu Bar
        editorWindow.setJMenuBar(createMenuBar());
        editorWindow.add(scrollcodepane, BorderLayout.CENTER);

        // PrintStream ps = System.;
        capturePane = new CapturePane();

        PrintStream printStream = new PrintStream(new CustomOutputStream(
                capturePane.getOutput()));
        System.setOut(printStream);
        // System.setErr(printStream);

        // System.setOut(new PrintStream(new StreamCapturer("", capturePane,
        // printStream)));

        editorWindow.add(capturePane, BorderLayout.SOUTH);
        editorWindow.pack();
        // Centers application on screen
        editorWindow.setLocationRelativeTo(null);

        return editorWindow;
    }

    private JEditorPane createCodeTextPane() {
       // codepane = new JTextPane(getFormater());

        EditorKit editorKit = new StyledEditorKit()
        {
             /**
           *
           */
          private static final long serialVersionUID = 1L;

          @Override
          public Document createDefaultDocument()
             {
                  return new SyntaxDocument();
             }
        };
        codepane = new JEditorPane();
        codepane.setEditorKitForContentType("text/abc", editorKit);
        codepane.setContentType("text/abc");

        KeyStroke undoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK);
        KeyStroke redoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK);

        undoAction = new UndoAction();
        codepane.getInputMap().put(undoKeystroke, "undoKeystroke");
        codepane.getActionMap().put("undoKeystroke", undoAction);

        redoAction = new RedoAction();
        codepane.getInputMap().put(redoKeystroke, "redoKeystroke");
        codepane.getActionMap().put("redoKeystroke", redoAction);
        codepane.getDocument().addUndoableEditListener(undoHandler);

        textBorder = BorderFactory.createBevelBorder(0, Color.BLUE, Color.BLUE);

        codepane.setEditable(true);
        codepane.setBorder(BorderFactory.createCompoundBorder(textBorder,
                BorderFactory.createEmptyBorder(2, 5, 0, 0)));

        textFont = new Font("Courier New", 0, 14);
        codepane.setFont(textFont);
        codepane.setPreferredSize(new Dimension(400, 400));
        // TextLineNumber tln = new TextLineNumber(textpane);

        scrollcodepane = new JScrollPane(codepane,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        return codepane;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(compileMenu);

        return menuBar;
    }



    private void fileMenu() {
        // Create File Menu
        fileMenu = new JMenu("File");
        fileMenu.setPreferredSize(new Dimension(40, 20));

        // Add file menu items
        newFile = new JMenuItem("New");
        newFile.addActionListener(this);
        newFile.setPreferredSize(new Dimension(120, 20));
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                InputEvent.CTRL_DOWN_MASK));

        newFile.setEnabled(true);

        openFile = new JMenuItem("Open...");
        openFile.addActionListener(this);
        openFile.setPreferredSize(new Dimension(120, 20));
        openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                InputEvent.CTRL_DOWN_MASK));
        openFile.setEnabled(true);

        saveFile = new JMenuItem("Save");
        saveFile.addActionListener(this);
        saveFile.setPreferredSize(new Dimension(120, 20));
        saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                InputEvent.CTRL_DOWN_MASK));
        saveFile.setEnabled(true);

        saveAsFile = new JMenuItem("Save As");
        saveAsFile.addActionListener(this);
        saveAsFile.setPreferredSize(new Dimension(120, 20));
        saveAsFile.setEnabled(true);

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        exit.setPreferredSize(new Dimension(120, 20));
        exit.setEnabled(true);

        // Add items to menu
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveAsFile);
        fileMenu.add(exit);
    }

    private void compileMenu() {
        // Create File Menu
        compileMenu = new JMenu("Compile");
        compileMenu.setPreferredSize(new Dimension(60, 20));

        // Add file menu items
        compile = new JMenuItem("Compile");
        compile.addActionListener(this);
        compile.setPreferredSize(new Dimension(120, 20));
        compile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
                InputEvent.CTRL_DOWN_MASK));
        compile.setEnabled(true);

        run = new JMenuItem("RUN");
        run.addActionListener(this);
        run.setPreferredSize(new Dimension(120, 20));
        run.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,
                InputEvent.CTRL_DOWN_MASK));
        run.setEnabled(true);

        compileMenu.add(compile);
        compileMenu.add(run);

    }

    private void editMenu() {
        editMenu = new JMenu("Edit");
        editMenu.setPreferredSize(new Dimension(40, 20));

        // Add file menu items
        undoEdit = new JMenuItem("Undo");
        undoEdit.addActionListener(undoAction);
        undoEdit.setPreferredSize(new Dimension(120, 20));
//        undoEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
//                InputEvent.CTRL_DOWN_MASK));
        undoEdit.setEnabled(true);

        redoEdit = new JMenuItem("Redo");
        redoEdit.addActionListener(redoAction);
        redoEdit.setPreferredSize(new Dimension(120, 20));
//        redoEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
//                InputEvent.CTRL_DOWN_MASK));
        redoEdit.setEnabled(true);

        selectAll = new JMenuItem("Select All");
        selectAll.addActionListener(this);
        selectAll.setPreferredSize(new Dimension(120, 20));
        selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                InputEvent.CTRL_DOWN_MASK));
        selectAll.setEnabled(true);

        copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        copy.setPreferredSize(new Dimension(120, 20));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
                InputEvent.CTRL_DOWN_MASK));

        copy.setEnabled(true);

        paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        paste.setPreferredSize(new Dimension(120, 20));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
                InputEvent.CTRL_DOWN_MASK));
        paste.setEnabled(true);

        cut = new JMenuItem("Cut");
        cut.addActionListener(this);
        cut.setPreferredSize(new Dimension(120, 20));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
                InputEvent.CTRL_DOWN_MASK));

        cut.setEnabled(true);

        // Add items to menu
        editMenu.add(undoEdit);
        editMenu.add(redoEdit);
        editMenu.add(selectAll);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(cut);
    }

    // Method for saving files - Removes duplication of code
    private void saveFile(File filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(codepane.getText());
            writer.close();
            saved = true;
            // window.setTitle("JavaText - " + filename.getName());
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    // Method for quick saving files
    private void quickSave(File filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(codepane.getText());
            writer.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    // Method for opening files
    private void openingFiles(File filename) {
        try {
            openedFile = filename;
            FileReader reader = new FileReader(filename);
            codepane.read(reader, null);
            opened = true;
            // window.setTitle("JavaEdit - " + filename.getName());
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == newFile) {
            new RunEditorGUI();
        } else if (event.getSource() == openFile) {
            JFileChooser open = new JFileChooser();
            open.setCurrentDirectory(new File("."));
            open.setAcceptAllFileFilterUsed(false);
            open.addChoosableFileFilter(new FileNameExtensionFilter(
                    "ABC Files", "abc"));

            int result = open.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = open.getSelectedFile();
                openingFiles(file);
            } else if (result == JFileChooser.CANCEL_OPTION) {
                // System.out.println("Cancel was selected");
            }

        } else if (event.getSource() == saveFile) {
            JFileChooser save = new JFileChooser();
            save.addChoosableFileFilter(new FileNameExtensionFilter(
                    "ABC Files", "abc"));
            save.setAcceptAllFileFilterUsed(false);
            save.setCurrentDirectory(new File("."));

            File filename = save.getSelectedFile();
            if (opened == false && saved == false) {
                save.showSaveDialog(null);
                int confirmationResult;
                if (filename.exists()) {
                    confirmationResult = JOptionPane.showConfirmDialog(
                            saveFile, "Replace existing file?");
                    if (confirmationResult == JOptionPane.YES_OPTION) {
                        saveFile(filename);
                    }
                } else {
                    saveFile(filename);
                }
            } else {
                quickSave(openedFile);
            }

        } else if (event.getSource() == saveAsFile) {
            JFileChooser saveAs = new JFileChooser();
            saveAs.setAcceptAllFileFilterUsed(false);
            saveAs.addChoosableFileFilter(new FileNameExtensionFilter(
                    "ABC Files", "abc"));
            saveAs.setCurrentDirectory(new File("."));

            int result = saveAs.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File filename = saveAs.getSelectedFile();
                int confirmationResult;
                if (filename.exists()) {
                    confirmationResult = JOptionPane.showConfirmDialog(
                            saveAsFile, "Replace existing file?");
                    if (confirmationResult == JOptionPane.YES_OPTION) {
                        saveFile(filename);
                    }
                } else {
                    saveFile(filename);
                }
            }
        } else if (event.getSource() == exit) {
            System.exit(0);
        } else if (event.getSource() == compile) {
            capturePane.resetText();
            if (opened == false && saved == false) {

            } else {
                quickSave(openedFile);
                try {
                    ANTLRReaderStream input = new ANTLRReaderStream(
                            new FileReader(openedFile));
                    ABCLexer lexer = new ABCLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    ABCParser parser = new ABCParser(tokens);

                    CommonTree root = parser.goal().getTree();

                    // parser.pr
                    // System.out.println(root.getLine());

                    SymbolTableVisitor stVisitor = new SymbolTableVisitor();
                    stVisitor.visit(root);
                    SymbolTable symTab = stVisitor.getSymbolTable();
                    // System.out.println("SymbolTable\n____________________________________________________");
                    // symTab.printTable();
                    symTab.resetTable();

                    // System.out.println("Type Chechecking\n____________________________________________________");
                    try {
                        TypeCheckingVisitor typecheck = new TypeCheckingVisitor(
                                symTab);
                        typecheck.visit(root);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        return;
                    }
                    // System.out.println("Type Checking did not found any error.");

                    symTab.resetTable();

                    // System.out.println("CodeGeneration\n____________________________________________________");
                    if (parser.getNumberOfSyntaxErrors() == 0) {
                        CodeGenerationVisitor codeGeneration = new CodeGenerationVisitor(
                                symTab);
                        codeGeneration.visit(root);
                        codeGeneration.getClassFile().print();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (RecognitionException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        } else if (event.getSource() == run) {
            capturePane.resetText();
            if (opened == true) {
                String file = openedFile.getAbsolutePath().replace(".abc",
                        ".tjc");
                System.out.println(file);
                StackMachine interpreter = new StackMachine(new File(file));
                interpreter.execute();
            }
        } else if (event.getSource() == undoEdit) {
            try {
                undoManager.undo();
            } catch (CannotUndoException cu) {
                cu.printStackTrace();
            }
        } else if (event.getSource() == redoEdit) {
            try {
                undoManager.redo();
            } catch (CannotUndoException cur) {
                cur.printStackTrace();
            }
        } else if (event.getSource() == selectAll) {
            codepane.selectAll();
        } else if (event.getSource() == copy) {
            codepane.copy();
        } else if (event.getSource() == paste) {
            codepane.paste();
        } else if (event.getSource() == cut) {
            codepane.cut();
        }
    }

    public DefaultStyledDocument getFormater() {

        return new SyntaxDocument();
    }

    private int findLastNonWordChar(String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar(String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }

    // ============================================
    // GETTERS AND SETTERS
    // ============================================

    public JEditorPane getTextArea() {
        return codepane;
    }

    public void setTextArea(JTextPane text) {
        codepane = text;
    }
 // java undo and redo action classes

    class UndoHandler implements UndoableEditListener
    {

      /**
       * Messaged when the Document has created an edit, the edit is added to
       * <code>undoManager</code>, an instance of UndoManager.
       */
      @Override
    public void undoableEditHappened(UndoableEditEvent e)
      {
        undoManager.addEdit(e.getEdit());
        undoAction.update();
        redoAction.update();
      }
    }

    class UndoAction extends AbstractAction
    {
      public UndoAction()
      {
        super("Undo");
        setEnabled(false);
      }

      @Override
    public void actionPerformed(ActionEvent e)
      {
        try
        {
            undoManager.undo();
        }
        catch (CannotUndoException ex)
        {
          // TODO deal with this
          //ex.printStackTrace();
        }
        update();
        redoAction.update();
      }

      protected void update()
      {
        if (undoManager.canUndo())
        {
          setEnabled(true);
          putValue(Action.NAME, undoManager.getUndoPresentationName());
        }
        else
        {
          setEnabled(false);
          putValue(Action.NAME, "Undo");
        }
      }
    }

    class RedoAction extends AbstractAction
    {
      public RedoAction()
      {
        super("Redo");
        setEnabled(false);
      }

      @Override
    public void actionPerformed(ActionEvent e)
      {
        try
        {
            undoManager.redo();
        }
        catch (CannotRedoException ex)
        {
          // TODO deal with this
          ex.printStackTrace();
        }
        update();
        undoAction.update();
      }

      protected void update()
      {
        if (undoManager.canRedo())
        {
          setEnabled(true);
          putValue(Action.NAME, undoManager.getRedoPresentationName());
        }
        else
        {
          setEnabled(false);
          putValue(Action.NAME, "Redo");
        }
      }
    }

}