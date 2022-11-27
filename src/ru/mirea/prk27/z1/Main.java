package ru.mirea.prk27.z1;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Леонид");
        hashSet.add("Иван");
        hashSet.add("Андрей");
        hashSet.add("Денис");
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet);
    }
}
