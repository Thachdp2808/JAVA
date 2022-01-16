/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count=0;
        if(str.charAt(str.length()-1)=='u' || str.charAt(str.length()-1)=='v'){
            count++;
        }
        return 3;
    }

    @Override
    public String f2(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
