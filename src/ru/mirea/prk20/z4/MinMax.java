package ru.mirea.prk20.z4;

public class MinMax<T extends Number>{
    private T[] mass;

    public MinMax(T[] mass)
    {
        this.mass=mass;
    }

    public void Min()
    {
        T minNum = mass[0];
        for (int i = 0; i < mass.length; ++i)
        {
            if (mass[i].doubleValue() < minNum.doubleValue())
            {
                minNum = mass[i];
            }
        }
        System.out.println(minNum);
    }

    public void Max()
    {
        T maxNum = mass[0];
        for (int i = 0; i < mass.length; ++i)
        {
            if (mass[i].doubleValue() > maxNum.doubleValue())
            {
                maxNum = mass[i];
            }
        }
        System.out.println(maxNum);
    }

}
