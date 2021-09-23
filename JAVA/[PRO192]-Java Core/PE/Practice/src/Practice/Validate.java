package Practice;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alias
 */
public class Validate implements Vali {

    @Override
    public void add(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input name: ");
        String name = sc.nextLine();
        System.out.print("input age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("input mark: ");
        double mark = Double.parseDouble(sc.nextLine());

        Student s = new Student(name, age, mark);
        list.add(s);

    }

    @Override
    public void display(List<Student> list) {
        for (Student o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void remove(List<Student> list, int index) {
        list.remove(index);
    }

    @Override
    public void edit(List<Student> list, int index) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input name: ");
        String name = sc.nextLine();
        System.out.print("input age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("input mark: ");
        double mark = Double.parseDouble(sc.nextLine());
        
        list.get(index).setName(name);
        list.get(index).setAge(age);
        list.get(index).setMark(mark);

    }

}
