package ru.mirea.ptk10;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA();
        A.setArray(3);
        A.outArray();
        A.quicksortScore();
        A.outArray();
        A.quicksortCourse();
        A.outArray();
        A.quicksortGroup();
        A.outArray();
        SortingStudentsByGPA B = new SortingStudentsByGPA();
        B.setArray(2);
        B.outArray();
        SortingStudentsByGPA C = new SortingStudentsByGPA();
        C.MassPlusPlus(A,B);
        C.outArray();
    }
}
