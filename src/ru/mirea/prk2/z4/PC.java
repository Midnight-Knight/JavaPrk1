package ru.mirea.prk2.z4;

public class PC {
    private String CPU;
    private String GPU;
    private int RAM;
    private int ROM;

    public PC(String CPU, String GPU, int RAM, int ROM)
    {
        this.CPU=CPU;
        this.GPU=GPU;
        this.RAM=RAM;
        this.ROM=ROM;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getROM() {
        return ROM;
    }

    public String toString()
    {
        return "CPU: "+this.CPU+"\nGPU: "+this.GPU+"\nRAM: "+this.RAM+"\nROM: "+this.ROM;
    }
}
