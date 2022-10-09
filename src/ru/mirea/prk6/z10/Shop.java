package ru.mirea.prk6.z10;
import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    private static ArrayList<Computer> A;

    public static String poiskNameCpu(String name)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getCpuName().equals(name))
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskNameRam(String name)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getRamName().equals(name))
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskNameMon(String name)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getMonName().equals(name))
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskPowerCpu(int power)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getCpuPower() == power)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskPowerRam(int power)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getRamPower() == power)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskPowerMon(int power)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getMonPower() == power)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskObjCpu(byte obj)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getCpuObj() == obj)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskObjRam(byte obj)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getRamObj() == obj)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static String poiskObjMon(byte obj)
    {
        int i = 0;
        for (i = 0; i < A.size(); ++i)
        {
            if (A.get(i).getMonObj() == obj)
            {
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во компьютеров: ");
        int n = scanner.nextInt();
        A = new ArrayList<>(n);
        Computer buf;
        for (int i = 0; i < n; ++i)
        {
            buf = new Computer();
            A.add(i, buf);
        }
        boolean end = false;
        while (end == false)
        {
            System.out.printf("%nМеню%n1.Добавить компьютер%n2.Удалить компьютер%n3.Найти компьютер%n0.Закрыть программу%n");
            n = scanner.nextInt();
            switch (n)
            {
                case 1:
                {
                    buf = new Computer();
                    A.add(buf);
                    break;
                }
                case 2:
                {
                    System.out.print("введите номер компьютера: ");
                    n = scanner.nextInt();
                    if (n > -1 && A.size() > n)
                    {
                        System.out.printf("Компьютер %s удалён!%n", A.get(n).getName());
                        A.remove(n);
                    }
                    break;
                }
                case 3:
                {
                    System.out.printf("Меню поиска\n1.Поиск по CPU\n2.Поиск по RAM\n3.Поиск по Монитору\n0.Назад\n");
                    n = scanner.nextInt();
                    switch (n)
                    {
                        case 1:
                        {
                            System.out.printf("Меню поиска%n1.Поиск по name%n2.Поиск по MHz%n3.Поиск по Core%n0.Назад%n");
                            n = scanner.nextInt();
                            switch (n)
                            {
                                case 1:
                                {
                                    System.out.print("Введите name CPU: ");
                                    System.out.println(poiskNameCpu(scanner.nextLine()));
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Введите MHz CPU: ");
                                    System.out.println(poiskPowerCpu(scanner.nextInt()));
                                    break;
                                }
                                case 3:
                                {
                                    System.out.print("Введите Core CPU: ");
                                    System.out.println(poiskObjCpu(scanner.nextByte()));
                                    break;
                                }
                            }
                            break;
                        }
                        case 2:
                        {
                            System.out.printf("Меню поиска%n1.Поиск по name%n2.Поиск по MHz%n3.Поиск по Gigabyte%n0.Назад%n");
                            n = scanner.nextInt();
                            switch (n)
                            {
                                case 1:
                                {
                                    System.out.print("Введите name RAM: ");
                                    System.out.println(poiskNameRam(scanner.nextLine()));
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Введите MHz RAM: ");
                                    System.out.println(poiskPowerRam(scanner.nextInt()));
                                    break;
                                }
                                case 3:
                                {
                                    System.out.print("Введите Gigabyte RAM: ");
                                    System.out.println(poiskObjRam(scanner.nextByte()));
                                    break;
                                }
                            }
                            break;
                        }
                        case 3:
                        {
                            System.out.printf("Меню поиска%n1.Поиск по name%n2.Поиск по Hz%n3.Поиск по diagonal%n0.Назад%n");
                            n = scanner.nextInt();
                            switch (n)
                            {
                                case 1:
                                {
                                    System.out.print("Введите name Monitor: ");
                                    System.out.println(poiskNameMon(scanner.nextLine()));
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Введите Hz Monitor: ");
                                    System.out.println(poiskPowerMon(scanner.nextInt()));
                                    break;
                                }
                                case 3:
                                {
                                    System.out.print("Введите diagonal Monitor: ");
                                    System.out.println(poiskObjMon(scanner.nextByte()));
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 0:
                {
                    end = true;
                }
            }
        }
    }
}
