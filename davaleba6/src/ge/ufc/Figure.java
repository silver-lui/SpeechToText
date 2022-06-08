package ge.ufc;

public abstract class Figure implements IFigure, AnotherIFigure{
	
	public abstract double getPer();
	public abstract double getArea();
	
	public static void sayHello() {
		System.out.println("Hello World!");
	}
	
	public void printFigureAreaAndLength() {
		System.out.println("Per = " + getPer());
		System.out.println("Area = " + getArea());
	}
}
