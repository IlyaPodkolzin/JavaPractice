package java15.task4;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JPanel actionPanel = new JPanel();
    JButton[] numButtons = {
            new JButton("0"),
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("7"),
            new JButton("8"),
            new JButton("9")
    };

    JButton[] calcButtons = {
            new JButton("/"),
            new JButton("*"),
            new JButton("-"),
            new JButton("+")
    };

    JButton enterButton = new JButton("=");
    JButton pointButton = new JButton(".");
    JLabel result = new JLabel("", SwingConstants.RIGHT);
    boolean hasAction = false;
    boolean hasPoint = false;

    Calculator() {
        super("Calculator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        actionPanel.setLayout(new GridLayout(4, 4, 20, 20));
        addButtons();

        result.setOpaque(true);
        result.setBackground(Color.lightGray);
        result.setMinimumSize(new Dimension(220, 50));
        result.setMaximumSize(new Dimension(220, 50));
        result.setPreferredSize(new Dimension(220, 50));
        result.setFont(new Font("Times new roman", Font.BOLD, 20));
        result.setHorizontalTextPosition(result.getHeight());

        add(result);
        add(actionPanel);
        setVisible(true);
    }

    private void addButtons() {

        for (JButton button : numButtons)
            button.addActionListener(e -> result.setText(result.getText() + button.getText()));

        for (JButton button : calcButtons)
            button.addActionListener(e -> {
                if (hasAction)
                    calculate();
                result.setText(result.getText() + button.getText());
                hasAction = true;
                hasPoint = false;
            });

        pointButton.addActionListener(e -> {
            if (!hasPoint) {
                hasPoint = true;
                if (!result.getText().isEmpty())
                    if ((int) result.getText().charAt(result.getText().length() - 1) >= '0' && (int) result.getText().charAt(result.getText().length() - 1) <= '9') {
                        result.setText(result.getText() + ".");
                        return;
                    }
                result.setText(result.getText() + "0.");
            }
        });

        enterButton.addActionListener(e -> {
            if (hasAction) {
                calculate();
                hasAction = false;
                hasPoint = true;
            }
        });

        actionPanel.add(numButtons[7]);
        actionPanel.add(numButtons[8]);
        actionPanel.add(numButtons[9]);
        actionPanel.add(calcButtons[0]);
        actionPanel.add(numButtons[4]);
        actionPanel.add(numButtons[5]);
        actionPanel.add(numButtons[6]);
        actionPanel.add(calcButtons[1]);
        actionPanel.add(numButtons[1]);
        actionPanel.add(numButtons[2]);
        actionPanel.add(numButtons[3]);
        actionPanel.add(calcButtons[2]);
        actionPanel.add(numButtons[0]);
        actionPanel.add(pointButton);
        actionPanel.add(enterButton);
        actionPanel.add(calcButtons[3]);
    }

    private void calculate() {
        String text = result.getText();

        if (text.contains("+"))
            result.setText(String.valueOf(Double.parseDouble(text.split("\\+")[0]) + Double.parseDouble(text.split("\\+")[1])));
        else if (text.contains("-"))
            result.setText(String.valueOf(Double.parseDouble(text.split("-")[0]) - Double.parseDouble(text.split("-")[1])));
        else if (text.contains("*"))
            result.setText(String.valueOf(Double.parseDouble(text.split("\\*")[0]) * Double.parseDouble(text.split("\\*")[1])));
        else if (text.contains("/")) {
            if (Double.parseDouble(text.split("/")[1]) != 0)
                result.setText(String.valueOf(Double.parseDouble(text.split("/")[0]) / Double.parseDouble(text.split("/")[1])));
            else {
                JOptionPane.showMessageDialog(null, "Division by 0", "Alert", JOptionPane.INFORMATION_MESSAGE);
                result.setText(text.split("/")[0]);
            }
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
