package ru.mirea.prk28AND29.z5;
import java.util.HashMap;
import ru.mirea.prk28AND29.z4.Order;
import ru.mirea.prk28AND29.z2.Item;
import ru.mirea.prk28AND29.z6.OrderAlreadyAddedException;

public class OrderManager {
    private HashMap<String, Order> Array;

    public OrderManager()
    {
        Array = new HashMap<>();
    }

    public void Add(String address, Order order) throws OrderAlreadyAddedException
    {
        if (Array.containsKey(address) == true)
        {
            throw new OrderAlreadyAddedException("Подобный адрес/столик уже существует");
        }
        Array.put(address, order);
    }

    public void GerOrder(String address)
    {
        Array.get(address);
    }

    public void Del(String address)
    {
        Array.remove(address);
    }

    public void AddPosition(String address, Item item)
    {
        Order buf = Array.get(address);
        buf.Add(item);
        Array.replace(address, buf);
    }

    public Order[] GetOrdersArray()
    {
        Order[] bufOrder = new Order[Array.size()];
        int i = 0;
        for (String key: Array.keySet())
        {
            bufOrder[i] = Array.get(key);
            ++i;
        }
        return bufOrder;
    }

    public int Sum()
    {
        int sum = 0;
        for (String key: Array.keySet())
        {
            sum += Array.get(key).Cost();
        }
        return sum;
    }

    public int Bludo(String name)
    {
        int sum = 0;
        for (String key: Array.keySet())
        {
            sum += Array.get(key).Search(name);
        }
        return sum;
    }
}
