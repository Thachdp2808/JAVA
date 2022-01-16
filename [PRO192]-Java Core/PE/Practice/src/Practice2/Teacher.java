/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice2;

/**
 *
 * @author alias
 */
public class Teacher{
    private String name;
    private int age;
    private int workday;
    private int salaryPerday;

    public Teacher() {
    }

    public Teacher(int salaryPerday, int workday, String name, int age) {
        this.name = name;
        this.age = age;
        this.workday = workday;
        this.salaryPerday = salaryPerday;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public int getSalaryPerday() {
        return salaryPerday;
    }

    public void setSalaryPerday(int salaryPerday) {
        this.salaryPerday = salaryPerday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    @Override
    public String toString() {
        return name+"\t"+age+"\t"+workday +"\t"+salaryPerday;
    }
    
            
}
