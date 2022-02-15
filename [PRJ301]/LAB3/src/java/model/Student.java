package model;

import java.sql.Date;

public class Student {

    private int ID;
    private String Name, Gender;
    private Date DOB;

    public Student() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Student(int ID, String Name, String Gender, Date DOB) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.DOB = DOB;
    }

}
