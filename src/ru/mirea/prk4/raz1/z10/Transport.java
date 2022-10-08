package ru.mirea.prk4.raz1.z10;

public abstract class Transport {
    private double speed;
    private double heft;
    private double heftCost;
    private double passenger;
    private double passengerCost;

    abstract double sumHeft();
    abstract double sumPassenger();
    abstract double time();

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getHeft() {
        return heft;
    }

    public void setHeft(double heft) {
        this.heft = heft;
    }

    public double getHeftCost() {
        return heftCost;
    }

    public void setHeftCost(double heftCost) {
        this.heftCost = heftCost;
    }

    public double getPassenger() {
        return passenger;
    }

    public void setPassenger(double passenger) {
        this.passenger = passenger;
    }

    public double getPassengerCost() {
        return passengerCost;
    }

    public void setPassengerCost(double passengerCost) {
        this.passengerCost = passengerCost;
    }
}
