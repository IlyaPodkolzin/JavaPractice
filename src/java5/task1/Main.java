package java5.task1;
import javax.swing.*;
import java.awt.*;

public class Main {

    private static int ACMilan = 0;
    private static int RealMadrid = 0;

    private static final JButton button1 = new JButton("AC Milan");
    private static final JButton button2 = new JButton("Real Madrid");
    private static final JLabel label1 = new JLabel("Result: 0 X 0");
    private static final JLabel label2 = new JLabel("Last Scorer: N/A");
    private static final JLabel label3 = new JLabel("Winner: DRAW");

    public static void main(String[] args) {
//        //создаем фрейм окна с помощью конструктора
//        // онструктор берет параметр Ц название окна Ц это строка
//        JFrame frame = new JFrame("My First GUI");
//        // устанавливаем реакцию окна на закрытие по умолчанию
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //задаем свойства окна Ц его размеры в писксел€х
//        frame.setSize(300,300);
//        //создаем кнопку с помощью конструктора класса JButton
//        //конструктор берет параметр строку Ц название на кнопке
//        JButton button = new JButton("Press");
//        //добавл€ем кнопку к окну
//        frame.getContentPane().add(button);
//        //делаем окно видимым
//        frame.setVisible(true);

        JFrame frame = new JFrame("«адание 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        //создали панель
        JPanel panel= new JPanel();
        //задали свойство панели Ц цвет фона
        panel.setBackground(Color.GRAY);
        // задали свойство панели размеры
        panel.setPreferredSize( new Dimension(200,300));

        button1.addActionListener(e -> {
            incrementACMilan();
        });

        button2.addActionListener(e -> {
            incrementRealMadrid();
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        //добавили панель к фрейму
        frame.getContentPane().add(panel);
        //упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }

    private static void incrementACMilan() {
        ACMilan++;
        label1.setText("Result: " + ACMilan + " X " + RealMadrid);
        label2.setText("Last Scorer: AC Milan");
        switch (isMilanWinning()) {
            case 1:
                label3.setText("Winner: AC Milan");
                break;
            case 0:
                label3.setText("Winner: DRAW");
                break;
            case -1:
                label3.setText("Winner: Real Madrid");
                break;
        }
    }

    private static void incrementRealMadrid() {
        RealMadrid++;
        label1.setText("Result: " + ACMilan + " X " + RealMadrid);
        label2.setText("Last Scorer: Real Madrid");
        switch (isMilanWinning()) {
            case 1:
                label3.setText("Winner: AC Milan");
                break;
            case 0:
                label3.setText("Winner: DRAW");
                break;
            case -1:
                label3.setText("Winner: Real Madrid");
                break;
        }
    }

    private static int isMilanWinning() {
        return Integer.compare(ACMilan, RealMadrid);
    }
}
