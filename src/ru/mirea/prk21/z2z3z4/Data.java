package ru.mirea.prk21.z2z3z4;

public class Data<T> {
    private T[] type;

    public Data(T[] type)
    {
        this.type = type;
    }

    public int len()
    {
        return type.length;
    }

    public T getTypeId(int N)
    {
        if (N < len())
        {
            return type[N];
        }
        else
        {
            return null;
        }
    }

    public T[] getType()
    {
        if (len() < 5)
        {
            for (int i = 0; i < len(); ++i)
            {
                System.out.println(type[i]);
            }
        }
        else
        {
            for (int i = 0; i < 5; ++i)
            {
                System.out.println(type[i]);
            }
        }
        return type;
    }
}
