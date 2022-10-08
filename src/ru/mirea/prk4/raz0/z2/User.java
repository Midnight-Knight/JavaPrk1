package ru.mirea.prk4.raz0.z2;
import ru.mirea.prk4.raz0.z2.Product;

import java.util.ArrayList;

public class User {
    private String UserName;
    private String Password;
    private String Address = "";
    private int CardId = 0;
    private int CVV = 0;
    private byte CardMonth = 0;
    private byte CardYear = 0;

    private ArrayList<Product> list;

    public User(String UserName, String Password)
    {
        this.UserName=UserName;
        this.Password=Password;
        list = new ArrayList<>();
    }

    public void BankCard(int CardID, int CVV, byte CardMonth, byte CardYear)
    {
        this.CardId=CardID;
        this.CVV=CVV;
        this.CardMonth=CardMonth;
        this.CardYear=CardYear;
    }

    public boolean checkBankID()
    {
        if (CardId == 0 || CVV == 0 || CardMonth == 0 || CardYear == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void AddressNew(String Address)
    {
        this.Address=Address;
    }

    public boolean AddressCheck()
    {
        if(Address.equals(""))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void AddProduct(Product A)
    {
        if(A.Check() == true) {
            list.add(A);
        }
        else
        {
            System.out.println("Невозможно добавить товар, товар закончился!");
        }
    }

    public Product getProduct(int i)
    {
        return list.get(i);
    }

    public void DelProduct(int i)
    {
        if (list.size() != 0) {
            list.remove(i);
        }
    }

    public void listProduct()
    {
        if (list.size() == 0)
        {
            System.out.println("Пусто");
        }
        else {
            for (int i = 0; i < list.size(); ++i) {
                System.out.printf("№%s %s%n",i,list.get(i).toString());
            }
        }
    }

    public int Sum()
    {
        int sum = 0;
        for (int i = 0; i < list.size(); ++i)
        {
            sum += list.get(i).getPrice();
        }
        return sum;
    }

    public String getAddress()
    {
        return Address;
    }

    public int listsize()
    {
        return list.size();
    }

}
