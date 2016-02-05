package org.abc.texteditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class CapturePane extends JPanel implements Consumer {

    private JTextArea output;

    public CapturePane() {
        setLayout(new BorderLayout());
        // output = new JTextArea();
        output = new JTextArea(10, 100);
        output.setEditable(false);
        Border textBorder = BorderFactory.createBevelBorder(0, Color.RED,
                Color.RED);

        output.setBorder(BorderFactory.createCompoundBorder(textBorder,
                BorderFactory.createEmptyBorder(2, 5, 0, 0)));

        Font textFont = new Font("Verdana", 0, 14);
        output.setFont(textFont);

        add(new JScrollPane(output));
    }

    @Override
    public void appendText(final String text) {
        if (EventQueue.isDispatchThread()) {
            output.append(text);
            output.setCaretPosition(output.getText().length());
        } else {

            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    appendText(text);
                }
            });

        }
    }

    public void resetText() {
        output.setText("");
    }

    public JTextArea getOutput() {
        return output;
    }

    public void setOutput(JTextArea output) {
        this.output = output;
    }

}
