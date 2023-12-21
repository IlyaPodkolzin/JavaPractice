package java5.task4;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    private int x = 0;
    private boolean direction = true;
    private final String imgName = "D:\\Downloads\\Animation\\";

    private Image image = new ImageIcon(imgName + "0.jpg").getImage();

    public static void main(String[] args) {

        // �������� ����
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Animation animation = new Animation();

        // ��������� ����
        animation.setPreferredSize(new Dimension(1024, 1024));
        frame.add(animation);
        frame.pack();
        frame.setVisible(true);

        // ������ �������
        Timer timer = new Timer(240, e -> {
            animation.repaint();
        });
        timer.start();
    }

    // �������� �������� � � ������������
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        x = (x + 1) % 6;
        image = new ImageIcon(imgName + x + ".jpg").getImage();
        g.drawImage(image, 0, 0, null);
    }
}
