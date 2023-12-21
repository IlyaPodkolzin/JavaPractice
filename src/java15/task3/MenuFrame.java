package java15.task3;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JTextArea jTextArea = new JTextArea();
    JMenuBar menuBar = new JMenuBar();

    MenuFrame() {
        super("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        panel.setLayout(new GridLayout(2, 2, 20, 20));
        panel.add(button1);
        panel.add(button2);
        panel.add(jTextArea);
        menuBar.add(createMenu("File", new String[]{"Save", "Exit"}));
        menuBar.add(createMenu("Edit", new String[]{"Copy", "Cut", "Paste"}));
        menuBar.add(createMenu("Help", new String[]{}));
        setJMenuBar(menuBar);
        add(panel);
        setVisible(true);
    }

    private JMenu createMenu(String name, String[] items) {
        JMenu jMenu = new JMenu(name);
        for (String item : items) jMenu.add(new JMenuItem(item));
        return jMenu;
    }

    public static void main(String[] args) {
        new MenuFrame();
    }
}
