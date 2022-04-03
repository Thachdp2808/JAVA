
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validate {
    private final Scanner sc = new Scanner(System.in);
    
    public String inputText(String mes) {
        String s;
        System.out.print(mes + "");
        while (true) {

            s = sc.nextLine();
            
            if (s.isEmpty() && !mes.contains("Press \"Enter\" to") && !mes.contains("Enter name need to find: ")) {
                System.out.println("Please enter something!");
                System.out.println("Enter again: ");
                continue;
            }
            return s;
        }
    }

    public void showMes(String mes) {
        System.out.print(mes);
    }
    
    public void display(Bus Bus) {
        System.out.printf("%-5s|  %-12s|    %2d  |   %d  |  %.2f  |  %.2f  |  %.2f  ", Bus.getBcode(),
                                Bus.getBus_name(), Bus.getSeat(), Bus.getBooked(), Bus.getDepart_time(),
                                Bus.getArrival_time(), Bus.getArrival_time()-Bus.getDepart_time());
    }
    
    public void displayCus(Customer cus) {
        System.out.printf("%-5s|  %-12s|  %2s",cus.getCcode(),cus.getCus_name(),cus.getPhone());
    }
    
    public void displayBooking(Booking o) {
        System.out.printf("%-5s|  %-12s|  %2s",o.getBcode(),o.getCcode(),o.getSeat());
    }
    
    public int validateInt(String mess, int min, int max) {
        int result = 0;
        while (true) {
            try {
                System.out.print(mess);
                result = Integer.parseInt(sc.nextLine().trim());
                
                if (min > result || max < result) {
                    System.err.println("Input out of range! Please enter a value from " + min + " to " + max);
                    System.out.print("Enter again: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter an integer!");
                System.out.print("Enter again: ");
            }
        }
        return result;
    }

    public void showWar(String war) {
        System.err.println(war);
    }
    
    public double validateDouble(String mess,int min, int max) {
        double result = 0;
        while (true) {
            try {
                System.out.println(mess);
                result = Double.parseDouble(sc.nextLine().trim());
                if (min > result || max < result) {
                    System.err.println("Input out of range! Please enter a value from " + min + " to " + max);
                    System.out.print("Enter again: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter an double!");
                System.out.print("Enter again: ");
            }
        }
        return result;
    }

    public int MenuBus() {
        System.out.println("\n\n\t\tBus MENU\n"
                + "1.      Load data from file\n"
                + "2.      Input & add to the end\n"
                + "3.      Display data\n"
                + "4.      Save bus list to file\n"
                + "5.      Search by bcode\n"
                + "6.      Delete by bcode\n"
                + "7.      Sort by bcode\n"
                + "8.      Add before position k\n"
                + "9.      Delete the node before the node having bcode = xCode\n"
                + "10.     update seat\n "
                + "0.      Exit\n");
        return validateInt("Choose: ", 0, 10);
    }
    
    public int MenuCustomer() {
        System.out.println("\n\n\t\tCUSTOMER MENU\n"
                + "1.      Load data from file\n"
                + "2.      Input & add to the end\n"
                + "3.      Display data\n"
                + "4.      Save Customer list to file\n"
                + "5.      Search by ccode\n"
                + "6.      Delete by ccode\n"
                + "0.      Exit\n");
        return validateInt("Choose: ", 0, 6);
    }
    
    public int MenuOrdering() {
        System.out.println("\n\n\t\tCUSTOMER MENU\n"
                + "1.      Input data\n"
                + "2.      Display data\n"
                + "3.      Sort  by bcode + ccode\n"
                + "0.      Exit\n");
        return validateInt("Choose: ", 0, 3);
    }
    
    public String inputBusbCode() {
        return inputText("\nEnter Bus bcode: ");
    }

    public String inputbus_name() {
        return inputText("\nEnter bus_name: ");
    }

    public int inputseat() {
        return validateInt("\nEnter seat: ",1,Integer.MAX_VALUE);
    }

    public int inputbooked () {
        return validateInt("\nEnter booked : ",1,Integer.MAX_VALUE);
    }

    public String inputCustomerCode() {
        return inputText("\nEnter customer code: ");
    }
    
    public boolean checkYesNo(String mes) {
        String s = inputText(mes + "\n");
        while (true) {

            if (s.equalsIgnoreCase("N") || s.equalsIgnoreCase("NO")) {
                return false;
            }
            if (s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("YES")) {
                return true;
            }
            s = inputText("Enter again: ");
        }
    }
    
}
