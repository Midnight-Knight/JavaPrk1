package ru.mirea.prk14.z7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}");
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
