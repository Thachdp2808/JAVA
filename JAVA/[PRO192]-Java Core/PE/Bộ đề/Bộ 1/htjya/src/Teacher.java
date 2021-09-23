/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class Teacher {
    private String name;
    private double salary;
    public Teacher() {
    }
    
    public Teacher(String name, double salary) {
        this.name=name;
        this.salary=salary;
        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    @Override
    public String toString(){
        return name + "\t" + salary;
    }
}
