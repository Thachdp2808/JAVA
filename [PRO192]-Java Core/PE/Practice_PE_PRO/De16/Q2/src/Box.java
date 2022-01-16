/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fulls
 */
public class Box {
    private String code;
    private double price;

    public Box() {
    }

    public Box(String code, double price) {
        this.code=code;
        this.price=price;
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
    @Override
    public String toString(){
        return code + "\t" + price;
    }

    

}
