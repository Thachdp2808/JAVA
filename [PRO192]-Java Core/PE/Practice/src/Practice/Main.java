
package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alias
 */
public class Main {

    public static void main(String[] args) {
        Vali v = (Vali) new Validate();
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        list.add(new Student("nguyen van a", 19, 8.5));
        list.add(new Student("le van b", 17, 8.5));
        list.add(new Student("trinh van c", 21, 8.5));
        list.add(new Student("hoang van d", 22, 8.5));
        list.add(new Student("dang van e", 15, 8.5));
        while (true) {
            int index = 0;
            int choice = 0;
            System.out.print("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.print("input remove index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list, index);
                    break;
                case 4:
                    System.out.print("input edit index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list, index);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}