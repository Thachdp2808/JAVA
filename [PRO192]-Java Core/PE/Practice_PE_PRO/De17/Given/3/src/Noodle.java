/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class Noodle {
    private String name;
    private double price;
    public Noodle(){
        
    }
    public Noodle(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
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
