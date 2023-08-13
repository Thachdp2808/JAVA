package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter number of array:");
		int length = scanner.nextInt();
		int[] array = inputArray(length);
		
		 System.out.println("Enter search value:");
	     int search = scanner.nextInt();
	     
	     System.out.print("The array: ");
	     displayArray(array);

	     int foundIndex = linerSearch(array, search);
	     System.out.println("\nFound " + search + " at index: " + foundIndex);
	}

	public static Scanner scanner = new Scanner(System.in);

	public static int[] inputArray(int length) {
		Random random = new Random();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(length);
		}
		return array;
	}

	public static void displayArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static int linerSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
