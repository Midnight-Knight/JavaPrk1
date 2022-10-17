/*package ru.mirea.prk2.z3;
import java.util.Scanner;

public class Tester {
    private Circle[] Array;
    private int Lot;

    public Tester(int Lot) {
        while (Lot <= 0)
        {
            Lot = 1;
        }
        this.Lot = Lot;
        Array = new Circle[Lot];
        for (int i = 0;i < Lot; ++i)
        {
            Array[i] = new Circle();
        }
    }

    public void setNMoveArrayData(int n, double xDisp, double yDisp) {
       if ((n > -1) && (n < Lot))
       {
           Array[n].move(xDisp, yDisp);
       }
    }

    public String toString(int n)
    {
        if ((n > -1) && (n < Lot))
        {
            return Array[n].toString();
        }
        else {
            return "not n!";
        }
    }
}
 */