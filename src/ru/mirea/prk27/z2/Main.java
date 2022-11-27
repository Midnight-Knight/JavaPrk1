package ru.mirea.prk27.z2;

public class Main {
    public static void main(String[] args)
    {
        Map map = new Map();
        map.Add("Деев","Леонид");
        map.Add("Иванов","Алексей");
        map.Add("Мандаринов","Иван");
        map.Add("Болтов","Дима");
        map.Add("Дубов","Никита");

        map.Add("Деев","Алексей");
        map.Add("Кашин","Олег");
        map.Add("Мандаринов","Никита");
        map.Add("Стеклов","Женя");
        map.Add("Яблочников","Костя");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
