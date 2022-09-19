package ru.mirea.prk1;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A= new int[N];
        int Sum = 0;
        int i = 0;
        while (i < N)
        {
            A[i] = scanner.nextInt();
            Sum += A[i];
            ++i;
        }
        i = 0;
        int max = -2147483648;
        int min = 2147483647;
        while (i < N)
        {
            if (A[i] > max)
            {
                max = A[i];
            }
            if (A[i] < min)
            {
                min = A[i];
            }
            System.out.printf("%s ", A[i]);
            ++i;
        }
        System.out.printf("%nmax: %s%nmin: %s",max,min);
    }
}
