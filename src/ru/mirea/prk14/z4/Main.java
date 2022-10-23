package ru.mirea.prk14.z4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\w?\\s*\\d+\\s*\\+\\s*\\d+\\s*\\w?)");
        Matcher m1 = p1.matcher(str);
        boolean a = false;
        while (m1.find())
        {
            a = true;
        }
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
