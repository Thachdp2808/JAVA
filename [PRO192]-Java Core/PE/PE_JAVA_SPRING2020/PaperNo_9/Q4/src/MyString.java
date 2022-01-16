/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fulls
 */
public class MyString implements  IString{

    @Override
    public int f1(String string) {
        //sdfh123h234hsd234
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
                int number = Integer.parseInt(string.charAt(i)+"");
                if(number % 2==0){
                    sum = sum + number;
                }
            }
        }
       return sum;
    }

    @Override
    public String f2(String string) {
        //sdfh123h234hsd234
        //sdfh13h3hsd3
        String result = "";
        for (int i = 0; i < string.length(); i++) {
           if(Character.isDigit(string.charAt(i))){
                int number = Integer.parseInt(string.charAt(i)+"");
                if(number % 2!=0){
                    result = result + string.charAt(i);
                }
            }else{
               result = result + string.charAt(i);
           }
        }
        return result;
    }
    
}
