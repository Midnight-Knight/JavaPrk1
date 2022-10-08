package ru.mirea.prk3.z5;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        while (n <= 0)
        {
            System.out.print("Введите число n: ");
            n = scanner.nextInt();
        }
        int[] A = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; ++i)
        {
            A[i] = random.nextInt((n - 0) + 1) - 0;
            System.out.printf("%s ",A[i]);
        }
        System.out.println();
        int x = 0;
        for (int i = 0; i < n; ++i)
        {
            if ((A[i] % 2) == 0)
            {
                ++x;
            }
        }
        if (x != 0)
        {
            int[] B = new int[x];
            x = 0;
            for (int i = 0; i < n; ++i)
            {
                if ((A[i] % 2) == 0)
                {
                    B[x] = A[i];
                    ++x;
                }
            }
            for (int i = 0; i < x; ++i)
            {
                System.out.printf("%s ",B[i]);
            }
        }
    }
}
