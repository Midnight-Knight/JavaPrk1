package ru.mirea.prk2.z4;
import java.util.Scanner;

public class Shop {
    private PC[] list;
    private int Lot;

    public Shop(int Lot)
    {
        if (Lot < 1)
        {
            Lot = 1;
        }
        this.Lot=Lot;
        list = new PC[this.Lot];
        Scanner scanner = new Scanner(System.in);
        String CPU;
        String GPU;
        int RAM;
        int ROM;
        for (int i = 0; i < this.Lot; ++i)
        {
            System.out.printf("Введите название процессора для ПК №%s: ",i);
            CPU = scanner.nextLine();
            System.out.printf("Введите название графического процессора для ПК №%s: ",i);
            GPU = scanner.nextLine();
            System.out.printf("Введите кол-во оперативной памяти(в гб) для ПК №%s: ",i);
            RAM = scanner.nextInt();
            System.out.printf("Введите кол-во памяти(в гб) дискового накопителя для ПК №%s: ",i);
            ROM = scanner.nextInt();
            scanner.nextLine();
            list[i] = new PC(CPU,GPU,RAM,ROM);
        }
        System.out.println("Создание товаров завершено!");
    }

    public void SearchCPU(String CPU)
    {
        boolean SearchYes = false;
        boolean[] ListSearch;
        ListSearch = new boolean[Lot];
        int i;
        for (i = 0; i < Lot; ++i)
        {
            ListSearch[i] = false;
            if (list[i].getCPU().equals(CPU))
            {
                ListSearch[i] = true;
                SearchYes = true;
            }
        }
        if (SearchYes == true)
        {
            System.out.println("Есть совпадения в БД магазина!");
            for(i = 0; i < Lot; ++i)
            {
                if (ListSearch[i] == true)
                {
                    System.out.printf("%nПК №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("Поиск не обнаружил подходящих ПК!");
        }
    }

    public void SearchGPU(String GPU)
    {
        boolean SearchYes = false;
        boolean[] ListSearch;
        ListSearch = new boolean[Lot];
        int i;
        for (i = 0; i < Lot; ++i)
        {
            ListSearch[i] = false;
            if (list[i].getGPU().equals(GPU))
            {
                ListSearch[i] = true;
                SearchYes = true;
            }
        }
        if (SearchYes == true)
        {
            System.out.println("Есть совпадения в БД магазина!");
            for(i = 0; i < Lot; ++i)
            {
                if (ListSearch[i] == true)
                {
                    System.out.printf("%nПК №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("Поиск не обнаружил подходящих ПК!");
        }
    }

    public void SearchRAM(int RAM)
    {
        boolean SearchYes = false;
        boolean[] ListSearch;
        ListSearch = new boolean[Lot];
        int i;
        for (i = 0; i < Lot; ++i)
        {
            ListSearch[i] = false;
            if (list[i].getRAM() == RAM)
            {
                ListSearch[i] = true;
                SearchYes = true;
            }
        }
        if (SearchYes == true)
        {
            System.out.println("Есть совпадения в БД магазина!");
            for(i = 0; i < Lot; ++i)
            {
                if (ListSearch[i] == true)
                {
                    System.out.printf("%nПК №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("Поиск не обнаружил подходящих ПК!");
        }
    }

    public void SearchROM(int ROM)
    {
        boolean SearchYes = false;
        boolean[] ListSearch;
        ListSearch = new boolean[Lot];
        int i;
        for (i = 0; i < Lot; ++i)
        {
            ListSearch[i] = false;
            if (list[i].getROM() == ROM)
            {
                ListSearch[i] = true;
                SearchYes = true;
            }
        }
        if (SearchYes == true)
        {
            System.out.println("Есть совпадения в БД магазина!");
            for(i = 0; i < Lot; ++i)
            {
                if (ListSearch[i] == true)
                {
                    System.out.printf("%nПК №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("Поиск не обнаружил подходящих ПК!");
        }
    }

    public void Catalog()
    {
        for(int i = 0; i < Lot; ++i)
        {
            System.out.printf("ПК №%s%n%s%n",i,list[i].toString());
        }
    }
}
