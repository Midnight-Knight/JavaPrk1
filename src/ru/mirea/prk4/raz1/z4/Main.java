package ru.mirea.prk4.raz1.z4;

public class Main {
    public static void main(String[] args)
    {
        Matrix A = new Matrix(3,3);
        Matrix B = new Matrix(3,3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        A.PlusMatrix(B);
        System.out.println(A.toString());
        A.Multiplication(3);
        System.out.println(A.toString());
    }
}
