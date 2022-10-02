package ru.mirea.prk5.z4;
import java.util.Scanner;

public class Matrix {
    private int height;
    private int width;
    private double[][] number;

    public Matrix(int height, int width)
    {
        Scanner scanner = new Scanner(System.in);
        this.height=height;
        this.width=width;
        number = new double[height][width];
        for (int i = 0; i < this.height; ++i)
        {
            for (int j=0; j < this.width;++j)
            {
                System.out.printf("Ячейка %Sx%s: ",i+1,j+1);
                number[i][j] = scanner.nextDouble();
            }
        }
    }
}
