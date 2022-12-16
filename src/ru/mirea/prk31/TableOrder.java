package ru.mirea.prk31;

public class TableOrder implements Order {
    private final int SIZE_PRIMARY_ARRAY = 16;
    private Customer customer;
    private int size;
    private MenuItem[] items;

    public TableOrder(Customer customer) {
        this.customer = customer;
        this.size = 0;
        this.items = new MenuItem[16];
    }

    public TableOrder(int size, Customer customer) {
        this.customer = customer;
        this.size = 0;
        MenuItem[] items = new MenuItem[size];

        for(int i = 0; i < size; ++i) {
            items[i] = null;
        }

    }

    public TableOrder(MenuItem[] menu, Customer customer) {
        this.customer = customer;
        this.items = menu;
        this.size = menu.length;
    }

    private void sort(MenuItem[] items) {
        for(int i = 0; i < this.size - 1; ++i) {
            for(int j = 0; j < this.size - 1; ++j) {
                if (items[j].getPrice() < items[j + 1].getPrice()) {
                    MenuItem item = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = item;
                }
            }
        }

    }

    public void resize(int new_lenght) {
        MenuItem[] new_array = new MenuItem[new_lenght];
        System.arraycopy(this.items, 0, new_array, 0, this.size);
        this.items = new_array;
    }

    public MenuItem get(int index) {
        return this.items[index];
    }

    public boolean add(MenuItem item) {
        if (this.size == this.items.length - 1) {
            this.resize(this.items.length * 2);
        }
        else if (this.size == 0)
        {
            this.resize(1);
        }

        if (this.size < this.items.length) {
            this.items[this.size] = item;
            ++this.size;
            return true;
        } else {
            return false;
        }
    }

    public String[] itemsNames() {
        String[] names = new String[this.size];

        for(int i = 0; i < this.size; ++i) {
            names[i] = this.items[i].getName();
        }

        return names;
    }

    public int itemsQuantity() {
        return this.size;
    }

    public int itemQuantity(String itemName) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.items[i].getName() == itemName) {
                ++count;
            }
        }

        return count;
    }

    public int itemQuantity(MenuItem itemName) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.items[i] == itemName) {
                ++count;
            }
        }

        return count;
    }

    public MenuItem[] getItems() {
        return this.items;
    }

    public boolean remove(String item) {
        for(int i = 0; i < this.size; ++i) {
            if (this.items[i].getName() == item) {
                for(int j = i; j < this.size; ++j) {
                    this.items[j] = this.items[j + 1];
                }

                this.items[this.size] = null;
                --this.size;
                return true;
            }
        }

        return false;
    }

    public boolean remove(MenuItem item) {
        for(int i = 0; i < this.size; ++i) {
            if (this.items[i] == item) {
                for(int j = i; j < this.size; ++j) {
                    this.items[j] = this.items[j + 1];
                }

                this.items[this.size] = null;
                --this.size;
                return true;
            }
        }

        return false;
    }

    public int removeFew(String itemName) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.items[i].getName() == itemName) {
                for(int j = i; j < this.size; ++j) {
                    this.items[j] = this.items[j + 1];
                }

                this.items[this.size] = null;
                --this.size;
                ++count;
            }
        }

        return count;
    }

    public int removeFew(MenuItem item) {
        int count = 0;

        for(int i = 0; i < this.size; ++i) {
            if (this.items[i] == item) {
                for(int j = i; j < this.size; ++j) {
                    this.items[j] = this.items[j + 1];
                }

                this.items[this.size] = null;
                --this.size;
                ++count;
            }
        }

        return count;
    }

    public MenuItem[] sortedItemsByCostDesc() {
        this.sort(this.items);
        return this.items;
    }

    public int costTotal() {
        int total = 0;

        for(int i = 0; i < this.size; ++i) {
            total += this.items[i].getPrice();
        }

        return total;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        String result = "Позиций заказа: " + this.size + "\n";

        for(int i = 0; i < this.size; ++i) {
            result = result + (i+1) + " | " + this.items[i].toString() + "\n";
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
        int result = 9;
        result = 31 * result + this.customer.hashCode();
        result = 31 * result + 16;
        result = 31 * result + this.items.hashCode();
        result = 31 * result + this.size;
        return result;
    }
}
