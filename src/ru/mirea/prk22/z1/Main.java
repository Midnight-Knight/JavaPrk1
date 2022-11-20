package ru.mirea.prk22.z1;
import static ru.mirea.prk22.z1.RPNCalculator.calculator;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            calculator();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка, а какая думайте сами!");
        }

    }
}
