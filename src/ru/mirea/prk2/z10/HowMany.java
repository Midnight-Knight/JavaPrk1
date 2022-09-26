package ru.mirea.prk2.z10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args)
    {
        System.out.print("Для прекращения ввода слов введите 'End': ");
        String vvod;
        String Line = "";
        Scanner scanner = new Scanner(System.in);
        do
        {
                vvod = scanner.nextLine();
                if ((vvod.equals("End")))
                {

                }
                else
                {
                    Line+=vvod;
                    Line+=" ";
                }
        }
        while (!(vvod.equals("End")));
        int n = 0;
        for (int i = 0; i < Line.length(); ++i)
        {
            if(' ' == Line.charAt(i))
            {
                ++n;
            }
        }
        System.out.println(n);
    }
}
