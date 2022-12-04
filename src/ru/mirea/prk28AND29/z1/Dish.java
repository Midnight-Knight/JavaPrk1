package ru.mirea.prk28AND29.z1;
import java.lang.IllegalArgumentException;
import ru.mirea.prk28AND29.z2.Item;

public class Dish implements Item {
    private int Price;
    private String Name;
    private String Description;

    public Dish(int price, String name, String description) throws IllegalArgumentException {
        if (price <= 0)
        {
            throw new RuntimeException("Ошибка! Стоимость не может быть равна или меньше 0!");
        }
        if (name.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        if (description.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        Price = price;
        Name = name;
        Description = description;
    }

    @Override
    public int getPrice() {
        return Price;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getDescription() {
        return Description;
    }
}
