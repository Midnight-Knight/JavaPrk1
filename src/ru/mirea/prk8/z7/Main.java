package ru.mirea.prk8.z7;

public class Main {
    public static void main(String[] args)
    {
        final int x = 2;
        System.out.println(mnoj(12,x));
    }

    public static int mnoj(int x, int y)
    {
        if (x == 1)
        {
            return x;
        }
        else if((x % y) == 0)
        {
            System.out.printf("%s | %s%n",x,y);
            return mnoj((x/y),y);
        }
        else
        {
            return mnoj(x,++y);
        }
    }
}
