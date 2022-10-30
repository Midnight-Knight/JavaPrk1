package ru.mirea.prk15.z4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    private static int[] number = {0,0};

    private static int operation(int operation, TextField tf, TextField to)
    {
        if (operation == 0)
        {
            tf.setText(number[0]+" N "+number[1]);
            to.setText("N");
        }
        else if (operation == 1)
        {
            tf.setText(number[0]+" + "+number[1]);
            int a = number[0] + number[1];
            to.setText(""+a);
        }
        else if (operation == 2)
        {
            tf.setText(number[0]+" - "+number[1]);
            int a = number[0] - number[1];
            to.setText(""+a);
        }
        else if (operation == 3)
        {
            tf.setText(number[0]+" * "+number[1]);
            int a = number[0] * number[1];
            to.setText(""+a);
        }
        else if (operation == 4)
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
        return operation;
    }

    private static void calculation(int operation, int numberCH, TextField tf, TextField to)
    {
        if (operation == 0)
        {
            if (number[0] == 0)
            {
                number[0] = numberCH;
            }
            else
            {
                number[0] = number[0] * 10;
                number[0] += numberCH;
            }
        }
        else
        {
            if (number[1] == 0)
            {
                number[1] = numberCH;
            }
            else
            {
                number[1] = number[1] * 10;
                number[1] += numberCH;
            }
        }

        if (operation == 0)
        {
            tf.setText(number[0]+" N "+number[1]);
            to.setText("N");
        }
        else if (operation == 1)
        {
            tf.setText(number[0]+" + "+number[1]);
            int a = number[0] + number[1];
            to.setText(""+a);
        }
        else if (operation == 2)
        {
            tf.setText(number[0]+" - "+number[1]);
            int a = number[0] - number[1];
            to.setText(""+a);
        }
        else if (operation == 3)
        {
            tf.setText(number[0]+" * "+number[1]);
            int a = number[0] * number[1];
            to.setText(""+a);
        }
        else if (operation == 4)
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

    public static void main(String[] args)
    {
        Frame f=new Frame("ActionListener Example");
        int heightButton = 40;
        int weightButton = 80;

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
                operation[0] = operation(1, tf, to);
            }
        });

        Button Minus=new Button("-");
        Minus.setBounds(140,100,60,30);
        Minus.setSize(weightButton,heightButton);
        Minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = operation(2, tf, to);
            }
        });

        Button Multiplication=new Button("*");
        Multiplication.setBounds(230,100,60,30);
        Multiplication.setSize(weightButton,heightButton);
        Multiplication.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = operation(3, tf, to);
            }
        });

        Button Division=new Button("/");
        Division.setBounds(320,100,60,30);
        Division.setSize(weightButton,heightButton);
        Division.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = operation(4, tf, to);
            }
        });

        Button One=new Button("1");
        One.setBounds(50,150,60,30);
        One.setSize(weightButton,heightButton);
        One.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],1,tf,to);
            }
        });

        Button Two=new Button("2");
        Two.setBounds(140,150,60,30);
        Two.setSize(weightButton,heightButton);
        Two.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],2,tf,to);
            }
        });

        Button Three=new Button("3");
        Three.setBounds(230,150,60,30);
        Three.setSize(weightButton,heightButton);
        Three.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],3,tf,to);
            }
        });

        Button Four=new Button("4");
        Four.setBounds(50,200,60,30);
        Four.setSize(weightButton,heightButton);
        Four.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],4,tf,to);
            }
        });

        Button Five=new Button("5");
        Five.setBounds(140,200,60,30);
        Five.setSize(weightButton,heightButton);
        Five.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],5,tf,to);
            }
        });

        Button Six=new Button("6");
        Six.setBounds(230,200,60,30);
        Six.setSize(weightButton,heightButton);
        Six.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],6,tf,to);
            }
        });

        Button Seven=new Button("7");
        Seven.setBounds(50,250,60,30);
        Seven.setSize(weightButton,heightButton);
        Seven.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],7,tf,to);
            }
        });

        Button Eight=new Button("8");
        Eight.setBounds(140,250,60,30);
        Eight.setSize(weightButton,heightButton);
        Eight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],8,tf,to);
            }
        });

        Button Nine=new Button("9");
        Nine.setBounds(230,250,60,30);
        Nine.setSize(weightButton,heightButton);
        Nine.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],9,tf,to);
            }
        });

        Button Zero=new Button("0");
        Zero.setBounds(320,250,60,30);
        Zero.setSize(weightButton,heightButton);
        Zero.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculation(operation[0],0,tf,to);
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