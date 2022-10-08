package ru.mirea.prk5.z4;

import javax.swing.*;

public class main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\гифки\\1.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\гифки\\2.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\гифки\\3.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\гифки\\4.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\гифки\\5.gif").getImage());
        Animation animImg = new Animation();
        while (true)
        {
            for (int i = 0; i < 5; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(38);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
