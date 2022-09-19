package ru.mirea.prk1.z5;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите факториал числа N: ");
        int N = scanner.nextInt();
        fact A = new fact(N);
        A.job();
    }
}
