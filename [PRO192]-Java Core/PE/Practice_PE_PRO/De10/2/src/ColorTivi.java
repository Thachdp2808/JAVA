/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ColorTivi extends Tivi{
   private int serie;

    public ColorTivi(String type, int serie,double price) {
        super(type,price);
        this.serie=serie;
    }

   @Override
    public double getPrice() {
        double newprice=0;
        if(serie>3000){
            newprice=super.getPrice()-(super.getPrice()*0.1);
        }else{
            newprice=super.getPrice();
        }
        return newprice;
    }
   @Override
    public String toString(){
        return super.getType() + " " + serie + "\t" + super.getPrice();
    }

  
 
    
}
