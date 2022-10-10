package ru.mirea.prk8.z5;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(Sum(123456));
    }

    public static int Sum(int x)
    {
        if(!((x%10) == x))
        {
            return (x%10)+Sum(x/10);
        }
        else
        {
            return x%10;
        }
    }


}
