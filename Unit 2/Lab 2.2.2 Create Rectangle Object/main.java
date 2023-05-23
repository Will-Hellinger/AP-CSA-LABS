import java.lang.Math;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;
public class main{
    public static void main(String [] args){
        System.out.println("Created by Will Hellinger");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the width: ");
		int w = kb.nextInt();
		System.out.print("Enter the height: ");
		int h = kb.nextInt();
        Point p = new Point(0, 0);
        Dimension d = new Dimension(w, h);
        Rectangle r = new Rectangle(p, d);
        System.out.println(r);
    }
}