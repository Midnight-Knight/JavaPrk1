package ru.mirea.prk9.z3;

import ru.mirea.prk9.z1.Student;

public class Test {
    private Student[] OneOld;
    private Student[] TwoOld;
    private Student[] OneNew;

    public Test(int X, int Y)
    {
        OneOld = new Student[X];
        for (int i = 0; i < X; ++i)
        {
            OneOld[i] = new Student();
        }
        TwoOld = new Student[Y];
        for (int i = 0; i < Y; ++i)
        {
            TwoOld[i] = new Student();
        }
    }

    public String toStringTwoOld()
    {
        String mass = "";
        for(int i = 0; i < this.TwoOld.length; ++i)
        {
            mass+=("N: "+i+" iDNumber: "+this.TwoOld[i].getiDNumber()+" score: "+this.TwoOld[i].getScore()+"\n");
        }
        return mass;
    }

    public String toStringOneNew()
    {
        String mass = "";
        for(int i = 0; i < this.OneNew.length; ++i)
        {
            mass+=("N: "+i+" iDNumber: "+this.OneNew[i].getiDNumber()+" score: "+this.OneNew[i].getScore()+"\n");
        }
        return mass;
    }

    public String toStringOneOld()
    {
        String mass = "";
        for(int i = 0; i < this.OneOld.length; ++i)
        {
            mass+=("N: "+i+" iDNumber: "+this.OneOld[i].getiDNumber()+" score: "+this.OneOld[i].getScore()+"\n");
        }
        return mass;
    }

    public void NewMass()
    {
        OneNew = new Student[OneOld.length + TwoOld.length];
        for (int i = 0;i < OneOld.length; ++i)
        {
            OneNew[i] = new Student(OneOld[i]);
        }
        for(int i = OneOld.length; i < OneNew.length; ++i)
        {
            OneNew[i] = new Student(TwoOld[i-OneOld.length]);
        }
        int[] sort = new int[OneNew.length];
        for (int i = 0; i < OneNew.length;++i)
        {
            sort[i] = OneNew[i].getiDNumber();
        }
        mergeSort(sort,OneNew.length);
        for (int i = 0; i < OneNew.length; ++i)
        {
            OneNew[i].setScore(sort[i]);
        }
    }

    public void mergeSort(int [] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i] <= r[j])
            {
                a[k++] = l[i++];
            }
            else
            {
                a[k++] = r[j++];
            }
        }
        while (i < left)
        {
            a[k++] = l[i++];
        }
        while (j < right)
        {
            a[k++] = r[j++];
        }
    }
}
