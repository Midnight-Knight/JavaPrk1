package ru.mirea.prk6.z6;

public class Shop implements Printable{
    Printable[] A;

    Shop(String a,String b,String c,String d,String f,String e)
    {
        A = new Printable[6];
        A[0] = new Book(a);
        A[1] = new Book(b);
        A[2] = new Book(c);
        A[3] = new Book(d);
        A[4] = new Book(f);
        A[5] = new Book(e);
    }


    @Override
    public void print() {
        for (int i = 0; i < 6; i++)
        {
            A[i].print();
        }
    }
}
