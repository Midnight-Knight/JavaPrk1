package ru.mirea.prk15.z1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    public static void main(String[] args)
    {
        Frame f=new Frame("ActionListener Example");
        int heightButton = 40;
        int weightButton = 80;
        int[] number = new int[2];
        number[0] = 0;
        number[1] = 0;
        final int[] operation = {0};

        final TextField tf = new TextField();
        tf.setBounds(50,50, 260,20);
        tf.setText(number[0]+" N "+number[1]);

        final TextField to = new TextField();
        to.setBounds(320, 50, 80, 20);
        to.setText("N");

        Button Plus=new Button("+");
        Plus.setBounds(50,100,60,30);
        Plus.setSize(weightButton,heightButton);
        Plus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = 1;
                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Minus=new Button("-");
        Minus.setBounds(140,100,60,30);
        Minus.setSize(weightButton,heightButton);
        Minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = 2;
                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Multiplication=new Button("*");
        Multiplication.setBounds(230,100,60,30);
        Multiplication.setSize(weightButton,heightButton);
        Multiplication.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = 3;
                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Division=new Button("/");
        Division.setBounds(320,100,60,30);
        Division.setSize(weightButton,heightButton);
        Division.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = 4;
                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button One=new Button("1");
        One.setBounds(50,150,60,30);
        One.setSize(weightButton,heightButton);
        One.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 1;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 1;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 1;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 1;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Two=new Button("2");
        Two.setBounds(140,150,60,30);
        Two.setSize(weightButton,heightButton);
        Two.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 2;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 2;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 2;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 2;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Three=new Button("3");
        Three.setBounds(230,150,60,30);
        Three.setSize(weightButton,heightButton);
        Three.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 3;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 3;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 3;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 3;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Four=new Button("4");
        Four.setBounds(50,200,60,30);
        Four.setSize(weightButton,heightButton);
        Four.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 4;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 4;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 4;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 4;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Five=new Button("5");
        Five.setBounds(140,200,60,30);
        Five.setSize(weightButton,heightButton);
        Five.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 5;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 5;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 5;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 5;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Six=new Button("6");
        Six.setBounds(230,200,60,30);
        Six.setSize(weightButton,heightButton);
        Six.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 6;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 6;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 6;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 6;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Seven=new Button("7");
        Seven.setBounds(50,250,60,30);
        Seven.setSize(weightButton,heightButton);
        Seven.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 7;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 7;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 7;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 7;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Eight=new Button("8");
        Eight.setBounds(140,250,60,30);
        Eight.setSize(weightButton,heightButton);
        Eight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 8;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 8;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 8;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 8;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Nine=new Button("9");
        Nine.setBounds(230,250,60,30);
        Nine.setSize(weightButton,heightButton);
        Nine.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 9;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 9;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 9;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 9;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button Zero=new Button("0");
        Zero.setBounds(320,250,60,30);
        Zero.setSize(weightButton,heightButton);
        Zero.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] == 0)
                {
                    if (number[0] == 0)
                    {
                        number[0] = 0;
                    }
                    else
                    {
                        number[0] = number[0] * 10;
                        number[0] += 0;
                    }
                }
                else
                {
                    if (number[1] == 0)
                    {
                        number[1] = 0;
                    }
                    else
                    {
                        number[1] = number[1] * 10;
                        number[1] += 0;
                    }
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button C=new Button("C");
        C.setBounds(320,150,60,30);
        C.setSize(weightButton,heightButton);
        C.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (operation[0] != 0 && number[1] != 0)
                {
                    number[1] /= 10;
                }
                else if (operation[0] != 0 && number[1] == 0)
                {
                    operation[0] = 0;
                }
                else if (operation[0] == 0 && number[0] != 0)
                {
                    number[0] /= 10;
                }

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });

        Button CE=new Button("CE");
        CE.setBounds(320,200,60,30);
        CE.setSize(weightButton,heightButton);
        CE.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = 0;
                number[0] = 0;
                number[1] = 0;

                if (operation[0] == 0)
                {
                    tf.setText(number[0]+" N "+number[1]);
                    to.setText("N");
                }
                else if (operation[0] == 1)
                {
                    tf.setText(number[0]+" + "+number[1]);
                    int a = number[0] + number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 2)
                {
                    tf.setText(number[0]+" - "+number[1]);
                    int a = number[0] - number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 3)
                {
                    tf.setText(number[0]+" * "+number[1]);
                    int a = number[0] * number[1];
                    to.setText(""+a);
                }
                else if (operation[0] == 4)
                {
                    tf.setText(number[0]+" / "+number[1]);
                    if (number[1] == 0)
                    {
                        to.setText("N");
                    }
                    else
                    {
                        int a = number[0] / number[1];
                        to.setText(""+a);
                    }
                }
            }
        });


        f.add(Plus);
        f.add(Minus);
        f.add(Multiplication);
        f.add(Division);
        f.add(One);
        f.add(Two);
        f.add(Three);
        f.add(Four);
        f.add(Five);
        f.add(Six);
        f.add(Seven);
        f.add(Eight);
        f.add(Nine);
        f.add(Zero);
        f.add(C);
        f.add(CE);

        f.add(tf);
        f.add(to);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}