package ru.mirea.prk2.z2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args)
    {
        Ball A = new Ball();
        Scanner scanner = new Scanner(System.in);
        System.out.println(A.toString());
        System.out.print("Введите x: ");
        A.setX(scanner.nextDouble());
        System.out.printf("Введите y: ");
        A.setY(scanner.nextDouble());
        System.out.printf("x: %s%ny: %s",A.getX(),A.getY());
    }
}
