package ru.mirea.prk4.raz1.z4;
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

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private double getNumber(int x, int y)
    {
        return number[x][y];
    }

    public void PlusMatrix(Matrix Plus)
    {
        if (height == Plus.getHeight() && width == Plus.getWidth())
        {
            for (int i = 0; i < height; ++i)
            {
                for (int j = 0; j < width; ++j)
                {
                    number[i][j] += Plus.getNumber(i,j);
                }
            }
        }
    }

    public void Multiplication(double x)
    {
        for (int i = 0; i < height; ++i)
        {
            for (int j = 0; j < width; ++j)
            {
                number[i][j] *= x;
            }
        }
    }

    public String toString()
    {
        String matrix = "";
        for (int i = 0; i < height; ++i)
        {
            for (int j = 0; j < width; ++j)
            {
                matrix += "| "+this.number[i][j]+" ";
            }
            matrix += "|\n";
        }
        return matrix;
    }
}
