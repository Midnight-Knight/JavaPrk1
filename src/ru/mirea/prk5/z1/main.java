package ru.mirea.prk5.z1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.GZIPOutputStream;
import javax.swing.*;

public class main {

    private static int Milan = 0;
    private static int Madrid = 0;

    public static void main(String[] args)
    {

        JFrame jFrame = new JFrame("Table");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200,150);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);
        jPanel.setPreferredSize(new Dimension(200,300));

        JButton jButton1 = new JButton("AC Milan");
        JButton jButton2 = new JButton("Real Madrid");
        jButton1.setBackground(Color.red);
        jButton2.setBackground(Color.blue);
        jPanel.add(jButton1);
        jPanel.add(jButton2);

        JLabel jLabel1 = new JLabel("Result: "+Milan+" X "+Madrid, JLabel.CENTER);
        JLabel jLabel2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel jLabel3 = new JLabel("Winner: DRAW", JLabel.CENTER);
        jPanel.add(jLabel1);
        jPanel.add(jLabel2);
        jPanel.add(jLabel3);

        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);

        ActionListener action1 = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Milan++;
                jLabel1.setText("Result: "+Milan+" X "+Madrid);
                jLabel2.setText("Last Scorer: Milan");
                if (Milan > Madrid)
                {
                    jLabel3.setText("Winner: Milan");
                }
                else if (Milan == Madrid)
                {
                    jLabel3.setText("Winner: DRAW");
                }
            }
        };

        ActionListener action2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                jLabel1.setText("Result: "+Milan+" X "+Madrid);
                jLabel2.setText("Last Scorer: Madrid");
                if (Milan < Madrid)
                {
                    jLabel3.setText("Winner: Madrid");
                }
                else if (Milan == Madrid)
                {
                    jLabel3.setText("Winner: DRAW");
                }
            }
        };

        jButton1.addActionListener(action1);
        jButton2.addActionListener(action2);
    }
}
