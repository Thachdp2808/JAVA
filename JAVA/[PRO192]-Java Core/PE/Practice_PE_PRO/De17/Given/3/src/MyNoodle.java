
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
public class MyNoodle implements INoodle{

    @Override
    public int f1(List<Noodle> list, double d) {
        int count=0;
        Noodle np= new Noodle();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().charAt(np.getName().length()-1)=='[0-9]'){
                count++;
            }
            
        }
        return count;
    }
    @Override
    public void f2(List<Noodle> list) {
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).getPrice()<=list.get(0).getPrice()){
                list.remove(i);
                i--;
            }
        }
        list.remove(0);
        
    }

    @Override
    public List<String> f3(List<Noodle> list) {
        List<String> names = new ArrayList<String>();
        for(int i=0; i<list.size(); i++){
            boolean isName = false;
            Iterator<Noodle> iter = list.subList(i+1,list.size()).iterator();
            while(iter.hasNext()){
                if(iter.next().getName().toLowerCase().equals(list.get(i).getName().toLowerCase())){
                    iter.remove();
                    isName=true;
                }
            }
            if(isName==true){
                list.remove(list.get(i));
                i--;
            }
        }
        for (Noodle noodle : list) {
            names.add(noodle.getName());
        }
        return names;
    }
    
}
