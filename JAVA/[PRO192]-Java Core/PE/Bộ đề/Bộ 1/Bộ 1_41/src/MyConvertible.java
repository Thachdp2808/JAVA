/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class MyConvertible implements Convertible{

    @Override
    public double toMile(double x) {
        return x * 0.621371;
    }

    @Override
    public String getCode(String rc) {
        //rc = K2M762H2M  = 9
        ///////012345678
        //0 - 3 = K2M
        String result = "";
        for (int i = 0; i <= rc.length()-3; i+=3) {
            result = result + rc.substring(i, i+3);
            if(i != rc.length()-3){
                result = result +"-";
            }
        }
        return result;
    }
    
}
