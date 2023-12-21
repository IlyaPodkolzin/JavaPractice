package java15.task1;

import javax.swing.*;
import java.awt.*;

class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton[] buttons = {new JButton("+"),
            new JButton("-"),
            new JButton("*"),
            new JButton("/"),
    };
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    LabExample() {
        super("Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(230, 150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        for (JButton button : buttons) addButton(button);
        setVisible(true);
    }

    private void addButton(JButton button) {
        add(button);
        button.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());

                switch (button.getText()) {
                    case "+" ->
                            JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    case "-" ->
                            JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    case "*" ->
                            JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                    case "/" ->
                            JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }


            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new LabExample();
    }
}
