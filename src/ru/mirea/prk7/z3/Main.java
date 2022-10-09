package ru.mirea.prk7.z3;

public class Main {
    public static void main(String[] args)
    {
        MovableRectangle A = new MovableRectangle(5,4,4,2,2,2);
        MovableRectangle B = new MovableRectangle(10,12, 2,4,2,2);
        MovableRectangle C = new MovableRectangle(-10,-20,2,2,2,3);
        System.out.println(A.SpeedTest(B));
        System.out.println(B.SpeedTest(C));
    }
}
