package java12.task1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    // список цветов
    public static final Color[] colors = {
            Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.GRAY
    };

    public static void main(String[] args) {

        // создание окна
        JFrame frame = new JFrame("Shapes");
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                System.out.println("Paint!");
                Random random = new Random();

                // генерация фигур
                int num;
                int[] x;
                int[] y;
                for (int j = 0; j < 10; j++) {
                    g.setColor(colors[random.nextInt(5)]);
                    switch (random.nextInt(5)) {

                        case 0:
                            g.drawLine(random.nextInt(512), random.nextInt(512), random.nextInt(512), random.nextInt(512));
                            break;

                        case 1:
                            g.drawOval(random.nextInt(512), random.nextInt(512), random.nextInt(100), random.nextInt(100));
                            break;

                        case 2:
                            g.drawRect(random.nextInt(512), random.nextInt(512), random.nextInt(100), random.nextInt(100));
                            break;

                        case 3:
                            num = random.nextInt(10);
                            x = new int[num];
                            y = new int[num];

                            for (int i = 0; i < num; i++) {
                                x[i] = random.nextInt(512);
                                y[i] = random.nextInt(512);
                            }

                            g.drawPolygon(x, y, num);
                            break;

                        case 4:
                            num = random.nextInt(10);
                            x = new int[num];
                            y = new int[num];

                            for (int i = 0; i < num; i++) {
                                x[i] = random.nextInt(512);
                                y[i] = random.nextInt(512);
                            }

                            g.drawPolyline(x, y, num);
                            break;

                    }
                }
            }
        };

        // настройка окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(512, 512));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
