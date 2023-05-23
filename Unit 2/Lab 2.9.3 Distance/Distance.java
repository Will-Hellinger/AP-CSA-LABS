import java.awt.Point;
import java.util.Scanner;

public class Distance{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the coordinates of the first point (x1,y1): ");
    String[] tempString = kb.nextLine().split(" ", 2);
    int x1 = Integer.parseInt(tempString[0]);
    int y1 = Integer.parseInt(tempString[1]);
    System.out.print("Enter the coordinates of the second point (x2,y2): ");
    tempString = kb.nextLine().split(" ", 2);
    int x2 = Integer.parseInt(tempString[0]);
    int y2 = Integer.parseInt(tempString[1]);
    double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

    System.out.print("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance );
  }
}