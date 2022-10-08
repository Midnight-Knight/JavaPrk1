package ru.mirea.prk5.test;
import java.awt.*;
import javax.swing.*;

public class main {
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("Hello world");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200,150);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);
        jPanel.setPreferredSize(new Dimension(200,300));

        JButton jButton1 = new JButton("Press1");
        JButton jButton2 = new JButton("Press2");
        jPanel.add(jButton1);
        jPanel.add(jButton2);

        JLabel jLabel = new JLabel("Hello World", JLabel.CENTER);
        jPanel.add(jLabel);

        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
