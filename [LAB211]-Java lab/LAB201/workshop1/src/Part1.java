
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
public class Part1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static int getNumber(String title) {
        while (true) {
            try {
                System.out.print(title);
                int number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    System.err.println("The number is invalid\n");
                    System.out.print(title);
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.err.println("The number is invalid\n");

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The user interface may be:");
        int a = getNumber("Enter number of rows: ");
        int b = getNumber("Enter number of columns: ");
        int[][] arr = new int[a][b];
        int sum = 0;
        System.out.println("Enter the matrix");

        //input element of array
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = getNumber("m[" + i + "][" + j + "]=");
            }
        }

        //output elmement of array
        System.out.println("Matrix Inputted:");
        for (int i = 0; i < a; i++) {
            String output = "";
            for (int j = 0; j < b; j++) {

                if (j != b - 1) {
                    output += String.valueOf(arr[i][j]);
                } else {
                    output += arr[i][j] + new String(" ");
                }
            }
            System.out.print(output + '\n');
        }

        //calculate sum of array
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        double average = (double) sum / ((double) a * (double) b);
        System.out.println("Average: " + average);

    }

}
