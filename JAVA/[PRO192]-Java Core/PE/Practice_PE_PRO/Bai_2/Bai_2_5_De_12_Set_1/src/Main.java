// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;
public class Main {
    
   public static void OutputList(List<Printer> c) {
       for(Printer x : c) {
           System.out.println(x.getName());
       }
   }  
    
   public static void main(String args[]) throws Exception {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       List<Printer> a = new ArrayList();
       a.add(new Printer("HP 200J", 110));
       a.add(new Printer("HP 2000G", 150));
       a.add(new Printer("Canon G1240", 120));
       System.out.print("Add more how many printer: ");
       int n = Integer.parseInt(in.readLine());
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Printer name: ");
           String name = in.readLine();           
           System.out.print("Printer price: ");
           double price = Double.parseDouble(in.readLine());             
           a.add(new Printer(name, price));
       }
       System.out.println("");
       System.out.print("Enter test function (1-f1;2-f2): ");
       int c = Integer.parseInt(in.readLine());
       IPrinter i = new MyPrinter();
       double givenPrice = 0;
       String givenName = "";
       if(c == 1) {
           System.out.print("Enter given printer price: ");
           givenPrice = Double.parseDouble(in.readLine());
       }else if (c == 2) {
            System.out.print("Enter given printer name: ");
            givenName = in.readLine();
       }
       System.out.println("");
       System.out.println("OUTPUT:");    
       if(c == 1) {
           i.f1(a, givenPrice);
           OutputList(a);
       }
       else if(c == 2) {
          System.out.println(i.f2(a,givenName));  
       }
   }
 }
