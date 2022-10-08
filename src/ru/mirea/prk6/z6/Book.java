package ru.mirea.prk6.z6;

public class Book implements Printable{
    private String name;

    public Book(String name)
    {
        this.name=name;
    }

    @Override
    public void print() {
        System.out.printf("%s%n",name);
    }
}
