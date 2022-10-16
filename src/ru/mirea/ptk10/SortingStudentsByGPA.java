package ru.mirea.ptk10;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public SortingStudentsByGPA() {}

    public void setArray(int N)
    {
        iDNumber = new Student[N];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < iDNumber.length; ++i)
        {
            iDNumber[i] = new Student();
            System.out.print("FirstName: ");
            iDNumber[i].setFirstName(scanner.nextLine());
            System.out.print("SecondName: ");
            iDNumber[i].setSecondName(scanner.nextLine());
            System.out.print("Specialization: ");
            iDNumber[i].setSpecialization(scanner.nextLine());
            System.out.print("Group: ");
            iDNumber[i].setGroup(scanner.nextShort());
            System.out.print("Course: ");
            iDNumber[i].setCourse(scanner.nextByte());
            System.out.print("Score: ");
            iDNumber[i].setScore(scanner.nextDouble());
            scanner.nextLine();
        }
    }

    public void outArray()
    {
        for(int i = 0; i < iDNumber.length; ++i)
        {
            System.out.println(iDNumber[i].toString());
        }
    }

    public void quicksortScore()
    {
        sortScore(0, iDNumber.length-1);
    }

    public void quicksortGroup()
    {
        sortGroup(0, iDNumber.length-1);
    }

    public void quicksortCourse()
    {
        sortCourse(0, iDNumber.length-1);
    }
    private double compare(double x, double y) {
        return x-y;
    }

    private double compare(short x, short y) {
        return x-y;
    }

    private double compare(byte x, byte y) {
        return x-y;
    }

    private void sortScore(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getScore(),student.getScore())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getScore(),student.getScore()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortScore(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortScore(i,rightBorder);
            }
        }
    }

    private void sortGroup(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getGroup(),student.getGroup())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getGroup(),student.getGroup()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortGroup(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortGroup(i,rightBorder);
            }
        }
    }

    private void sortCourse(int leftBorder, int rightBorder) {
        if (iDNumber.length == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = iDNumber[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(iDNumber[i].getCourse(),student.getCourse())>0)
            {
                i++;
            }
            while (compare(iDNumber[j].getCourse(),student.getCourse()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                sortCourse(leftBorder,j);
            }
            if (rightBorder > i )
            {
                sortCourse(i,rightBorder);
            }
        }
    }

    public void MassPlusPlus(SortingStudentsByGPA A, SortingStudentsByGPA B)
    {
        iDNumber = new Student[A.iDNumber.length + B.iDNumber.length];
        for (int i = 0; i < A.iDNumber.length; ++i)
        {
            iDNumber[i] = new Student(A.iDNumber[i]);
        }
        for (int i = A.iDNumber.length; i < iDNumber.length; ++i)
        {
            iDNumber[i] = new Student(B.iDNumber[i-A.iDNumber.length]);
        }
    }
}
