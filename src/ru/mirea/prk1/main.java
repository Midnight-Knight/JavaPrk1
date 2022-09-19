package ru.mirea.prk1;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        float[] A= new float[N];
        float Sum = 0;
        for (int i = 0; i < N; ++i)
        {
            A[i] = scanner.nextFloat();
            Sum += A[i];
        }
        float Aver = Sum / N;
        for (int i = 0; i < N; ++i)
        {
            System.out.printf("%s ",A[i]);
        }
        System.out.printf("%nСумма: %s%nСреднее арифметическое: %s",Sum, Aver);
    }
}
