package ru.mirea.prk9.z2;

import ru.mirea.prk9.z1.Student;

public class SortingStudentsByGPA implements Comparator{
    private Student[] students;
    private int N;

    public int getLeft()
    {
        return students[0].getScore();
    }

    public int getRight()
    {
        return students[N-1].getScore();
    }


    public SortingStudentsByGPA(int N)
    {
        this.N=N;
        students = new Student[N];
        for(int i = 0; i < N; ++i)
        {
            students[i] = new Student();
        }
    }

    public String toString()
    {
        String mass = "";
        for(int i = 0; i < N; ++i)
        {
            mass+=("N: "+i+" iDNumber: "+this.students[i].getiDNumber()+" score: "+this.students[i].getScore()+"\n");
        }
        return mass;
    }

    @Override
    public int compare(int x, int y) {
        return x-y;
    }

    @Override
    public void sort(int leftBorder, int rightBorder) {
        if (N == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = students[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(students[i].getScore(),student.getScore())>0)
            {
                i++;
            }
            while (compare(students[j].getScore(),student.getScore()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sort(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sort(i,rightBorder);
            }
        }
    }
}
