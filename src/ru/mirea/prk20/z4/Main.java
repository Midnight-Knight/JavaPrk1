package ru.mirea.prk20.z4;


public class Main extends Calculator{
    public static void main(String[] args)
    {
        Double[] B = new Double[3];
        B[0] = 1.2;
        B[1] = 3.4;
        B[2] = -2.4;
        Double C = sum(B[0], B[1]);
        System.out.println(C);
        C = subtraction(B[1], B[2]);
        System.out.println(C);
        MinMax<Double> D = new MinMax<Double>(B);
        D.Min();
    }
}
