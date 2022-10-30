package ru.mirea.prk16.z3;

import javax.swing.*;

public class MainFrame extends JFrame{

    private JTextField winnerDRAWTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JPanel Panel;



    private  MainFrame(){
        super("Проверка пароля на Джава");
        setContentPane(Panel);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {

        new MainFrame();
    }
}
