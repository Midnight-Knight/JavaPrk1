package ru.mirea.prk22.z2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtPlusMinus;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtSolve;
    private JButton jbtClear;
    private JButton jbtDecimal;
    private double TEMP;
    private double START;
    private double SolveTEMP;
    private JTextField jtfResult;

    private boolean addBool = false;
    private boolean subBool = false;
    private boolean divBool = false;
    private boolean mulBool = false;
    private boolean operatorClicked = false;

    private boolean justSolved = false;


    String display = "0";

    public Main() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));
        p1.add(jbtAdd = new JButton("+"));
        p1.add(jbtNum4 = new JButton("4"));
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtSubtract = new JButton("-"));
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtDivide = new JButton("/"));
        p1.add(jbtNum0 = new JButton("0"));
        p1.add(jbtDecimal = new JButton("."));
        p1.add(jbtSolve = new JButton("="));
        p1.add(jbtMultiply = new JButton("*"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(jbtClear = new JButton("C"));
        p3.add(jbtPlusMinus = new JButton("+/-[n]"));

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.CENTER);
        p.add(p3, BorderLayout.SOUTH);

        add(p);

        jbtNum1.addActionListener(new ListenToButton());
        jbtNum2.addActionListener(new ListenToButton());
        jbtNum3.addActionListener(new ListenToButton());
        jbtNum4.addActionListener(new ListenToButton());
        jbtNum5.addActionListener(new ListenToButton());
        jbtNum6.addActionListener(new ListenToButton());
        jbtNum7.addActionListener(new ListenToButton());
        jbtNum8.addActionListener(new ListenToButton());
        jbtNum9.addActionListener(new ListenToButton());
        jbtNum0.addActionListener(new ListenToButton());
        jbtDecimal.addActionListener(new ListenToButton());

        jbtAdd.addActionListener(new ListenToAdd());
        jbtSubtract.addActionListener(new ListenToSubtract());
        jbtMultiply.addActionListener(new ListenToMultiply());
        jbtDivide.addActionListener(new ListenToDivide());
        jbtSolve.addActionListener(new ListenToSolve());
        jbtClear.addActionListener(new ListenToClear());
        jbtPlusMinus.addActionListener(new ListenToPlusMinus());


    }
    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            jtfResult.setText("0");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
            operatorClicked = false;

            justSolved = false;
            START = 0;
            TEMP = 0;
            SolveTEMP =0 ;
        }
    }

    class ListenToButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            JButton button = (JButton)e.getSource();
            String buttonLabel = button.getText();
            if (justSolved) {
                justSolved = false;
                jtfResult.setText(buttonLabel);
                operatorClicked = false;

            }
            else if ((operatorClicked)) {
                jtfResult.setText(buttonLabel);
                operatorClicked = false;
            }
            else if (display.equals("0")) {
                jtfResult.setText(buttonLabel);
            }
            else {
                jtfResult.setText(display + buttonLabel);
            }

        }

    }

    class ListenToPlusMinus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            TEMP = TEMP * -1;
            roundCheck(TEMP);
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            solveMethod(TEMP);
            START = TEMP;
            addBool = true;
            operatorClicked = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            solveMethod(TEMP);
            START = TEMP;
            subBool = true;
            operatorClicked = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            solveMethod(TEMP);
            START = TEMP;
            mulBool = true;
            operatorClicked = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            solveMethod(TEMP);
            START = TEMP;
            divBool = true;
            operatorClicked = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(  jtfResult.getText() );
            solveMethodEquals(SolveTEMP);

        }
    }

    public void solveMethod(double d) {
        if ( addBool == true  ) {
            TEMP = TEMP + START;
        }
        else if ( subBool == true  ) {
            TEMP = START - TEMP;
        }
        else if ( mulBool == true  ) {
            TEMP = START * TEMP;
        }
        else if ( divBool == true  ) {
            TEMP = START / TEMP;
        }

        roundCheck(TEMP);
        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;
        justSolved = true;
    }

    public void solveMethodEquals(double d) {
        if ( addBool == true  ) {
            SolveTEMP = TEMP + SolveTEMP;
        }
        else if ( subBool == true  ) {
            SolveTEMP = TEMP - SolveTEMP;
        }
        else if ( mulBool == true  ) {
            SolveTEMP = TEMP * SolveTEMP;
        }
        else if ( divBool == true  ) {
            SolveTEMP = TEMP / SolveTEMP;
        }

        roundCheck(SolveTEMP);
        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;
        operatorClicked = false;
        justSolved = true;
    }

    public void roundCheck(double d) {
        if (d % 1 == 0) {
            int result = (int)d;
            Integer iresult = (Integer)result;
            jtfResult.setText(  Integer.toString( iresult ) );
        }
        else {
            jtfResult.setText(  Double.toString( d ) );
        }
    }


    public static void main(String[] args) {
        Main calc = new Main();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}
