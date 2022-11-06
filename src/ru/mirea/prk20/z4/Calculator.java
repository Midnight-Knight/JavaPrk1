package ru.mirea.prk20.z4;

public class Calculator {
    public static <T extends Number> double sum(T x1, T x2)
    {
        double x3 = x1.doubleValue() + x2.doubleValue();
        return x3;
    }
    public static <T extends Number> double multiply(T x1, T x2)
    {
        double x3 = x1.doubleValue() * x2.doubleValue();
        return x3;
    }
    public static <T extends Number> double divide(T x1, T x2)
    {
        double x3 = x1.doubleValue() / x2.doubleValue();
        return x3;
    }
    public static <T extends Number> double subtraction(T x1, T x2)
    {
        double x3 = x1.doubleValue() - x2.doubleValue();
        return x3;
    }
}
