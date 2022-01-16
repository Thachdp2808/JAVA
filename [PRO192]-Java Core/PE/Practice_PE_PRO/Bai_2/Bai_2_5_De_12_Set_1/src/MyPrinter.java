
import java.util.*;

public class MyPrinter implements IPrinter {

    @Override
    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).price <= price) {
                a.remove(a.get(i));
            }
        }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).name.contains(name)) {
                count++;
            }
        }
        return count;
    }

}
