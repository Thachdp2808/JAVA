/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class SpecBrick extends Brick {
    private int color;
    public SpecBrick(){
        
    }
    public SpecBrick(String place,int price,int color){
        super(place,price);
        this.color=color;
    }
    @Override
    public String toString(){
        return super.getPlace() + "," + super.getPrice() + "," + color;
    }
    public int getValue(){
        int value=0;
        if(color>7){
            value = super.getPrice()+6;
        }else{
            value = super.getPrice()+9;
        }
        return value;
    }
    public void setData(){
        setPlace(getPlace().substring(0,1)+getPlace().substring(1,2)+"ABC"+getPlace().substring(2));
    }
}
