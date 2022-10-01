package ru.mirea.prk3.z1;

public class main {
    public static void main(String[] args)
    {
        Double A = Double.valueOf(5);
        System.out.printf("Double: %s%n",A);

        String B = "4";
        A = Double.parseDouble(B);
        System.out.printf("Double: %s%n",A);

        int C1 = A.intValue();
        System.out.printf("int: %s%n",C1);
        byte C2 = A.byteValue();
        System.out.printf("byte: %s%n",C2);
        short C3 = A.shortValue();
        System.out.printf("short: %s%n",C3);
        long C4 = A.longValue();
        System.out.printf("long: %s%n",C4);
        float C5 = A.floatValue();
        System.out.printf("float: %s%n",C5);
        double C6 = A.doubleValue();
        System.out.printf("double: %s%n",C6);

        System.out.printf("Double: %s%n",A);
    }
}
