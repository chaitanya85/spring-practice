package org.example;

public class Student {

    private int rollNo;
    private String name;
    private String collegeName;
    private String place;

    public void setRollName(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollName() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
