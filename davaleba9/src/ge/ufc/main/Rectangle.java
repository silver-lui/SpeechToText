package ge.ufc.main;

import ge.ufc.Figure;
import ge.ufc.exeptions.LimitException;
import ge.ufc.exeptions.RectangleValidateException;

public class Rectangle extends Figure{
	private double a, b;
	public static int counter;
	
	public Rectangle(double a, double b) throws LimitException {
		this.a = a;
		this.b = b;
		
		Rectangle.counter++;
		
		if(Rectangle.counter > 5)
			throw new LimitException("More Than 5 Rectangles");
	}

	@Override
	public boolean validate() throws RectangleValidateException {
		if(this.a <= 0 || this.b <= 0)
			throw new RectangleValidateException("Incorrect Value");
		
		return true;
	}
}
