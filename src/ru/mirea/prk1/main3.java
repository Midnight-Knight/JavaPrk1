package ru.mirea.prk1;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args)
    {
        System.out.printf("Argument count: %s %n",args.length);
        for (int i = 0; i < args.length; ++i)
        {
            System.out.printf("args %s %s %n",i,args[i]);
        }
    }
}
