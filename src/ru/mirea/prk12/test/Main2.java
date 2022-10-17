package ru.mirea.prk12.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main2 extends JFrame{
    JButton but1 = new JButton("One");
    JButton but2 =new JButton("two");
    JButton but3 = new JButton("three");
    public Main2()
    {
        setLayout(null);
        but1.setBounds(150,300,100,20);
        but2.setSize(80,400);
        but3.setLocation(300,100);
        but3.setSize(200,75);
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }

    public static void main(String[]args){
        new Main2().setVisible(true);
    }
}
