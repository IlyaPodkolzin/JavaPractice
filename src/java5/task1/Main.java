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
//        //������� ����� ���� � ������� ������������
//        //����������� ����� �������� � �������� ���� � ��� ������
//        JFrame frame = new JFrame("My First GUI");
//        // ������������� ������� ���� �� �������� �� ���������
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //������ �������� ���� � ��� ������� � ���������
//        frame.setSize(300,300);
//        //������� ������ � ������� ������������ ������ JButton
//        //����������� ����� �������� ������ � �������� �� ������
//        JButton button = new JButton("Press");
//        //��������� ������ � ����
//        frame.getContentPane().add(button);
//        //������ ���� �������
//        frame.setVisible(true);

        JFrame frame = new JFrame("������� 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        //������� ������
        JPanel panel= new JPanel();
        //������ �������� ������ � ���� ����
        panel.setBackground(Color.GRAY);
        // ������ �������� ������ �������
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
        //�������� ������ � ������
        frame.getContentPane().add(panel);
        //������� �� �����
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
