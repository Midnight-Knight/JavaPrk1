package ru.mirea.prk25.z4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Pattern pattern1 = Pattern.compile("\\(");
        Pattern pattern2 = Pattern.compile("\\)");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Matcher matcher1 = pattern1.matcher(string);
        Matcher matcher2 = pattern2.matcher(string);
        int l = 0,r = 0;
        while (matcher1.find())
        {
            l++;
        }
        while (matcher2.find())
        {
            r++;
        }
        if (l - r == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}