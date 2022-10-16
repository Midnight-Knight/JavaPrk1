package ru.mirea.prk11.z5;
import java.util.Date;
import ru.mirea.prk9.z2.SortingStudentsByGPA;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(5);
        System.out.println(A.toString());
        Date date1 = new Date();
        A.sort(0, 4);
        Date date2 = new Date();
        System.out.println(A.toString());
        System.out.println(date2.getSeconds() - date1.getSeconds());
    }
}
