package ru.mirea.prk4.raz0.z2;

import java.util.Scanner;

public class Catalog {
    private String NameCatalog;
    private Product[] list;
    private int N;

    public Catalog (String NameCatalog, int N)
    {
        Scanner scanner = new Scanner(System.in);
        this.NameCatalog=NameCatalog;
        this.N=N;
        list = new Product[N];
        String name;
        String characteristic;
        double characteristicN;
        int quantity;
        int price;
        for (int i = 0; i < N; ++i)
        {
            name = scanner.nextLine();
            characteristic = scanner.nextLine();
            characteristicN = scanner.nextDouble();
            quantity = scanner.nextInt();
            price = scanner.nextInt();
            list[i] = new Product(name,characteristic,characteristicN,quantity,price);
        }
    }

    public Catalog (int x)
    {
        switch (x)
        {
            case 1:
            {
                NameCatalog = "Еда";
                N = 5;
                list = new Product[N];
                list[0] = new Product("Сыр","Калории на 100г",363,30,270);
                list[1] = new Product("Хлеб","Калории на 100г",266,60,54);
                list[2] = new Product("Колбаса","Калории на 100г",257,10,290);
                list[3] = new Product("Печенье","Калории на 100г",417,54,60);
                list[4] = new Product("Рыба","Калории на 100г",242.2,0,660);
                break;
            }
            case 2:
            {
                NameCatalog = "Одежда";
                N = 4;
                list = new Product[N];
                list[0] = new Product("Шапка","Размер RU",58,7,1300);
                list[1] = new Product("Куртка","Размер RU",54,2,15000);
                list[2] = new Product("Джинсы","Размер RU",32,10,8500);
                list[3] = new Product("Ботинки","Размер RU",45,3,11000);
                break;
            }
            case 3: default:
            {
                NameCatalog = "Наушники";
                N = 3;
                list = new Product[N];
                list[0] = new Product("Sony WH-1000XM4","Максимально воспроизводимая частота",40000,10,26000);
                list[1] = new Product("Apple AirPods Pro","Максимально воспроизводимая частота",20000,64,14000);
                list[2] = new Product("Marshall Major IV","Максимально воспроизводимая частота",20000,1,17000);
                break;
            }
        }
    }

    public String toString()
    {
        String a = "";
        a+="Раздел: "+this.NameCatalog+"\n";
        for (int i = 0; i < N; ++i)
        {
            a+="Товар №"+i+" , Название: "+this.list[i].getName()+" , Характеристика: "+this.list[i].getCharacteristic()+": "+this.list[i].getCharacteristicN()+" , Кол-во товара: "+this.list[i].getQuantity()+" , Цена: "+this.list[i].getPrice()+"\n";
        }
        return a;
    }

    public String getNameCatalog()
    {
        return NameCatalog;
    }

    public Product getProduct(int i)
    {
        return list[i];
    }
}
