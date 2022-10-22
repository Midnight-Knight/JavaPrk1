package ru.mirea.prk13.z4;

public class Shirt {
    private String string = "";

    public Shirt(){};
    public Shirt(String string)
    {
        this.string=string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
