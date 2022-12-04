package ru.mirea.prk28AND29.z3;
import ru.mirea.prk28AND29.z1.Dish;
import ru.mirea.prk28AND29.z1.Drink;
import ru.mirea.prk28AND29.z2.Item;
import ru.mirea.prk28AND29.z4.Order;

public class MainTest {
    public static void main(String[] args)
    {
        Item[] item = new Item[6];
        item[0] = new Drink(100, "Кола", "");
        item[1] = new Drink(200, "Сок", "");
        item[2] = new Drink(300, "Пиво", "");
        item[3] = new Dish(400, "Салат", "");
        item[4] = new Dish(500, "Макароны", "");
        item[5] = new Dish(600, "Мясо", "");
        List list = new List();
        list.Add(item[0]);
        list.Add(item[1]);
        list.Add(item[2]);
        list.Add(item[3]);
        list.Add(item[4]);
        list.Add(item[5]);
        list.traverseList();
        System.out.println(list.Search("Пиво"));
        System.out.println(list.delete("Пиво"));
        System.out.println(list.delete("Пиво"));
        list.traverseList();
        System.out.println("\n" + list.Search("Пиво"));

        Order A = new InternetOrder();
        A.Add(item[0]);
        A.Add(item[1]);
        A.Add(item[2]);
        A.Add(item[3]);
        A.Add(item[4]);
        A.Add(item[5]);
        A.Add(item[4]);
        A.Add(item[4]);
        System.out.println(A.SearchAll());
        String[] B = A.ArrayString();
        for (int i = 0; i < B.length; ++i)
        {
            System.out.println(B[i]);
        }
        List C = A.ArrayCost();
        for (int i = 0; i < C.traverseKolVo(); ++i)
        {
            System.out.println(C.Search(i));
        }
    }
}
