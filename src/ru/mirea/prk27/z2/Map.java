package ru.mirea.prk27.z2;
import java.util.HashSet;
import java.util.HashMap;

public class Map {
    private String[] FirstName;
    private String[] SecondName;
    private int n;

    public Map()
    {
        FirstName = new String[10];
        SecondName = new String[10];
    };

    public void Add(String B,String A)
    {
        if (n == 10)
        {
            System.out.println("Элементы не добавлены, их больше 10!");
        }
        else
        {
            FirstName[n] = A;
            SecondName[n] = B;
            ++n;
            System.out.println("Кол-во пар равно "+n);
        }
    }

    public int getSameFirstNameCount()
    {
        if (n < 10)
        {
            System.out.println("Элементов недостаточно для подсчёта уникальности! Возвращаю 11");
            return 11;
        }
        else
        {
            HashSet<String> hashSet = new HashSet<String>();
            for (int i = 0; i < n; ++i)
            {
                hashSet.add(FirstName[i]);
            }
            return (n - hashSet.size())*2;
        }
    }

    public int getSameLastNameCount()
    {
        if (n < 10)
        {
            System.out.println("Элементов недостаточно для подсчёта уникальности! Возвращаю 11");
            return 11;
        }
        else
        {
            HashSet<String> hashSet = new HashSet<String>();
            for (int i = 0; i < n; ++i)
            {
                hashSet.add(SecondName[i]);
            }
            return (n - hashSet.size())*2;
        }
    }

    public HashMap<String, String> CreateMap()
    {
        HashMap<String, String> hashMap = null;
        hashMap = new HashMap<String, String>();
        for (int i = 0; i < n; ++i)
        {
            hashMap.put(SecondName[i],FirstName[i]);
        }
        if (hashMap.size() != 10)
        {
            System.out.println("Недостаточно пар или уникальных ключей(фамилий) для создания таблицы!");
            return null;
        }
        else
        {
            System.out.println("Таблица создана!");
            return hashMap;
        }
    }
}
