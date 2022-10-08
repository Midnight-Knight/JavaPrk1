package ru.mirea.prk6.z4;

public class Phone implements Priceable {
    private int Price = 10;

    @Override
    public int getPrice()
    {
        return Price;
    }

}
