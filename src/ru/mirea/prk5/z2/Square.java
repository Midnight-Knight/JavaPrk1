package ru.mirea.prk5.z2;

public class Square extends Shape{
    private int width = 100;

    public Square(){}

    public Square(int width)
    {
        this.width = width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getWidth()
    {
        return width;
    }
}