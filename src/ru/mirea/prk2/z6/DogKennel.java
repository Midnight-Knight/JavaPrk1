package ru.mirea.prk2.z6;
import java.util.Scanner;

public class DogKennel {
    private Dog[] Kennel;
    private int n;

    public DogKennel()
    {
        n = 1;
        Kennel = new Dog[n];
        Kennel[0] = new Dog();
    }

    public DogKennel(int n)
    {
        if ((n < 1))
        {
            n = 1;
            Kennel = new Dog[n];
            Kennel[0] = new Dog();
        }
        else {
            this.n = n;
            Kennel = new Dog[this.n];
            Scanner scanner = new Scanner(System.in);
            String name;
            int Age;
            for (int i = 0; i < this.n; ++i) {
                System.out.printf("Введите имя собаки №%s: ", i);
                name = scanner.nextLine();
                System.out.printf("Введите возраст собаки №%s: ", i);
                Age = scanner.nextInt();
                scanner.nextLine();
                Kennel[i] = new Dog(name, Age);
            }
        }
    }

    public void getSpisok()
    {
        for (int i = 0; i < n; ++i)
        {
            System.out.printf("Собака №%s %s%n",i,Kennel[i].toString());
        }
    }

    public void setName(int n, String name)
    {
        if ((n > -1) && (this.n>=n))
        {
            Kennel[n].setName(name);
        }
    }

    public void setAge(int n,int Age)
    {
        if ((n > -1) && (this.n>=n))
        {
            Kennel[n].setAge(Age);
        }
    }

    public void getHumanAge(int n)
    {
        if ((n > -1) && (this.n>=n))
        {
            System.out.println(Kennel[n].AgeHuman());
        }
    }
}
