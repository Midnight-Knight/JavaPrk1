package ru.mirea.prk1.z5;

public class fact {
    private int N;

    public fact(int N)
    {
        this.N=N;
    }

    public fact()
    {
        this.N=0;
    }

    public void job()
    {
        if(N > 1)
        {
            int f = 1;
            System.out.printf("%s! = 1",N);
            for (int i = 2; i <= N; ++i)
            {
                f *= i;
                System.out.printf(" * %s",i);
            }
            System.out.printf(" = %s%n",f);
        }
        else if (N == 0 || N == 1)
        {
            System.out.printf("%s! = 1%n",N);
        }
        else
        {
            System.out.println("Факториал меньше 0");
        }
    }

}
