package ru.mirea.prk16.z2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    JLabel eastText = new JLabel("ВАО");
    JLabel westText = new JLabel("ЗАО");
    JLabel northText = new JLabel("САО");
    JLabel southText = new JLabel("ЮАО");
    JLabel centerText = new JLabel("ЦАО");



    public Main(){
        super("Курсор");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);
        Container window = getContentPane();
        window.add(northText, BorderLayout.NORTH);
        window.add(southText, BorderLayout.SOUTH);
        window.add(westText, BorderLayout.WEST);
        window.add(eastText, BorderLayout.EAST);
        window.add(centerText, BorderLayout.CENTER);



        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                eastText.setText("Добро пожаловать в ВАО");
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ВАО");
            }
        });

        eastText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                eastText.setText("ВАО");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                westText.setText("Добро пожаловать в ЗАО");
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЗАО");
            }
        });

        westText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                westText.setText("ЗАО");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                northText.setText("Добро пожаловать в САО");
                JOptionPane.showMessageDialog(null,"Добро пожаловать в САО");
            }
        });

        northText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                northText.setText("САО");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                southText.setText("Добро пожаловать ЮАО");
                JOptionPane.showMessageDialog(null,"Добро пожаловать ЮАО");
            }
        });

        southText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                southText.setText("ЮАО");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centerText.setText("Добро пожаловать в ЦАО");
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЦАО");
            }
        });

        centerText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                centerText.setText("ЦАО");
            }
        });

    }



    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
