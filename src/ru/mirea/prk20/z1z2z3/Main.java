package ru.mirea.prk20.z1z2z3;

public class Main {
    public static void main(String[] aegs)
    {
        int b1 = 5;
        double b2 = 4.2;
        String b3 = "Да";
        Generics A = new Generics<>(b1, b2, b3);
        System.out.println(A.RNC());
    }
}
