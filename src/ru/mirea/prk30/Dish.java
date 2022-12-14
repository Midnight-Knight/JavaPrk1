package ru.mirea.prk30;

public class Dish extends MenuItem {
    public Dish(int price, String name, String description) {
        super(price, name, description);
    }

    public Dish(String name, String description) {
        super(0, name, description);
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
        return "Dish: " + this.name + " " + this.price + " " + this.description;
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
        int result = 3;
        result = 31 * result + this.price;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.description.hashCode();
        return result;
    }
}
