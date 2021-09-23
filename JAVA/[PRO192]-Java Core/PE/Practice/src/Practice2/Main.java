package Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    //hien thi ra list Teacher
    public void f1(List<Teacher> list) {

    }

    //hien thi ra list teacher tang dan theo ho ten
    public void f2(List<Teacher> list) {

    }

    //dem va tra ve so luong giao vien co tong luong luong >= 500$
    public int f3(List<Teacher> list) {
        int count = 0;

        return count;
    }

    //hien thi thong tin nhung giao vien co luong cao nhat
    public void f4(List<Teacher> list) {

    }

    //hien thi ra 4 chu cai dau tien cua ten giao vien
    public void f5(List<Teacher> list) {

    }

    //hien thi ra ten cua giao vien
    public void f6(List<Teacher> list) {

    }

    //hien thi ra ho cua giao vien
    public void f7(List<Teacher> list) {

    }

    public static void main(String[] args) {
        Main m = new Main();
        Teacher t0 = new Teacher(20, 65, "trinh van cong", 50);
        Teacher t1 = new Teacher(10, 150, "trinh van cong", 50);
        Teacher t2 = new Teacher(20, 45, "nguyen van nam", 50);
        Teacher t3 = new Teacher(20, 25, "trinh van leng", 50);
        Teacher t4 = new Teacher(5, 300, "hoang van hao", 50);
        Teacher t5 = new Teacher(20, 25, "trinh van trung", 50);
        Teacher t6 = new Teacher(20, 75, "trinh van sam", 50);
        List<Teacher> listT = new ArrayList<>();
        listT.add(t0);
        listT.add(t1);
        listT.add(t2);
        listT.add(t3);
        listT.add(t4);
        listT.add(t5);
        listT.add(t6);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("input choice: ");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                m.f1(listT);
                break;
            case 2:
                m.f2(listT);
                break;
            case 3:
                System.out.println("giao vien co luong >=500: " + m.f3(listT));
                break;
            case 4:
                m.f4(listT);
                break;
            case 5:
                m.f5(listT);
                break;
            case 6:
                m.f6(listT);
                break;
            case 7:
                m.f7(listT);
                break;
        }

    }
}
