/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

public class Main {
    public static void main(String[] args) throws Exception {

        View_Student view = new View_Student();
        while (true) {
            displayMenu();
            int option = Ultility.getInt("OPTION: ", "Wrong", 1, 5);
            switch (option) {
                case 1:
                    //1.Input  
                    view.input();
                    break;
                case 2:
                    //2.find and sort
                    view.findAndSort();
                    break;

                case 3:
                    //3.updateOrDelete
                    view.updateOrDelete();
                    break;

                case 4:
                    //4.report
                    view.report();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }

        }

    }

    private static void displayMenu() {
        System.out.println("============================ MENU ============================");
        System.out.println("WELCOME TO STUDENT MANAGEMENT\n"
                + "1.	Create\n"
                + "2.	Find and Sort\n"
                + "3.	Update/Delete\n"
                + "4.	Report\n"
                + "5.	Exit");
    }
    
}
