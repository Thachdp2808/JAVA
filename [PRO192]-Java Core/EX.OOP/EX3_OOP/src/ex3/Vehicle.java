/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Dell
 */
public class Vehicle {
    private String name;
    private String namemoto;
    private int capacity; 
    private float price ;
    
    public Vehicle(){
        
    }
    public Vehicle(String name,String namemoto, int capacity,float price){
        this.name=name;
        this.namemoto=namemoto;
        this.capacity=capacity;
        this.price=price;
        
    }
    public String getName(){
        return name;
    }
    public String getNamemoto(){
        return namemoto;
    }
    public int getCapacity(){
        return capacity;
    }
    public float getPrice(){
        return price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setNamemoto(String namemoto){
        this.namemoto=namemoto;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public float tax(){
        if(getCapacity()<100){
            return (getPrice()*1)/100;
        } else{
            if(100<=getCapacity() && getCapacity()<200){
                return (getPrice()*3)/100;
            } else{
                return (getPrice()*5)/100;
            }
        }
    }
    
}
