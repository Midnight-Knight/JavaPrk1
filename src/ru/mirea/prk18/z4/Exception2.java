package ru.mirea.prk18.z4;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo()
    {
        String intString = "";
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный формат ввода!");
        }
        finally {
            System.out.printf("Введённые данные: %s",intString);
        }
    }
}
