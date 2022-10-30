package ru.mirea.prk19.z2;

import java.util.Comparator;

public class GroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroupNum() - o2.getGroupNum();
    }
}
