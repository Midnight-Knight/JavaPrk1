package ru.mirea.prk32;

public interface OrderManager {
    int itemsQuantity(String var1);

    int itemsQuantity(MenuItem var1);

    Order[] getOrder();

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}

