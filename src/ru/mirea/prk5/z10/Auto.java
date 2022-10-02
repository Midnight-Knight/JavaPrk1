package ru.mirea.prk5.z10;

public class Auto extends Transport{
    private double distance;

    Auto(double speed, double maxHeft, double costHeft, double maxPass, double costPass, double distance)
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
