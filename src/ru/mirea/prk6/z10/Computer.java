package ru.mirea.prk6.z10;
import java.util.Scanner;

public class Computer {
    private String name;
    private CPU cpu;
    private RAM ram;
    private Monitor monitor;

    public Computer()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название PC: ");
        name = scanner.nextLine();

        cpu = new CPU();
        System.out.print("Введите название CPU: ");
        cpu.setName(scanner.nextLine());
        System.out.printf("Введите кол-во MHz CPU %s: ", cpu.getName());
        cpu.setPower(scanner.nextInt());
        System.out.printf("Введите кол-во ядер CPU %s: ", cpu.getName());
        cpu.setObj(scanner.nextByte());
        scanner.nextLine();

        ram = new RAM();
        System.out.print("Введите название RAM: ");
        ram.setName(scanner.nextLine());
        System.out.printf("Введите кол-во MHz RAM %s: ", ram.getName());
        ram.setPower(scanner.nextInt());
        System.out.printf("Введите кол-во гигабайт RAM %s: ", ram.getName());
        ram.setObj(scanner.nextByte());
        scanner.nextLine();

        monitor = new Monitor();
        System.out.print("Введите название монитора: ");
        monitor.setName(scanner.nextLine());
        System.out.printf("Введите кол-во Hz монитора %s: ", monitor.getName());
        monitor.setPower(scanner.nextInt());
        System.out.printf("Введите диагональ монитора %s: ", monitor.getName());
        monitor.setObj(scanner.nextByte());
    }

    public String getCpuName()
    {
        return cpu.getName();
    }

    public String getRamName()
    {
        return ram.getName();
    }

    public String getMonName()
    {
        return monitor.getName();
    }

    public int getCpuPower()
    {
        return cpu.getPower();
    }

    public int getRamPower()
    {
        return ram.getPower();
    }

    public int getMonPower()
    {
        return monitor.getPower();
    }

    public int getCpuObj()
    {
        return cpu.getObj();
    }

    public int getRamObj()
    {
        return ram.getObj();
    }

    public int getMonObj()
    {
        return monitor.getObj();
    }

    public String getName() {
        return name;
    }

    public String getCPU()
    {
        return "CPU: "+cpu.getName()+",MHz: "+cpu.getPower()+",Core: "+cpu.getObj();
    }

    public String getRAM()
    {
        return "RAM: "+ram.getName()+",MHz: "+ram.getPower()+",Gigabyte: "+ram.getObj();
    }

    public String getMonitor()
    {
        return "Monitor: "+monitor.getName()+",Hz: "+monitor.getPower()+",Diagonal: "+monitor.getObj();
    }
}
