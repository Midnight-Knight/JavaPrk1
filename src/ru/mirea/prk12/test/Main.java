package ru.mirea.prk12.test;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JTextField A = new JTextField();
    Font Af = new Font("Times new roman",Font.BOLD,20);
    public static void main(String[] args)
    {
        new Main();

    }

    public Main()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(750,300);
        add(A, BorderLayout.CENTER);
        A.setForeground(Color.RED);
        A.setText("Red");
        A.setFont(Af);
        setVisible(true);
    }
}
