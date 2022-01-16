
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fulls
 */
public class MyBox implements IBox {

    @Override
    public void f1(List<Box> list) {
        for (Box box : list) {
            if (box.getCode().charAt(0) == 'K') {
                box.setPrice(box.getPrice() * 1.1);
            }
        }
    }

    @Override
    public int f2(List<Box> list, double xPrice) {
        int count = 0;
        for (Box box : list) {
            if (box.getPrice() > xPrice) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Box> list) {
        double min = list.get(0).getPrice();

        //tim gia min
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() < min) {
                min = list.get(i).getPrice();
            }
        }

        if (list.get(list.size() - 1).getPrice() != min) {
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i).getPrice() == min) {
                    list.remove(i + 1);
                    break;
                }
            }
        }
    }

}
