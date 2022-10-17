package ru.mirea.prk12.z3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Main(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }


    public static void main(String[] args) {
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\0.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\1.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\2.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\3.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\4.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\5.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\6.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\7.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\8.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\9.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\10.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\11.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\12.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\13.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\14.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\15.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\16.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\17.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\18.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\19.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\20.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\21.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\Paket\\OneDrive\\Документы\\Гифка\\22.gif").getImage());


        Main A = new Main();
        while (true) {
            for (int i = 0; i < 23; i++)
            {
                image = framlist.get(i);
                A.repaint();
                try
                {
                    Thread.sleep(85);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
