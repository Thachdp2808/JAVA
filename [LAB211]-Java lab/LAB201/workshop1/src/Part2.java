
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MANH HUNG
 */
public class Part2 {

    private static Scanner sc = new Scanner(System.in);

    //function to get number valid
    public static int getNumber(String title) {
        while (true) {
            try {
                System.out.print(title);
                int number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.err.println("The number is invalid\n");
            }
        }
    }

    //function to get operator
    public static String getOperator() {
        while (true) {
            String operator = sc.nextLine().trim();
            if (operator.isEmpty()) {
                System.out.println("Input is not empty!");
            } else if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-")
                    || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")
                    || operator.equalsIgnoreCase("=")) {
                return operator;
            } else {
                System.err.println("You must be input digit operator");
                System.out.print("Input the operator: ");
            }
        }
    }

    public static void main(String[] args) {
        boolean isValidOperator = true;
        int num1 = getNumber("Input the number 1: ");
        int num2 = getNumber("Input the number 2: ");
        int result = 0;
        System.out.print("Input the operator: ");
        String operator = getOperator();
        if (operator.equalsIgnoreCase("+")) {
            result = num1 + num2;
        } else if (operator.equalsIgnoreCase("-")) {
            result = num1 - num2;
        } else if (operator.equalsIgnoreCase("*")) {
            result = num1 * num2;
        } else if (operator.equalsIgnoreCase("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Can not divide by 0");
                isValidOperator = false;
            }
        } else {
            System.out.println("Operator is invalid!");
            isValidOperator = false;
        }

        if (isValidOperator) {
            System.out.println("The result of " + num1 + " " + operator + " " + num2 + " = " + result);
        }

    }
}
