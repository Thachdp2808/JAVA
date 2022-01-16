
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
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int total = 0;
        for (Car x : t) {
            total += x.getRate();
        }
        return total / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int pmin = 0;
        int pmax = 0;
        int min = t.get(0).getRate();
        int max = t.get(0).getRate();
        for (int i = 0; i < t.size(); ++i) {
            if (t.get(i).getRate() < min) {
                min = t.get(i).getRate();
                pmin = i;
            }
            if (t.get(i).getRate() > max) {
                max = t.get(i).getRate();
                pmax = i;
            }
                 

        }
        String minmaker = t.get(pmin).getMaker();
           String maxmaker = t.get(pmax).getMaker();
            t.get(pmin).setMaker(maxmaker);
            t.get(pmin).setRate(max);
            t.get(pmax).setMaker(minmaker);
           t.get(pmax).setRate(min); 

    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>() {
            @Override
             public int compare(Car o1, Car o2) {
                 if(!o1.getMaker().equals(o2.getMaker()))
                return o1.getMaker().compareTo(o2.getMaker());
                 else return o1.getRate()>o2.getRate()?-1:1;
            }
        });
    }
}