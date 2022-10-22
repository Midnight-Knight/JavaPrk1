package ru.mirea.prk13.z3;

public class Address {
    private String country = "";
    private String Region = "";
    private String City = "";
    private String Street = "";
    private String House = "";
    private String Building = "";

    public Address(){}

    private int Trash(String A, int index)
    {
        while (A.charAt(index) == ' ' || A.charAt(index) == ',' || A.charAt(index) == '.' || A.charAt(index) == ';')
        {
            ++index;
        }
        return index;
    }

    public void setAddress1(String A)
    {
        int i = 0;
        while (A.charAt(i) != ',')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                country += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                Region += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                City += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                Street += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                House += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (i != A.length())
        {
            if (A.charAt(i) != ' ') {
                Building += A.charAt(i);
            }
            ++i;
        }
    }

    public void setAddress2(String A)
    {
        int i = 0;
        while (A.charAt(i) != ',' && A.charAt(i) != '.' && A.charAt(i) != ';')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                country += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',' && A.charAt(i) != '.' && A.charAt(i) != ';')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                Region += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',' && A.charAt(i) != '.' && A.charAt(i) != ';')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                City += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',' && A.charAt(i) != '.' && A.charAt(i) != ';')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                Street += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (A.charAt(i) != ',' && A.charAt(i) != '.' && A.charAt(i) != ';')
        {
            if (A.charAt(i) != ' ' || A.charAt(i+1) != ' ') {
                House += A.charAt(i);
            }
            ++i;
        }
        i = Trash(A, i);
        while (i != A.length())
        {
            if (A.charAt(i) != ' ') {
                Building += A.charAt(i);
            }
            ++i;
        }
    }

    public String toString()
    {
        return country+"\n"+Region+'\n'+City+"\n"+Street+"\n"+House+"\n"+Building+"\n";
    }
}
