package ru.mirea.prk7.z4;

public class Main {
    public static void main(String[] args)
    {
        MathCalculable A = new MathFunc();
        System.out.println(A.pov(2,10));
        System.out.println(A.module(2,2));
        System.out.println(3 * A.PI());
    }
}
