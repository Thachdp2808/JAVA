
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
 * @author Duc Ky
 */
public class MyCourse implements ICourse{

    @Override
    public void f1(List<Course> a, int st) {
        //Viet code o day
//        if (st == 1){
//            Collections.sort(a, new Comparator<Course>() {
//                @Override
//                public int compare(Course o1, Course o2) {
//                    if (o1.getFee() > o2.getFee()){
//                        return 1;
//                    }else if (o1.getFee() == o2.getFee()){
//                        return 0;
//                    }else{
//                        return -1;
//                    }
//                }
//            });
//        }
        if (st == 1){
            for (int i = 0; i < a.size(); i++){
                for (int j = 0; j < a.size() - 1; j++){
                    if (a.get(j).getFee() > a.get(j + 1).getFee()){
                        Collections.swap(a, j, j + 1);
                    }
                }
            }
        }else{
            for (int i = 0; i < a.size(); i++){
                if (a.get(i).getFee() <= 120){
                    Course tmp = a.get(i);
                    a.remove(i);
                    a.add(tmp);
                }
            }
        }
    }
    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        for (Course c : a){
            if (c.getFee() >= fee){
                count++;
            }
        }
        return count;
    }   
}
