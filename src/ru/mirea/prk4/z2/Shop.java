package ru.mirea.prk4.z2;

public class Shop {
    private Catalog[] catalog;
    private int N;

    public Shop()
    {
        N = 3;
        catalog = new Catalog[N];
        catalog[0] = new Catalog(1);
        catalog[1] = new Catalog(2);
        catalog[2] = new Catalog(3);
    }

    public void Test()
    {
        for (int i = 0; i < N; ++i)
        {
            System.out.println(catalog[i].toString());
        }
    }
}
