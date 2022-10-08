package ru.mirea.prk4.raz1.z10;

public class Ship extends Transport {

    private double distance;

    Ship(double speed, double maxHeft, double costHeft, double maxPass, double costPass, double distance)
    {
        setSpeed(speed);
        setHeft(maxHeft);
        setHeftCost(costHeft);
        setPassenger(maxPass);
        setPassengerCost(costPass);
        this.distance=distance;
    }

    public double time()
    {
        return (distance/getSpeed());
    }

    public double sumHeft()
    {
        return ((time()) * (getHeft()*getHeftCost()));
    }

    public double sumPassenger()
    {
        return ((time()) * (getPassenger()*getPassengerCost()));
    }
}
