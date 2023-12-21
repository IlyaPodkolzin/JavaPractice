package java12.task3;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel {
    private int x = 0;
    private boolean direction = true;
    private final String imgName = "C:\\Users\\gribk\\IdeaProjects\\JavaCourse\\src\\Practice_12\\Ex_3\\Images\\video_2023-09-30_12-49-32_";

    private Image image = new ImageIcon(imgName + "001.jpg").getImage();

    public static void main(String[] args) {

        // создание окна
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Animation animation = new Animation();

        // настройка окна
        animation.setPreferredSize(new Dimension(720, 720));
        frame.add(animation);
        frame.pack();
        frame.setVisible(true);

        // запуск времени
        Timer timer = new Timer(40, e -> {
            animation.repaint();
        });
        timer.start();
    }

    // загрузка картинки и её передвижение
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        x = (x + 1) % 94;
        image = new ImageIcon(imgName + String.format("%03d", x) + ".jpg").getImage();
        g.drawImage(image, 0, 0, null);
    }
}
