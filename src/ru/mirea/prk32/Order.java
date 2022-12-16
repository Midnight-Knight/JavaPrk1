package ru.mirea.prk32;

public interface Order {
    boolean add(MenuItem var1);

    String[] itemsNames();

    int itemsQuantity();

    int itemQuantity(String var1);

    int itemQuantity(MenuItem var1);

    MenuItem get(int var1);

    MenuItem[] getItems();

    boolean remove(String var1);

    boolean remove(MenuItem var1);

    int removeFew(String var1);

    int removeFew(MenuItem var1);

    MenuItem[] sortedItemsByCostDesc();

    int costTotal();

    Customer getCustomer();

    void setCustomer(Customer var1);

    String toString();

    String fileString();

    int hashCode();

    boolean equals(Object var1);


    void resize(int i);
}
