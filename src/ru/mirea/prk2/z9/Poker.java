package ru.mirea.prk2.z9;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < 5; ++j)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
