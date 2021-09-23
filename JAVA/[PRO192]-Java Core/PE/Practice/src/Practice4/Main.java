package Practice4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("input choice: ");
        choice = Integer.parseInt(sc.nextLine());
        Validate v = new Validate();
        System.out.print("input text: ");
        String txt = sc.nextLine();
        switch (choice) {
            case 1:
                int a = v.f1(txt);
                System.out.println("count: " + a);
                break;
            case 2:
                v.f2(txt);
                break;
            case 3:
                v.f3(txt);
                break;
            case 4:
                v.f4(txt);
                break;
            case 5:
                v.f5(txt);
                break;
            case 6:
                int count = v.f6(txt);
                System.out.println("count: " + count);
                break;
        }

    }
}
