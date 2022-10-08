package ru.mirea.prk4.raz1.z2;

public class Phone {
    private long number = 0000_000_00_00L;
    private short model = 1;
    private double weight = 70;

    public Phone(long number, short model)
    {
        this.number=number;
        this.model=model;
    }

    public Phone()
    {

    }

    public Phone(long number, short model, double weight)
    {
        this(number,model);
        this.weight=weight;
    }

    public String toString()
    {
        return "Номер: "+this.number+" Модель: "+this.model+" Ширина: "+this.weight;
    }

    public String receiveCall(String name)
    {
        return "Звонит "+name;
    }

    public String receiveCall(String name,long number)
    {
        return "Звонит "+name+" ,Номер "+number;
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(int n, long[] number)
    {
        for(int i = 0; i < n; ++i)
        {
            System.out.println(number[i]);
        }
    }
}
