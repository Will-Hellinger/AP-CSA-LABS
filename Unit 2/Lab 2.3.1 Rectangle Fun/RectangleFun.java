import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleFun 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Width: ");
		int w = kb.nextInt();
		System.out.print("Height: ");
		int h = kb.nextInt();
		System.out.print("X: ");
		int x = kb.nextInt();
		System.out.print("Y: ");
		int y = kb.nextInt();		
    Rectangle shape = new Rectangle(x, y, w, h);
    System.out.println("Perimeter = " + ((shape.getWidth() * 2) + (shape.getHeight() * 2)));
    shape.setLocation((int)(shape.getX() - 4), (int)(shape.getY() + 2));
    System.out.println("New location is (" + shape.getX() + "," + shape.getY() + ")");
	}
}