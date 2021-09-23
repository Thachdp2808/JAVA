
import java.util.List;


/**
 *
 * @author alias
 */
public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        
       for(int i=0;i<a.size();i++){
           if(a.get(i).getPrice()<price){
               a.remove(i);
               
           }
       }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        int count=0;
        for (int i = 0; i < a.size(); i++) {
            Object object = arr[i];
            
        }
        return count;
    }

    
}
