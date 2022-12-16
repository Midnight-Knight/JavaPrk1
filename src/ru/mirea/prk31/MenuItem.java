package ru.mirea.prk31;

public abstract class MenuItem {
    protected int price;
    protected String name;
    protected String description;

    public MenuItem(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "MenuItem:" + this.price + ",Name:" + this.name;
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
        int result = 2;
        result = 31 * result + this.price;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.description.hashCode();
        return result;
    }
}
