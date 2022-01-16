/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class Car {
    private String maker;
    private int price;
    
    public Car(){
    }
    
    public Car(String maker, int price){
        this.maker = maker;
        this.price = price;
    }
    
    public String getMaker(){
        return maker;
    }
    
    public void setMaker(String maker){
        this.maker = maker;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(){
        this.price = price;
    }
    
    @Override
    public String toString(){
        return maker + ", " + price;
    }

    void setPrice(int i) {
      this.price= i;
    }
}
