package ru.mirea.prk2.z6;

public class Main {
    public static void main(String[] args)
    {
        DogKennel A = new DogKennel(5);
        A.getSpisok();
        A.setAge(3, 10);
        A.setName(3, "yayaya");
        A.getSpisok();
        A.getHumanAge(3);
    }
}
