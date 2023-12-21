package java5.task3;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                // загрузка нужной картинки
                Scanner scanner = new Scanner(System.in);
                System.out.println("ѕуть до изображени€: ");
                String file = scanner.next();

                Image image = new ImageIcon(file).getImage();
                g.drawImage(image, 0, 0, null);
            }
        };

        panel.setPreferredSize(new Dimension(630, 900));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
