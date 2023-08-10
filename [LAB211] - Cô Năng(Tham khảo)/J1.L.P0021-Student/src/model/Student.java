/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Student {

    private String id, name;
    private int age, semester, courseName;

    public Student(String id, String name, int age, int semester, int courseName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.courseName = courseName;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return courseName
     */
    public int getCourse() {
        return courseName;
    }

    public void setAge(int age) throws Exception {
        if (age >= 16) {
            this.age = age;
        } else {
            throw new Exception("You not old enough");
        }
    }

    /**
     * @return semester
     */
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return result
     */
    public String getCourseName() {
        String result = null;
        switch (courseName) {
            case 1:
                result = "Java";
                break;
            case 2:
                result = ".Net";
                break;
            case 3:
                result = "C/C++";
                break;

        }

        return result;
    }

    public void setCourseName(int courseName) throws Exception {
        if (courseName <= 3 && courseName >= 1) {
            this.courseName = courseName;
        } else {
            throw new Exception("Must in 1 to 3");
        }
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10s %-10s %-10s", id, name, age, semester, getCourseName());
    }
}
