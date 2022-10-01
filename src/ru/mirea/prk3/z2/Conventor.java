package ru.mirea.prk3.z2;

public class Conventor {
    private double RR = 50.5;
    private double EU = 1.2;
    private double TL = 17.1;

    public Conventor()
    {

    }

    public String getXtoY(String x,String y, double N)
    {
        double xStatus = 0;
        double yStatus = 0;

        if (x.equals("EU"))
        {
            xStatus = EU;
        }
        else if (x.equals("RR"))
        {
            xStatus = RR;
        }
        else if(x.equals("TL"))
        {
            xStatus = TL;
        }
        else if (x.equals("USD"))
        {
            xStatus = 1;
        }

        if (y.equals("EU"))
        {
            yStatus = EU;
        }
        else if (y.equals("RR"))
        {
            yStatus = RR;
        }
        else if(y.equals("TL"))
        {
            yStatus = TL;
        }
        else if (y.equals("USD"))
        {
            yStatus = 1;
        }

        String ret;

        if (xStatus != 0 && yStatus != 0)
        {
            double XY = N/xStatus;
            double XYN = XY * yStatus;
            double XYB = XYN * 0.98;
            ret = "Покупка: "+XYN+"\nПродажа: "+XYB;
        }
        else
        {
            ret = "Валюта не определенна!";
        }

        return ret;
    }
}
