package ru.mirea.prk4.z2;

public class Product {
    private String name;
    private String characteristic;
    private double characteristicN;
    private int quantity;
    private int price;

    Product (String name, String characteristic, double characteristicN, int quantity, int price)
    {
        this.name=name;
        this.characteristic=characteristic;
        this.characteristicN=characteristicN;
        this.quantity=quantity;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public double getCharacteristicN() {
        return characteristicN;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setNew(String name, String characteristic, double characteristicN, int quantity, int price)
    {
        this.name=name;
        this.characteristic=characteristic;
        this.characteristicN=characteristicN;
        this.quantity=quantity;
        this.price=price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean Check(int x)
    {
        if (quantity-x >= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void Decrease(int x)
    {
        quantity -= x;
    }
}
