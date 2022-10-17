package ru.mirea.prk12.z1;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    public static Shape1 toRandomizeShape()
    {
        int rand = (int)(Math.random() * 3);
        if (rand == 0)
            return new Rectangle1();
        else if (rand == 1)
            return new Circle1();
        else
            return new Square1();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int x=13;
        for (int i = 0; i < 10; ++i, x += 170) {
            int y = 33;
            for (int j = 0; j < 2; ++j, y += 140) {
                // Случайный цвет
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                // Случайная фигура
                Shape1 sh = toRandomizeShape();
                sh.setXY(x, y);
                sh.setColor(new Color(red, green, blue));

                // Отрисовка
                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square1"))
                    g.fillRect(sh.getX(), sh.getY(), 100, 100);
                else if (sh.getClass().getSimpleName().equals("Rectangle1"))
                    g.fillRect(sh.getX(), sh.getY(), 150, 100);
                else if (sh.getClass().getSimpleName().equals("Circle1"))
                    g.fillOval(sh.getX(), sh.getY(), 100, 100);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                Main tw = new Main();
            }
        });
    }
}
