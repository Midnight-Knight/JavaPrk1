package ru.mirea.prk18.z5;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
