package ru.mirea.prk2.z9;
import java.util.Scanner;


public class Poker {
    public static void main(String[] args)
    {
        String[] suits = {"Пик","Бубен","Червь","Треф"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Валет","Королева","Король","Туз"};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c = "";
        int x;
        for (int i = 0; i < n; ++i)
        {
            c = "";
            for (int j = 0; j < 5; ++j)
            {
                x = (int)(Math.random()*(12-0));
                c+=rank[x];
                c+=" ";
                x = (int)(Math.random()*(3-0));
                c+=suits[x];
                c+=" | ";
            }
            System.out.println(c);
        }
    }
}
