package ru.mirea.prk28AND29.z4;
import ru.mirea.prk28AND29.z2.Item;
import ru.mirea.prk28AND29.z3.List;

public interface Order {
    public boolean Add(Item item);
    public boolean Del(String Name);
    public int DelAll(String Name);
    public int SearchAll();
    public List Array();
    public int Cost();
    public int Search(String Name);
    public String[] ArrayString();
    public List ArrayCost();

}
