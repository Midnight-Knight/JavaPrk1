package ru.mirea.prk2.z1;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author A = new Author("Maks","Maks@gmail.com",'m');
        System.out.println(A.toString());
        A.setEmail("Maks2003@gmail.com");
        System.out.println(A.getEmail());
    }
}
