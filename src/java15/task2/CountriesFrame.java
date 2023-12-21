package java15.task2;

import javax.swing.*;

public class CountriesFrame extends JFrame {

    JComboBox<String> jComboBox = new JComboBox<>(new String[]{
            "Australia",
            "China",
            "England",
            "Russia"
    });
    JPanel panel = new JPanel();
    JLabel label = new JLabel("You are in Australia now");


    CountriesFrame() {
        super("Countries");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        jComboBox.setSize(50, 100);
        jComboBox.addItemListener(e -> {
            label.setText("You are in " + jComboBox.getSelectedItem() + " now");
        });
        panel.add(jComboBox);
        panel.add(label);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountriesFrame();
    }
}
