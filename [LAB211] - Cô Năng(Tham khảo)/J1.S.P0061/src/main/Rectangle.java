package main;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {

	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void printResult() {
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public double getArea() {
		return width * length;
	}
}
