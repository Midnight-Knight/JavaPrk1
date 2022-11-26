package ru.mirea.prk25.z3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.find());
    }
}
