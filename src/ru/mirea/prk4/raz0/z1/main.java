package ru.mirea.prk4.raz0.z1;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String A = "Весна";
        System.out.println(A);

        enum B {
            WINTER(-5.47, "Холодное"), SPRING(7.23, "Холодно-тёплое"), SUMMER(18.97, "Тёплое"), AUTUMN(6.6, "Тёпло-холодное");

            private double v;
            private String x;
            private B(double v, String x) {
                this.v=v;
                this.x=x;
            }

            public double getV() {
                return v;
            }

            public String getDescription()
            {
                return this.x+" время года";
            }
        };

        B season = B.SUMMER;
        switch (season)
        {
            case WINTER:
            {
                System.out.println("Я люблю зиму!");
                System.out.println(B.WINTER.getV());
                System.out.println(B.WINTER.getDescription());
                break;
            }
            case SPRING:
            {
                System.out.println("Я люблю весну!");
                System.out.println(B.SPRING.getV());
                System.out.println(B.SPRING.getDescription());
                break;
            }
            case SUMMER:
            {
                System.out.println("Я люблю лето!");
                System.out.println(B.SUMMER.getV());
                System.out.println(B.SUMMER.getDescription());
                break;
            }
            case AUTUMN:
            {
                System.out.println("Я люлю осень!");
                System.out.println(B.AUTUMN.getV());
                System.out.println(B.AUTUMN.getDescription());
                break;
            }
        }
        B[] season1;
        season1 = new B[4];
        season1[0] = B.WINTER;
        season1[1] = B.SPRING;
        season1[2] = B.SUMMER;
        season1[3] = B.AUTUMN;

        for (int i = 0; i < 4; ++i)
        {
            switch (season1[i])
            {
                case WINTER:
                {
                    System.out.println("Я люблю зиму!");
                    System.out.println(B.WINTER.getV());
                    System.out.println(B.WINTER.getDescription());
                    break;
                }
                case SPRING:
                {
                    System.out.println("Я люблю весну!");
                    System.out.println(B.SPRING.getV());
                    System.out.println(B.SPRING.getDescription());
                    break;
                }
                case SUMMER:
                {
                    System.out.println("Я люблю лето!");
                    System.out.println(B.SUMMER.getV());
                    System.out.println(B.SUMMER.getDescription());
                    break;
                }
                case AUTUMN:
                {
                    System.out.println("Я люлю осень!");
                    System.out.println(B.AUTUMN.getV());
                    System.out.println(B.AUTUMN.getDescription());
                    break;
                }
            }
        }

    }
}
