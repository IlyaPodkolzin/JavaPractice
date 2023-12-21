package java16;

import javax.swing.*;
import java.awt.*;

public class ColorAndFontChoice extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar menuBar = new JMenuBar();

    ColorAndFontChoice() {
        super("Color and font choice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        JMenu jMenu = new JMenu("Color");
        JMenuItem jMenuItem = new JMenuItem("Blue");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Red");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.RED));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Black");
        jMenuItem.addActionListener(e -> textArea.setForeground(Color.BLACK));
        jMenu.add(jMenuItem);
        menuBar.add(jMenu);

        jMenu = new JMenu("Font");
        jMenuItem = new JMenuItem("Times New Roman");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("MS Sans Serif");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Courier New");
        jMenuItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 20)));
        jMenu.add(jMenuItem);
        menuBar.add(jMenu);

        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        setJMenuBar(menuBar);
        add(textArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorAndFontChoice();
    }
}
