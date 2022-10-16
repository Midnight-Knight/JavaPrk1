package ru.mirea.prk9.z1;

public class Main {
    public static void main(String[] args)
    {
        Test A = new Test(5);
        System.out.println(A.toString());
        A.sort();
        System.out.println(A.toString());
    }
}
