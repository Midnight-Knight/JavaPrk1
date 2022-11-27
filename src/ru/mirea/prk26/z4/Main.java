package ru.mirea.prk26.z4;


public class Main {
    public static void main(String[] args)
    {
        Hash hash = new Hash(6);
        hash.Add(6);
        hash.Add(0);
        hash.Add(3);
        hash.Add(1876);
        System.out.println(hash.getElement(4));
        System.out.println(hash.getElement(6));
        hash.Delete(6);
        System.out.println(hash.getElement(6));
        hash.Add(5);
        hash.Add(1);
        hash.Add(9);
        hash.Add(10);
        hash.Add(2);
        hash.Add(4);
        hash.Add(21);
        hash.Vivod();

    }
}
