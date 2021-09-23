
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int count=0;
        Brick br=new Brick();
       
         for (int i = 0; i < t.size(); i++) {
            if(Character.isLetter(t.get(i).getPlace().charAt(0)) && Character.isDigit(t.get(i).getPlace().charAt(t.get(i).getPlace().length()-1))){
               count++;
         }
            
        }
         return count;
    }

    @Override
    public void f2(List<Brick> t) {       
        int min=t.get(0).getPrice();
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPrice()<min){
                t.get(i).setPlace("YY");
            }
            
        }
    }

    @Override
    public void f3(List<Brick> t) {
        int max=t.get(0).getPrice();
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getPrice()>max){
                t.get(i).setPlace("YY");
            }
            
        }
    }
    
}
