package ru.mirea.prk7.z4;

public class MathFunc implements MathCalculable{

    @Override
    public double pov(double x, double y) {
        for (int i = 1; i < y; ++i)
        {
            x*=x;
        }
        return x;
    }

    @Override
    public double module(double x, double y) {
        return Math.sqrt(((x*x)+(y*y)));
    }

    @Override
    public double PI() {
        return 3.1415926535;
    }
}
