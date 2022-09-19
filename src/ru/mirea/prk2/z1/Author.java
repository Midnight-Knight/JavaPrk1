package ru.mirea.prk2.z1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return "name: "+this.name+" email: "+this.email+" gender: "+this.gender;
    }
}
