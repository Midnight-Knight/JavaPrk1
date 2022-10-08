package ru.mirea.prk4.raz1.z10;

public class Main {
    public static void main(String[] args)
    {
        double x = 2000;
        Auto A = new Auto(70, 50, 50, 4, 200, x);
        Train B = new Train(350, 6800, 500, 70, 3000, x);
        Ship C = new Ship(35, 3000, 2000, 150, 4000, x);
        Plane D = new Plane(3000,1000, 8000, 120, 8000,x);
        System.out.println("Авто");
        System.out.printf("Время: %s%n",A.time());
        System.out.printf("Груз: %s%n",A.sumHeft());
        System.out.printf("Пассажиры: %s%n",A.sumPassenger());

        System.out.println("Поезд");
        System.out.printf("Время: %s%n",B.time());
        System.out.printf("Груз: %s%n",B.sumHeft());
        System.out.printf("Пассажиры: %s%n",B.sumPassenger());

        System.out.println("Судно");
        System.out.printf("Время: %s%n",C.time());
        System.out.printf("Груз: %s%n",C.sumHeft());
        System.out.printf("Пассажиры: %s%n",C.sumPassenger());

        System.out.println("Самолёт");
        System.out.printf("Время: %s%n",D.time());
        System.out.printf("Груз: %s%n",D.sumHeft());
        System.out.printf("Пассажиры: %s%n",D.sumPassenger());
    }

}
