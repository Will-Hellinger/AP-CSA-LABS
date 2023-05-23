import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles 

{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the x coordinate: ");
		int x = kb.nextInt();
		System.out.print("Enter the y coordinate: ");
		int y = kb.nextInt();		

		Point p = new Point(x, y);

		System.out.print("Enter the width: ");
		int w = kb.nextInt();
		System.out.print("Enter the height: ");
		int h = kb.nextInt();		
    
    Dimension d = new Dimension(w, h);
    Rectangle r = new Rectangle(p, d);

		//Instantiate a Dimension object d.
		//Instantiate a Rectangle object r.		

    System.out.println(p);
		System.out.println(d);
		System.out.println(r);
	}
}