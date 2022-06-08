package ge.ufc;

public class Triangle extends Figure implements IFigure, AnotherIFigure {
	private double a, b, c;
	private double h;
	
	Triangle(double a, double b, double c, double h){
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	@Override
	public void printFigureData() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	@Override
	public void printFigureAreaAndLength() {
		Figure fig = new Triangle(2, 3, 4, 10);
		fig.printFigureAreaAndLength();
	}

	@Override
	public double getPer() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		return a * h / 2;
	}

	@Override
	public void sayHelloToFigure() {
		System.out.println("Hello Triangle!");
	}

	@Override
	public boolean validateFigure() {
		if (a <= 0 || b <= 0 || c <= 0)
			return false;
		if (a + b > c || b + c > a || a + c > b)
			return false;
		return true;
	}
}
