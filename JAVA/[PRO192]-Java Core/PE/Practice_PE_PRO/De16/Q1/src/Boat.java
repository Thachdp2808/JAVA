

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fulls
 */
public class Boat {
    private String name;
    private double price;
    public Boat() {
    }

    public Boat(String name, double price) {
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name.toLowerCase();
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

   
    
}
