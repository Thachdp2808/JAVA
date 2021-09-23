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
    double price;
    private String name;
    public Noodle(){
        
    }
    public Noodle(String name,double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name +" "+ price;
    }

    
}
