package ge.ufc;

public class Rectangle extends Figure implements IFigure, AnotherIFigure {
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public void printFigureData() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	@Override
	public void printFigureAreaAndLength() {
		Figure fig = new Rectangle(2, 3);
		fig.printFigureAreaAndLength();
	}

	@Override
	public double getPer() {
		return (a + b) * 2;
	}

	@Override
	public double getArea() {
		return a * b;
	}


	@Override
	public void sayHelloToFigure() {
		System.out.println("Hello Rectangle!");
	}


	@Override
	public boolean validateFigure() {
		if (a <= 0 || b <= 0)
			return false;
		return true;
	}
}
