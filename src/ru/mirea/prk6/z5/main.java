package ru.mirea.prk6.z5;

public class main {
    public static void main(String[] args)
    {
        Movable A = new MovableCircle(4,5,2,1, 10);
        System.out.println(A.toString());
        A.moveUp();
        A.moveLeft();
        System.out.println(A.toString());
    }
}
