package ru.mirea.prk25.z1.Pattern;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("java");
        System.out.println(pattern);

        System.out.println();

        System.out.println(pattern.matcher("java"));
        System.out.println(pattern.matcher("javascript"));

        System.out.println();

        System.out.println(Pattern.matches("c++","java"));
        System.out.println(Pattern.matches("java","java"));

        System.out.println();

        System.out.println(pattern.pattern());

        System.out.println();

        Pattern pattern1 = Pattern.compile(" ");
        String[] strings = pattern1.split("python java typescript javascript c++");
        for (String s : strings)
        {
            System.out.println(s);
        }

        System.out.println();

        String[] strings1 = pattern1.split("python java typescript javascript c++", 3);
        for (String s : strings1)
        {
            System.out.println(s);
        }
    }
}
