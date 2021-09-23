/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fulls
 */
public class ColorBox  extends Box{
    private int color;
    
    public ColorBox(String code, double price, int color) {
       super(code,price);
       this.color=color;
    }

    
    public double getNewPrice(){
        double newprice=0;
        if(color>100){
            newprice=super.getPrice()+(super.getPrice()*0.1);
        }else{
            newprice=super.getPrice();
        }
        return newprice;
    }
    @Override
    public String toString(){
        return super.getCode() + "\t" + super.getPrice() + "\t" + color;
    }
    
    
    
    
}
