package ru.mirea.prk19.z2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Деев Леонид Русланович", 67, 12, 19));
        s.add(new Student("Иванов Иван Иванович", 57, 12, 18));
        s.add(new Student("Дмитриев Дмитрий Дмитриевич", 93, 12, 19));
        s.add(new Student("Дарьева Дарья Дмитриевич", 24, 2, 18));

        new LabClassUI(s);
    }

}
