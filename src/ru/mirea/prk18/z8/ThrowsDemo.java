package ru.mirea.prk18.z8;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        String key = "";
        try {
            Scanner myScanner = new Scanner(System.in);
            key = myScanner.next();
            printDetails(key);
        }
        catch (Exception e)
        {
            Scanner myScanner = new Scanner(System.in);
            key = myScanner.next();
        }
    }
    public void printDetails(String key) throws Exception {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e)
        {
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "")
        {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

