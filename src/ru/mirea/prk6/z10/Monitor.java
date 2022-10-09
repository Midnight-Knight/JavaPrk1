package ru.mirea.prk6.z10;

public class Monitor implements Information{
    private String name;
    private int Hz;
    private byte diagonal;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getPower() {
        return Hz;
    }

    @Override
    public void setPower(int power) {
        Hz = power;
    }

    @Override
    public byte getObj() {
        return diagonal;
    }

    @Override
    public void setObj(byte obj) {
        diagonal = obj;
    }
}
