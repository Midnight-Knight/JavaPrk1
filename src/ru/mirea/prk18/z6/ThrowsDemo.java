package ru.mirea.prk18.z6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            return "data for " + key;
        }
        catch (NullPointerException e)
        {
            return "null key in getDetails";
        }
    }


}
