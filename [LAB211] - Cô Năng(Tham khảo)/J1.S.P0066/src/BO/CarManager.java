package BO;

import java.util.List;
import java.util.Scanner;

import Model.Car;

public class CarManager {
	public Scanner sc = new Scanner(System.in);
	 public  String checkInputString() {
	        while (true) {
	            String result = sc.nextLine();
	            if (result.length() == 0) {
	            	System.err.println("Not empty");
	            } else {
	                return result;
	            }
	        }
	    }

	    public int checkInputInt(){
	        while (true) {
	            try {
	                int result = Integer.parseInt(sc.nextLine());
	                if (result <= 0) {
	                	System.err.println("Price greater than zero");
	                }
	                return result;
	            } catch (NumberFormatException ex) {
	            	System.err.println("Price is digit");
	            }

	        }
	    }
	
	private boolean checkYN() {
        while (true) {
            String result = checkInputString();
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }
    }
	
	private boolean checkCarExist(Car car, String color, int price,
            String today) {
        boolean check = false;
        String[] listColor = car.getColor();
        int[] listPrice = car.getPrice();
        String[] listSold = car.getSoldOn();
        if (!color.equalsIgnoreCase("no color")) {
            for (int i = 0; i < listColor.length; i++) {
                if (color.equalsIgnoreCase(listColor[i])) {
                    check = true;
                    break;
                }
            }
        } else {
            check = true;
        }
        if (check == false) {
            System.err.println("Color Car does not exist");
        }
        check = false;
        for (int i = 0; i < listPrice.length; i++) {
            if (price == listPrice[i] - 100) {
                check = true;
            }
        }
        if (check == false) {
        	System.err.println("Price Car does not exist");
        }
        check = false;
        for (int i = 0; i < listSold.length; i++) {
            if (today.equalsIgnoreCase(listSold[i])) {
                check = true;
            }
        }
        if (check == false) {
        	System.err.println("Car can't sell today");
        }
        return true;
    }
	
	public void addCar(List<Car> lc) {
        String[] listColorAudi = {"White", "Yellow", "Orange"};
        int[] listPriceAudi = {5500, 3000, 4500};
        String[] listSoldDayAudi = {"Friday", "Sunday", "Monday"};
        lc.add(new Car("Audi", listColorAudi, listPriceAudi, listSoldDayAudi));

        String[] listColorMercedes = {"Green", "Blue", "Purple"};
        int[] listPriceMercedes = {5000, 6000, 8500};
        String[] listSoldDayMercedes = {"TueDay", "Saturday", "Wednesday"};
        lc.add(new Car("Mercedes", listColorMercedes, listPriceMercedes,
                listSoldDayMercedes));

        String[] listColorBMW = {"Pink", "Red", "Brown"};
        int[] listPriceBMW = {2500, 3000, 3500};
        String[] listSoldDayBMW = {"Monday", "Sunday", "Thurday"};
        lc.add(new Car("BMW", listColorBMW, listPriceBMW, listSoldDayBMW));
    }
	
	public boolean checkNameCar(List<Car> lc, String name, String color,
            int price, String today) {
        boolean check = false;
        for (int i = 0; i < lc.size(); i++) {
            if (name.equalsIgnoreCase(lc.get(i).getNameCar())) {
                if (checkCarExist(lc.get(i), color, price, today)) {
                    System.out.println("Sell Car");
                    System.out.print("Do you want find more?(Y/N): ");
                    if (!checkYN()) {
                        return false;
                    }
                } else {
                    System.out.println("Car break");
                }
                check = true;
                break;
            }
        }
        if (check == false) {
        	System.err.println("Can't find car.");
        }
        return true;
    }
	
}
