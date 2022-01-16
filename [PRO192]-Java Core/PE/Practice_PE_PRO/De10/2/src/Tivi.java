/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Tivi {
    private double price;
    private String type;
   
    public Tivi() {
    }

    public Tivi(String type,double price) {
        this.type=type;
        this.price=price;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return type+ " " + price;
    }

    

    

  

    
}
