package ge.ufc.main;

import ge.ufc.exeptions.LimitException;
import ge.ufc.exeptions.RectangleValidateException;
import ge.ufc.exeptions.TriagleValidateException;

public class Main {
	public static void main(String[] args) throws LimitException, RectangleValidateException, TriagleValidateException {
		Rectangle re1 = new Rectangle(1, 3);
		Rectangle re2 = new Rectangle(1, 3);
		Rectangle re3 = new Rectangle(1, 3);
		Rectangle re4 = new Rectangle(1, 3);
		Rectangle re5 = new Rectangle(1, 3);
		Rectangle re6 = new Rectangle(-1, -3);
		System.out.println(re6.validate());
	}
}
