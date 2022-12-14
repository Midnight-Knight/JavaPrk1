package ru.mirea.prk30;

public class Drink extends MenuItem implements Alcoholable {
    private double alcoholDegree;
    private DrinkTypeEnum typeEnum;

    public Drink(int price, String name, String description, double alcoholDegree, DrinkTypeEnum typeEnum) {
        super(price, name, description);
        this.alcoholDegree = alcoholDegree;
        this.typeEnum = typeEnum;
    }

    public Drink(int price, String name, String description, DrinkTypeEnum typeEnum) {
        super(price, name, description);
        this.alcoholDegree = 0.0;
        this.typeEnum = typeEnum;
    }

    public Drink(String name, DrinkTypeEnum typeEnum) {
        super(0, name, (String)null);
        this.alcoholDegree = 0.0;
        this.typeEnum = typeEnum;
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

    public static boolean isAlcoholicDrink(DrinkTypeEnum a) {
        if (a == DrinkTypeEnum.BLACK_TEA || a == DrinkTypeEnum.GREEN_TEA || a == DrinkTypeEnum.SODA || a == DrinkTypeEnum.JUICE || a == DrinkTypeEnum.MILK || a == DrinkTypeEnum.WATER || a == DrinkTypeEnum.COFEE)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public double getAlcoholVol() {
        return this.alcoholDegree;
    }

    public DrinkTypeEnum getType() {
        return this.typeEnum;
    }

    public String toString() {
        String var10000 = String.valueOf(this.typeEnum);
        return "Drink: " + var10000 + " " + this.name + " - " + this.price + " ,Alcohol " + this.alcoholDegree + " % - 4" + this.description;
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
        int result = 5;
        result = 31 * result + this.price;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.description.hashCode();
        result = 31 * result + (int)this.alcoholDegree;
        result = 31 * result + this.typeEnum.hashCode();
        return result;
    }
}
