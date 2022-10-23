package ru.mirea.prk14.z6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("\\w+@(([a-z]+.[a-z]{2,3})|([a-z]+))");
        Matcher m1 = p1.matcher(str);
        boolean a = m1.matches();
        if (a == true)
        {
            System.out.println(str);
        }
        else
        {
            System.out.println("false");
        }
    }
}
