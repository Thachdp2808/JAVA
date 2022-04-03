/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author PV
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    private String name;
    private String studentId;
    private LocalDate birthDate;
    private String address;
    private String major;
    double gpa;

    public Student(){}
    public Student(String name, String studentId, LocalDate birthDate, String address, String major, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void printAllAttributes() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Date of birth: " + birthDate.toString() );
        System.out.println("Address: "+getAddress());
        System.out.println("Major: "+getMajor());
        System.out.println("GPA: "+getGpa());
    }
    
}