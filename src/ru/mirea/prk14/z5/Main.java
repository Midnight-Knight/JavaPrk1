package ru.mirea.prk14.z5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(((0[1-9])|([1-2][0-9])|(3[0-1]))/((0[1-9])|(1[0-2]))/((19)|([2-9][0-9]))[0-9][0-9]\\D*)+");
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
