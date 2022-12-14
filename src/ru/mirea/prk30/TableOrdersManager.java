package ru.mirea.prk30;

public class TableOrdersManager implements OrderManager{
    private Order[] orders;
    private int size;



    public TableOrdersManager(int size) {
        this.size = 0;
        this.orders = new Order[size];
    }

    public void add(Order order)
    {
        for (int i = 0; i < orders.length; ++i)
        {
            if (orders[i] == null)
            {
                this.orders[size] = order;
                ++size;
                break;
            }
        }
    }

    private void resize(int new_lenght) {
        Order[] new_array = new Order[new_lenght];
        System.arraycopy(this.orders, 0, new_array, 0, this.size);
        this.orders = new_array;
    }

    public void add(MenuItem item, int tableNumber)
    {
        this.orders[tableNumber].add(item);
    }

    public int freeTableNumber()
    {
        return orders.length-size;
    }

    public int AllTableNumber()
    {
        return orders.length;
    }

    public int[] freeTableNumbers()
    {
        int[] tables = new int[orders.length-size];
        int count = 0;

        for(int i = 0; i < this.orders.length; ++i) {
            if (this.orders[i] == null) {
                tables[count] = i+1;
                ++count;
            }
        }

        return tables;
    }

    public Order getOrder(int tableNumber)
    {
        return this.orders[tableNumber];
    }

    public void remove(int tableNumber)
    {
        this.orders[tableNumber] = null;
        --this.size;
    }

    public int remove(Order order)
    {
        for(int i = 0; i < this.size; ++i) {
            if (this.orders[i] == order) {
                for(int k = i; k < this.size; ++k) {
                    this.orders[k] = this.orders[k + 1];
                }

                this.orders[this.size] = null;
                --this.size;
                return i;
            }
        }

        return -1;
    }

    public int removeAll(Order order)
    {
        int count = 0;

        for(int i = 0; i < this.size; ++i)
        {
            if (this.orders[i] == order)
            {
                for(int k = i; k < this.size; ++k)
                {
                    this.orders[k] = this.orders[k + 1];
                }

                this.orders[this.size] = null;
                --this.size;
            }
        }

        if (count == 0)
        {
            return -1;
        }
        else
        {
            return count;
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                if (this.orders[i].get(j).getName() == itemName) {
                    ++count;
                }
            }
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                if (this.orders[i].get(j) == item) {
                    ++count;
                }
            }
        }

        return count;
    }

    @Override
    public Order[] getOrder() {
        return new Order[0];
    }

    @Override
    public Order[] getOrders() {
        return this.orders;
    }

    @Override
    public int ordersCostSummary() {
        int total = 0;

        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                total += this.orders[i].get(j).getPrice();
            }
        }

        return total;
    }

    @Override
    public int ordersQuantity() {
        return this.size;
    }

    public String toString() {
        String result = "Количество заказов: " + this.size + "\n";
        for (int i = 0; i < this.orders.length; ++i)
        {
            if (orders[i] == null)
            {
                result += (i + 1) + " | стол пустой\n";
            }
            else {
                result += (i + 1) + " | " + orders[i].toString() + "\n";
            }
        }
        return result;
    }

    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            return object == this;
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean prime = true;
        int result = 1;
        result = 31 * result + this.orders.hashCode();
        result = 31 * result + this.size;
        return result;
    }
}
