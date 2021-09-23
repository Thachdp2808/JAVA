
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class MyString implements IString {
    @Override
    public int f1(String str) {
        int total =0;
        for(int i=0;i<str.length();++i){
            char t = str.charAt(i);
            if(t=='2'||t=='3'||t=='5'||t=='7')
                ++total;
        }
        return total;
    }

    @Override
    public String f2(String str) {
        String result="";
        String arg[]=str.split("\\s+");
        List t = new ArrayList<String>();
        for(int i=0;i<arg.length;++i){
            t.add(arg[i]);
        }
        Collections.reverse(t);
        for(int i=0;i<t.size();++i){
            result+=t.get(i)+" ";
        }
        return result;
               
    }
}
