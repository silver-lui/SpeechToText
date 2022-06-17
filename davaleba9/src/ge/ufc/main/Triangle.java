package ge.ufc.main;

import ge.ufc.Figure;
import ge.ufc.exeptions.TriagleValidateException;

public class Triangle extends Figure{
	private double a, b, c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public boolean validate() throws TriagleValidateException{
		if(this.a <= 0 || this.b <= 0 || this.c <= 0)
			throw new TriagleValidateException("Incorrect Value");
		if(this.a + this.b < this.c || this.b + this.c < this.a || this.c + this.a < this.b)
			throw new TriagleValidateException("Incorrect Values");
		
		return true;
	}

}
