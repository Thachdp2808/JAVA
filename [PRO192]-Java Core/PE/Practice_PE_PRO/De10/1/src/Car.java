/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trinh
 */
public class Car {
    private String name;
    private double price;
    public Car(){
        
    }
    public Car(String name, double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name.toUpperCase();
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
}
