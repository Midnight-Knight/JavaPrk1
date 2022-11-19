package ru.mirea.prk21.z2z3z4;

public class Main {
    public static void main(String[] args)
    {
        Double[] B = new Double[10];
        B[0] = 1.2;
        B[1] = 2.4;
        B[2] = 3.6;
        B[3] = 4.8;
        B[4] = 6.0;
        B[5] = 7.2;
        B[6] = 8.4;
        B[7] = 9.6;
        B[8] = 10.8;
        B[9] = 12.0;
        Data<Double> A = new Data<Double>(B);
        System.out.println(A.len());
    }
}
