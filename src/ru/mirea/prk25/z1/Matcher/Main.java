package ru.mirea.prk25.z1.Matcher;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("java.*");
        Matcher matcher = pattern.matcher("javascript");
        System.out.println(matcher.find());

        String text = "c++ java javascript java";
        Pattern pattern1 = Pattern.compile("java");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            int start=matcher1.start();
            int end=matcher1.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
        System.out.println(matcher1.replaceFirst("type"));
        System.out.println(matcher1.replaceAll("type"));
        System.out.println(text);
    }
}
