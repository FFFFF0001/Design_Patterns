package Bridge_Pattern;

import java.util.Scanner;

public class Client {

	public static void main(String[] a) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Color color;
		Pen pen;
		color = new Black();
		pen = new MiddlePen();
		
		pen.setColor(color);
		pen.draw("汽车");
	}
}
