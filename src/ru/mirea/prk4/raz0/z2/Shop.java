package ru.mirea.prk4.raz0.z2;

import java.util.Scanner;

public class Shop {
    private Catalog[] catalog;
    private User user;
    private int N;
    private boolean end = false;
    private byte Choice;

    public Shop()
    {
        N = 3;
        catalog = new Catalog[N];
        catalog[0] = new Catalog(1);
        catalog[1] = new Catalog(2);
        catalog[2] = new Catalog(3);
    }

    public void Test()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Логин: ");
        String UserName = scanner.nextLine();
        System.out.print("Пароль: ");
        String Password = scanner.nextLine();
        User user = new User(UserName, Password);

        do {

            System.out.printf("\nМеню\n1.Каталоги\n2.Список товаров определённого каталога\n3.Корзина\n4.Закрыть магазин\nВведите номер: ");
            Choice = scanner.nextByte();
            switch (Choice)
            {
                case 1:
                {
                    System.out.println();
                    for (int i = 0; i < N; ++i)
                    {
                        System.out.printf("%s: %s%n",i,catalog[i].getNameCatalog());
                    }
                    break;
                }
                case 2:
                {
                    System.out.println();
                    for (int i = 0; i < N; ++i)
                    {
                        System.out.printf("%s: %s%n",i,catalog[i].getNameCatalog());
                    }
                    System.out.print("Введите номер каталога: ");
                    Choice = scanner.nextByte();
                    if ((Choice < N) && (-1 < Choice))
                    {
                        System.out.printf("%n%s",catalog[Choice].toString());
                    }
                    else
                    {
                        System.out.println("Каталог не определён!");
                    }
                    break;
                }
                case 3:
                {
                    System.out.printf("%nКорзина%n");
                    user.listProduct();
                    System.out.printf("%nМеню корзины%n1.Добавить%n2.Удалить%n3.Покупка%n4.Выйти%n");
                    Choice = scanner.nextByte();
                    switch (Choice)
                    {
                        case 1:
                        {
                            int x,y;
                            System.out.printf("Введите номер каталога: ");
                            x = scanner.nextInt();
                            System.out.printf("Введите номер товара: ");
                            y = scanner.nextInt();
                            user.AddProduct(catalog[x].getProduct(y));
                            break;
                        }
                        case 2:
                        {
                            System.out.print("Введите номер товара в корзине: ");
                            Choice = scanner.nextByte();
                            user.DelProduct(Choice);
                            break;
                        }
                        case 3:
                        {
                            if(user.checkBankID() == false)
                            {
                                System.out.printf("Введите номер карты: ");
                                int l1 = scanner.nextInt();
                                System.out.printf("Введите CVV/CVC2 карты: ");
                                int l2 = scanner.nextInt();
                                System.out.printf("Введите месяц карты: ");
                                byte l3 = scanner.nextByte();
                                System.out.printf("Введите год карты: ");
                                byte l4 = scanner.nextByte();
                                user.BankCard(l1,l2,l3,l4);
                            }
                            if(user.AddressCheck() == false)
                            {
                                System.out.print("Введите адресс: ");
                                scanner.nextLine();
                                String l5 = scanner.nextLine();
                                user.AddressNew(l5);
                            }
                            System.out.printf("%nСумма: %s Доставка по адрессу: %s%n1.Оплатить%n2.Выйти%n",user.Sum(),user.getAddress());
                            Choice = scanner.nextByte();
                            switch (Choice)
                            {
                                case 1:
                                {
                                    for (int i = user.listsize()-1; i  > -1; --i)
                                    {
                                        user.getProduct(i).Decrease(1);
                                        user.DelProduct(i);
                                    }
                                }
                                case 2: default:{}
                            }
                        }
                        case 4: default:{}
                    }
                    System.out.println();
                    break;
                }
                case 4:
                {
                    end = true;
                    break;
                }
                default:
                {
                    break;
                }
            }

        }while (end == false);

    }
}
