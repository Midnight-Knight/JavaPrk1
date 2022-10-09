package ru.mirea.prk7.z8;

public class Main {
    public static void main(String[] args)
    {
        Printable[] test=new Printable[3];
        test[0]=new Book("Пушкин");
        test[1]=new Magazine("Космос");
        test[2]=new Book("Лев Толстой");
        Book A = new Book();
        A.getIng(test);
    }
}

