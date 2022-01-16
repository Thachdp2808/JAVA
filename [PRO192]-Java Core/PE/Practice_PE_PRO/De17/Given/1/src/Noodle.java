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
    private double price;
    private String code;
    public Noodle(){
        
    }

    public Noodle(String code, double price) {
        
        this.code = code;
        this.price = price;
    }
    public String getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
}
