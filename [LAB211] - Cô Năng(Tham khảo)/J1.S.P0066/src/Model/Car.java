package Model;

public class Car {
	private String nameCar;
	private String[] color;
	private int[] price;
	private String[] soldOn;
	
	public Car() {
		
	}

	public Car(String nameCar, String[] color, int[] price, String[] soldOn) {
		super();
		this.nameCar = nameCar;
		this.color = color;
		this.price = price;
		this.soldOn = soldOn;
	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
	}

	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	public String[] getSoldOn() {
		return soldOn;
	}

	public void setSoldOn(String[] soldOn) {
		this.soldOn = soldOn;
	}
	
	
}
