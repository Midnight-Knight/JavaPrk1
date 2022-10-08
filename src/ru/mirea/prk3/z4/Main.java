package ru.mirea.prk3.z4;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] A = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; ++i)
        {
            A[i] = random.nextInt((100 - 10) + 1) + 10;
            System.out.printf("%s ",A[i]);
        }
        boolean up = true;
        for (int i = 0; i < 3 && up == true; ++i)
        {
            if (A[i] > A[i+1])
            {
                up = false;
            }
        }
        System.out.println(up);
    }
}
