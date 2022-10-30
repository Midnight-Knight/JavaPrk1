package ru.mirea.prk16.z1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;


class Main extends JFrame {
    JButton tryButton = new JButton("Кнопка");
    JTextField numberField = new JTextField(2);
    JLabel stateText = new JLabel("Угадайте число (от 0 до 10)");
    int guessNumber = (int) (Math.random()*10);
    int cnt =0;

    public Main(){
        super("Игра");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel grid = new JPanel(new GridLayout(3,1,5,0));
        grid.add(stateText);
        grid.add(numberField);
        grid.add(tryButton);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(grid);

        Container window = getContentPane();
        window.add(flowButton);

        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNumber = Integer.parseInt(numberField.getText());
                if (userNumber==guessNumber){
                    stateText.setText("Вы выиграли");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
                else if (userNumber!=guessNumber){
                    if (userNumber<guessNumber){
                        stateText.setText("Это число больше");
                    }
                    else {
                        stateText.setText("Это число меньше");
                    }
                }
                cnt++;
                if (cnt==3 && userNumber!= guessNumber){
                    stateText.setText("Вы проиграли");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
