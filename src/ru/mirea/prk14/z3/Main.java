package ru.mirea.prk14.z3;
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
        Pattern p1 = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m1 = p1.matcher(str);
        ArrayList<String> ans = new ArrayList<>();
        while (m1.find())
        {
            ans.add(m1.group());
        }
        System.out.println(ans);
    }
}
