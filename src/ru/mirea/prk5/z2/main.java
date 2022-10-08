package ru.mirea.prk5.z2;

import javax.swing.*;
import java.awt.*;

public class main extends JFrame{

    public static Shape getRandomShape()
    {
        int rand = (int)(Math.random() * 3);
        switch (rand)
        {
            case 0:
            {
                return new Rectangle();
            }
            case 1:
            {
                return new Circle();
            }
            default:
            {
                return new Square();
            }
        }
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        for (int i = 50; i < 800; i = i + 200)
        {
            for (int j = 50; j < 1250; j = j + 250) {
                Shape sh = getRandomShape();
                sh.setXY(j, i);
                int re = (int) (Math.random() * 255);
                int gr = (int) (Math.random() * 255);
                int bl = (int) (Math.random() * 255);
                sh.setColor(new Color(re, gr, bl));

                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square")) {
                    g.fillRect(sh.getX(), sh.getY(), 150, 150);
                } else if (sh.getClass().getSimpleName().equals("Circle")) {
                    g.fillOval(sh.getX(), sh.getY(), 150, 150);
                } else {
                    g.fillRect(sh.getX(), sh.getY(), 200, 150);
                }
            }
        }

    }

    public main()
    {
        super("Shape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300,850);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new main();
    }

}
