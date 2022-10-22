package ru.mirea.prk13.z2;

public class Person {
    private String TwoName;
    private String FirstName = "";
    private String ThreeName = "";

    public Person(String TwoName)
    {
        this.TwoName = TwoName;
    }

    public Person(String TwoName, String FirstName)
    {
        this(TwoName);
        this.FirstName=FirstName;
    }

    public Person(String TwoName, String FirstName, String ThreeName)
    {
        this(TwoName, FirstName);
        this.ThreeName=ThreeName;
    }

    public String toString()
    {
        String A = TwoName;
        if (!FirstName.equals(""))
        {
            A += " ";
            A += FirstName.substring(0,1);
            A+=".";
            if (!ThreeName.equals(""))
            {
                A+=ThreeName.substring(0,1);
                A+=".";
            }
        }
        return A;
    }
}
