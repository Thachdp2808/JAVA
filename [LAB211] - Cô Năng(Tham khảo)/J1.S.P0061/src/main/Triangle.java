package main;

public class Triangle extends Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle() {
		
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double getArea() {
		double p = (sideA + sideB + sideC) / 200;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
	
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
	public void printResult() {
		System.out.println("Side A: " + this.sideA);
        System.out.println("Side B: " + this.sideB);
        System.out.println("Side C: " + this.sideC);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
	}
	
	
}
