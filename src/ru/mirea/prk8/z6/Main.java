package ru.mirea.prk8.z6;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(prost(20));
    }

    public static String prost(int x)
    {
        if(x == del(x,1+1))
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }

    public static int del(int x, int y)
    {
        if((x%y)!=0)
        {
            return del(x,y+1);
        }
        else
        {
            return y;
        }
    }
}
