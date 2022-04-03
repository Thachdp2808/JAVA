/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagement;

/**
 *
 * @author MANH HUNG
 */
import TaskManagement.Employee;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Function {

    ArrayList<Employee> employ = new ArrayList<Employee>();

//    public Function() {
//        Employee a = new Employee("Code", "Dev program1", "28-08-2015", "Dev", "Lead", (double) 9.2, (double) 17, 1);
//        employ.add(a);
//
//        Employee b = new Employee("Desgin", "Dev program2", "28-08-2015", "Dev", "Lead", (double) 9.0, (double) 17, 2);
//        employ.add(b);
//
//        Employee c = new Employee("Test", "Dev program3", "28-08-2015", "Fresher", "Lead", (double) 8.5, (double) 9, 3);
//        employ.add(c);
//
//        Employee d = new Employee("Review", "Intern program", "28-08-2015", "Intern", "Lead", (double) 9, (double) 10, 4);
//        employ.add(d);
//    }
    void menu() {
        System.out.println("=========== Task program ===========");
        System.out.println(" 1. Add Task");
        System.out.println(" 2. Delete Task");
        System.out.println(" 3. Display Task");
        System.out.println(" 4. Exit");
    }

    int menuInputCase() {
        String inputcase;
        boolean valid;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        do {
            System.out.println("Please choose program task: ");
            inputcase = sc.nextLine();
            valid = inputcase.matches("[1234]");// check if inputcase was corrected or not!
            if (!valid) {
                System.out.println("Please choose a number from 1-4.");
            }
        } while (!valid); //break out loop in case input valid
        return Integer.valueOf(inputcase);
    }

    int validateJavaDate(String strDate) {
        /* Check if date is 'null' */
        int flag = 0;
        if (!strDate.matches("^\\d{2}-\\d{2}-\\d{4}$")) {
            flag = 0;
            //31-02-1999
        } /* Date is not 'null' */ else {
            /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
            sdfrmt.setLenient(false);
            /* Create Date object
	     * parse the string into date 
             */
            try {
                Date javaDate = sdfrmt.parse(strDate);
                // System.out.println(strDate + " is valid date format");
                flag = 1;
            } /* Date format is invalid */ catch (ParseException e) {
                // System.out.println(strDate + " is invalid Date format");
                flag = 2;
            }
            /* Return true if date format is valid */

        }
        return flag;
    }

    String verifyDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Date:");
            String date = sc.nextLine();
            if (date.isEmpty()) {
                System.out.println("null");
            } else if (date.trim().length() == 0) {
                System.out.println("more space");
            } else {
                if (validateJavaDate(date) == 1) {
                    return date;
                } else if (validateJavaDate(date) == 2) {
                    System.out.println(" Pls check again date , month, year");
                } else {
                    System.out.println("This is not date form");
                }

            }
        }
    }

    int checkID() {  // other name is check matrix size
        String inputcase;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            inputcase = sc.nextLine();
            for (int i = 0; i < inputcase.length(); i++) {
                if (Character.isDigit(inputcase.charAt(i)) && Integer.valueOf(inputcase) != 0) {
                    valid = true;
                } else {
                    valid = false;
                    System.out.println("Please enter integer >0 only!");
                    break;
                }
            }
        } while (!valid); //break out loop in case input valid
        return Integer.valueOf(inputcase);
    }

    String checkName() {
        String name;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            name = sc.nextLine().trim();
            for (int i = 0; i < name.length(); i++) {
                if (String.valueOf(name) != null && Character.isLetter(name.charAt(i))) {
                    valid = true;
                    break;
                } else {
                    valid = false;
                    System.out.println("Please enter only letters!");
                    System.out.print("Please re-enter requirement name: ");
                    break;
                }
            }
        } while (!valid);
        return String.valueOf(name);
    }

    String checkAssignee() {
        String assignee;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            assignee = sc.nextLine().trim();
            for (int i = 0; i < assignee.length(); i++) {
                if (String.valueOf(assignee) != null && Character.isLetter(assignee.charAt(i))) {
                    valid = true;
                    break;
                } else {
                    valid = false;
                    System.out.println("Please enter only letters!");
                    System.out.print("Please re-enter Assignee: ");
                    break;
                }
            }
        } while (!valid);
        return String.valueOf(assignee);
    }

    String checkExpert() {
        String expert;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            expert = sc.nextLine().trim();
            for (int i = 0; i < expert.length(); i++) {
                if (String.valueOf(expert) != null && Character.isLetter(expert.charAt(i))) {
                    valid = true;
                    break;
                } else {
                    valid = false;
                    System.out.println("Please enter only letters!");
                    System.out.print("Please re-enter Reviewer: ");
                    break;
                }
            }
        } while (!valid);
        return String.valueOf(expert);
    }

    int findById(ArrayList<Employee> em, int id) {
        for (int i = 0; i < em.size(); i++) {
            System.out.println(em.get(i).getId());
            if (em.get(i).getId() == -1) {
                return -1;
            }
        }
        System.out.println("ID is not exist");
        return -1;
    }

    String checkTypeOfTask() {
        String Type;
        boolean valid;
        Scanner sc = new Scanner(System.in);
        do {
            Type = sc.nextLine();
            valid = Type.matches("[1234]");// check if inputcase was corrected or not!
            if (!valid) {
                System.out.println("Please choose a number from 1-4.(1.Code  2.Test  3.Design  4.Review)");
            } else {
                if (Type.equals("1")) {
                    Type = "Code";
                }
                if (Type.equals("2")) {
                    Type = "Test";
                }
                if (Type.equals("3")) {
                    Type = "Design";
                }
                if (Type.equals("4")) {
                    Type = "Review ";
                }
            }
        } while (!valid); //break out loop in case input valid
        return Type;
    }

    boolean checkTime(double num) {
        Double number[] = {8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 12.5, 13.0, 13.5, 14.0, 14.5, 15.0, 15.5, 16.0, 16.5, 17.0, 17.5};
        for (Double number1 : number) {
            if (number1 == num) {
                return true;
            }
        }
        return false;
    }

    double checkFrom() {                                       // other name is check matrix size
        double from;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            from = sc.nextDouble();
            if (checkTime(from) && from >= 8 && from <= 17.5) {
                valid = true;
            } else {
                System.out.println("Plan from must be within 8h and 17h30'(between 8.0 and 17.5).");
                System.out.print("From:");
                valid = false;
            }
        } while (!valid); //break out loop in case input valid
        return from;
    }

    double checkTo(double from) {                                       // other name is check matrix size
        double to;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do {
            to = sc.nextDouble();
            if (to > from && to <= 17.5 && checkTime(to)) {
                valid = true;
            } else {
                System.out.println("Plan to must be within Plan from and 17h30.");
                System.out.print("To:");
                valid = false;
            }
        } while (!valid); //break out loop in case input valid
        return to;
    }

    void addTask() {
        String name, type, date, assignee, reviewer;
        double from, to;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Add Task------------");
        System.out.print("Requirement Name:");
        name = checkName();
        System.out.print("Task Type:");
        type = checkTypeOfTask();
        date = verifyDate();
        System.out.print("From:");
        from = checkFrom();
        System.out.print("To:");
        to = checkTo(from);
        System.out.print("Assignee:");
        assignee = checkAssignee();
        System.out.print("Reviewer:");
        reviewer = checkExpert();
        id = employ.size() + 1;
        Employee em = new Employee(type, name, date, assignee, reviewer, from, to, id);
        employ.add(em);
    }

    void deleteTask() {
        System.out.println("----Delete Task----");
        System.out.println("Enter ID to delete: ");
        int id = checkID();
        if (findById(employ, id) != 1) {
            int actualId = id - 1;
            employ.remove(actualId);
            for (int i = actualId; i < employ.size(); i++) {
                Employee curr = employ.get(i);
                curr.setId(curr.getId() - 1);
            }
            System.out.println("Delete success!");
        }
    }

    void getDataTasks() {
        System.out.println("-------------------------------------------- Task ------------------------------------------");
        System.out.println("ID 	  Name		  Task Type	    Date		 Time		  Assignee	    Reviewer");
        for (int i = 0; i < employ.size(); i++) {
            System.out.println(employ.get(i).id + "\t" + employ.get(i).RequirementName + "\t" + employ.get(i).TaskTypeID + "\t\t" + employ.get(i).Date + "\t" + (employ.get(i).to - employ.get(i).from) + "\t\t" + employ.get(i).Assignee + "\t\t" + employ.get(i).Expert);
        }
    }
}