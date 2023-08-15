package View;

import java.util.ArrayList;
import java.util.List;

import BO.CarManager;
import Model.Car;

public class ViewCarManager {
	private static void display() {
		CarManager manager = new CarManager();
        List<Car> lc = new ArrayList<>();
        manager.addCar(lc);
        System.out.println("Input information of car");
        while (true) {
        	 System.out.print("Name: ");
             String name = manager.checkInputString();
             System.out.print("Color: ");
             String color = manager.checkInputString();
             System.out.print("Price: ");
             int price = manager.checkInputInt();
             System.out.print("Today: ");
             String today = manager.checkInputString();
            if (!manager.checkNameCar(lc, name, color, price, today)) {
                return;
            }
        }
    }

    public static void main(String[] args) {
    	display();
	}
}
