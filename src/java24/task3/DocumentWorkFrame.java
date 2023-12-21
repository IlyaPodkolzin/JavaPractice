package java24.task3;

import java24.task3.TextDocument.CreateTextDocument;

import javax.swing.*;
import java.io.IOException;

public class DocumentWorkFrame extends JFrame {

    JMenuBar menuBar = new JMenuBar();

    IDocument document;

    ICreateDocument createDocument = new CreateTextDocument();

    final String PATH = "D:/Downloads";

    public DocumentWorkFrame() {
        super("Работа с документами");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        JMenu menu = new JMenu("File");
        JMenuItem menuItem;

        menuItem = new JMenuItem("New");
        menuItem.addActionListener(e -> {
            if (document != null)
                closeFile();
            String name = JOptionPane.showInputDialog("Введите имя файла:");
            if (name != null && !name.isEmpty()) {
                try {
                    document = createDocument.createNew(PATH + name);
                    document.createEditor(this);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Open");
        menuItem.addActionListener(e -> {
            if (document != null)
                closeFile();
            String name = JOptionPane.showInputDialog("Введите имя файла:");
            if (name != null && !name.isEmpty()) {
                document = createDocument.createOpen(PATH + name);
                try {
                    document.createEditor(this);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Save");
        menuItem.addActionListener(e -> {
            if (document != null) {
                try {
                    document.save();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(e -> closeFile());
        menu.add(menuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);
        setVisible(true);
    }

    private void closeFile() {
        if (document != null) {
            document.removeEditor(this);
            document = null;
        }
    }

    public static void main(String[] args) {
        new DocumentWorkFrame();
    }
}
