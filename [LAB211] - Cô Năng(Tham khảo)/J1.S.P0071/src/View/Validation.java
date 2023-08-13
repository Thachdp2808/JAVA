package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Task;

public class Validation {
	Scanner sc = new Scanner(System.in);

	public String InputText(String Mess, String regex) {
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

	public int InputInt(String Mess, int Min, int Max, String Erro) {
		int num;
		do {
			System.out.print(Mess);
			try {
				num = Integer.parseInt(sc.nextLine());
				if (num >= Min && num <= Max) {
					break;
				}
				System.out.println(Erro);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, plz input again");
			}
		} while (true);
		return num;
	}

	public double InputDoubleToadd(String Mess, double a, double b) {
		double numd;
		do {
			System.out.print(Mess);
			try {
				numd = Double.parseDouble(sc.nextLine());
				if (numd > a && numd <= b) {
					if (numd % 0.5 == 0) {
						break;
					}
				}
				System.out.println("Out of the range,plz enter in range:(from " + (a + 0.5) + " to " + b + ")");
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, plz input again");
			}
		} while (true);
		return numd;
	}

	public int getLastID(List<Task> list) {
		int lastID;
		if (!list.isEmpty()) {
			int lastIndex = list.size() - 1;
			lastID = list.get(lastIndex).getId();
		} else {
			lastID = 0;
		}
		return lastID;
	}

	public String InputDateTimeToadd(String Mess, String format) {
		SimpleDateFormat SDF = new SimpleDateFormat(format);
		SDF.setLenient(false);
		do {
			System.out.print(Mess);
			String date = sc.nextLine();
			try {
				SDF.parse(date);
				return date;
			} catch (ParseException e) {
				System.out.println("Invalid input,plz Enter by format again: '" + format + "'");
			}
		} while (true);

	}


}
