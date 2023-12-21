package java22;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

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
    JButton spaceButton = new JButton("SPACE");
    JLabel result = new JLabel("", SwingConstants.RIGHT);
    //    boolean hasAction = false;
    boolean hasPoint = false;

    Calculator() {
        super("Калькулятор");
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

        spaceButton.addActionListener(e -> {
            result.setText(result.getText() + " ");
            hasPoint = false;
        });

        add(result);
        add(actionPanel);
        add(spaceButton);
        setVisible(true);
    }

    private void addButtons() {

        for (JButton button : numButtons)
            button.addActionListener(e -> result.setText(result.getText() + button.getText()));

        for (JButton button : calcButtons)
            button.addActionListener(e -> {
                result.setText(result.getText() + button.getText());
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

        enterButton.addActionListener(e -> calculate());

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
        String[] text = result.getText().split(" ");

        Stack<Double> nums = new Stack<>();
        Double a, b;
        for (String i : text) {
            if (!i.isEmpty()) {
                if (i.contains("+") || i.contains("-") || i.contains("*") || i.contains("/")) {
                    if (i.replaceAll(" ", "").length() != 1) {
                        alertMessage("Используйте пробелы!");
                        return;
                    }
                    if (nums.size() < 2) {
                        alertMessage("Стек пуст!");
                        return;
                    }

                    b = nums.pop();
                    a = nums.pop();

                    switch (i) {
                        case "+" -> nums.push(a + b);
                        case "-" -> nums.push(a - b);
                        case "*" -> nums.push(a * b);
                        case "/" -> {
                            if (b == 0) {
                                alertMessage("Деление на 0!");
                                return;
                            }
                            nums.push(a / b);
                        }
                    }
                } else {
                    nums.push(Double.parseDouble(i));
                }
            }
        }
        if (nums.size() == 1) {
            a = nums.pop();
            if (a % 1 == 0) {
                result.setText(String.valueOf(a.intValue()));
                hasPoint = false;
            } else {
                result.setText(String.valueOf(a));
                hasPoint = true;
            }
        } else {
            alertMessage("Стек переполнен!");
        }
    }

    private void alertMessage(String text) {
        JOptionPane.showMessageDialog(null, text, "Ошибка", JOptionPane.INFORMATION_MESSAGE);
        result.setText("");
        hasPoint = false;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
