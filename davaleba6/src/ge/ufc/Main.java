package ge.ufc;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		Triangle tri = new Triangle(2, 3, 6, 9);
		Rectangle rec = new Rectangle(4, 7);
		
		m.printFigure(rec);
		m.printFigure(tri);
		m.printHelloFigure(rec);
		m.printHelloFigure(tri);
	}
	
	public void printFigure(IFigure fig) {
		if (fig instanceof Triangle) {
			Triangle tri = (Triangle)fig;
			tri.printFigureData();
			System.out.println(tri.getArea());
			System.out.println(tri.getArea());
		}else if (fig instanceof Rectangle) {
			Rectangle rec = (Rectangle)fig;
			rec.printFigureData();
			System.out.println(rec.getArea());
			System.out.println(rec.getArea());
		}
	}
	
	public void printHelloFigure(AnotherIFigure fig) {
		if (fig instanceof Triangle) {
			Triangle tri = (Triangle)fig;
			tri.sayHelloToFigure();
		}else if (fig instanceof Rectangle) {
			Rectangle rec = (Rectangle)fig;
			rec.sayHelloToFigure();
		}else {
			System.out.println("Invalid Figure");
		}
	}
}
