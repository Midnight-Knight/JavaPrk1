package ru.mirea.prk32;

public class InternetOrdersManager implements OrderManager {
    private int size;
    private Order[] orders;

    public InternetOrdersManager() {
        this.size = 0;
        this.orders = new Order[8];
    }

    public InternetOrdersManager(int size) {
        this.size = size;
        this.orders = new Order[size];
    }

    private void resize(int new_lenght) {
        Order[] new_array = new Order[new_lenght];
        System.arraycopy(this.orders, 0, new_array, 0, this.size);
        this.orders = new_array;
    }

    public void add(Order order) {
        if (this.size == 0)
        {
            this.resize(1);
        }
        else if (this.orders.length == this.size) {
            this.resize(this.orders.length * 2);
        }

        this.orders[size] = order;
        ++size;
    }

    public void add(MenuItem item, int ID) {
        this.orders[ID].add(item);
    }

    public int freeTableNumber() {
        for(int i = 0; i < this.size; ++i) {
            if (this.orders[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public int[] freeTableNumbers() {
        int[] tables = new int[this.size];
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.orders[i] == null) {
                tables[count] = i;
                ++count;
            }
        }

        return tables;
    }

    public Order getOrder(int tableNumber) {
        return this.orders[tableNumber];
    }

    public void remove(int tableNumber) {
        if (tableNumber == orders.length-1)
        {
            this.orders[tableNumber] = null;
            --this.size;
        }
        else
        {
            this.orders[tableNumber] = null;
            --this.size;
            for (int i = tableNumber; i < orders.length-1; ++i)
            {
                this.orders[tableNumber] = this.orders[tableNumber+1];
            }
            for (int i = size; i < orders.length; ++i)
            {
                this.orders[i] = null;
            }
        }
    }

    public int remove(Order order) {
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

    public int removeAll(Order order) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.orders[i] == order) {
                for(int k = i; k < this.size; ++k) {
                    this.orders[k] = this.orders[k + 1];
                }

                this.orders[this.size] = null;
                --this.size;
            }
        }

        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    }

    public int itemsQuantity(String name) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                if (this.orders[i].get(j).getName() == name) {
                    ++count;
                }
            }
        }

        return count;
    }

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

    public Order[] getOrder() {
        return this.orders;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    public int ordersCostSummary() {
        int total = 0;

        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                total += this.orders[i].get(j).getPrice();
            }
        }

        return total;
    }

    public int ordersQuantity() {
        return this.size;
    }

    public String toString() {
        String result = "Количество заказов: " + this.size + "\n";
        for (int i = 0; i < this.size; ++i)
        {
            result += (i+1) + " | " + orders[i].toString() + "\n";
        }
        return result;
    }

    public String fileString()
    {
        String result = this.size + "\n";
        for (int i = 0; i < this.size; ++i)
        {
            result += orders[i].fileString();
            if (i != this.size - 1)
            {
                result += "\n";
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
