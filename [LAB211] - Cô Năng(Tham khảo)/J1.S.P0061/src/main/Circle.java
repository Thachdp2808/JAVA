package main;

public class Circle extends Shape {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRaidus() {
		return radius;
	}

	public void setRaidus(double radius) {
		this.radius = radius;
	}

	public void printResult() {
		System.out.println("Radius: " + this.radius);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

	public double getPerimeter() {
		return 2 * radius * 3.14;
	}

	public double getArea() {
		return 3.14 * (radius * radius);
	}

}
