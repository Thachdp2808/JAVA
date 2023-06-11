package fa.training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import fa.training.entities.Book;

public class Validate {
	public static Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.println("====== LIBRARY MANAGEMENT SYSTEM ======");
		System.out.println("1. Add a book");
		System.out.println("2. Add a magazine");
		System.out.println("3. Display books and magazines");
		System.out.println("4. Add author to book ");
		System.out.println("5. Display top 10 of magazines by volume");
		System.out.println("6. Search book by (isbn, author, publisher)");
	}

	public String inputText(String Mess, String regex) {
		String text;
		do {
			System.out.print(Mess);
			text = sc.nextLine();
			if (text.matches(regex))
				break;
			System.out.println("Invalid input, plz enter by following: '" + regex + "'");
		} while (true);
		return text.trim();
	}

	public String inputIsBn(String Mess, List<Book> books) {
		String regexISBN = "[[0-9]+[-]*]*";
		String input;
		do {
			System.out.print(Mess);
			input = sc.nextLine().trim();
			try {
				for (Book book : books) {
					if (book.getIsbn().equals(input)) {
						System.out.println("IBSN is exits.");
						break;
					}
				}
				if (input.matches(regexISBN) && !input.isEmpty() && (input.length() > 10 && input.length() < 17)) {
					break;
				}
				System.out.println("10-17 digit number and the ‘-‘ quote. Ex: 678-3-16-1486.");
			} catch (Exception e) {
				System.err.println("10-17 digit number and the ‘-‘ quote. Ex: 678-3-16-1486.");
			}
		} while (true);
		return input;
	}

	public int inputInt(String Mess, int Min, int Max, String Erro) {
		int number;
		do {
			System.out.print(Mess);
			try {
				number = Integer.parseInt(sc.nextLine());
				if (number >= Min && number <= Max) {
					break;
				}
				System.out.println(Erro);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, please input again");
			}
		} while (true);
		return number;
	}

	public Date inputDateTime(String Mess, String format) {
		SimpleDateFormat SDF = new SimpleDateFormat(format);
		SDF.setLenient(false);
		Date date = null;
		do {
			System.out.print(Mess);
			String value = sc.nextLine();
			try {
				date = SDF.parse(value);
				return date;
			} catch (ParseException e) {
				System.out.println("Invalid input,plz Enter by format again: '" + format + "'");
			}
		} while (true);

	}

	public Set<String> setAuthour(int size) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter author: " + (i + 1) + ": ");
			String author = inputText("Input author name: ", "[a-zA-z ]+");
			set.add(author);
		}
		return set;
	}

	public Book bookById(String isbn, List<Book> listB) {
		for (Book book : listB) {
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}

}
