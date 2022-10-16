package ru.mirea.ptk10;

public class Student {
    private String FirstName;
    private String SecondName;
    private String Specialization;
    private short Group;
    private byte Course;
    private double Score;

    public Student(){}

    public Student(Student A)
    {
        this.FirstName=A.FirstName;
        this.SecondName=A.SecondName;
        this.Specialization=A.Specialization;
        this.Group=A.Group;
        this.Course=A.Course;
        this.Score=A.Score;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public short getGroup() {
        return Group;
    }

    public void setGroup(short group) {
        Group = group;
    }

    public byte getCourse() {
        return Course;
    }

    public void setCourse(byte course) {
        Course = course;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public String toString()
    {
        return "Student: "+this.FirstName+" "+this.SecondName+"\nSpecialization: "+this.Specialization+"\nGroup: "+this.Group+"\nCourse: "+this.Course+"\nScore: "+this.Score+"\n";
    }
}
