package ru.mirea.prk6.z11;

public class Temp implements Convertable{

    private double CF = 1.8;
    private double CK = 273.15;


    @Override
    public double convert(double x, int y) {
        if (y == 1) {
            return 32 + x * CF;
        }
        else
        {
            return x + CK;
        }
    }
}
