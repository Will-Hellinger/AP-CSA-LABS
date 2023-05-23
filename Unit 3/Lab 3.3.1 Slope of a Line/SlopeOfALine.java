import java.util.Scanner;
public class SlopeOfALine
{
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter x1: ");
      double x1 = kb.nextInt();
      System.out.print("Enter y1: ");
      double y1 = kb.nextInt();
      System.out.print("Enter x2: ");
      double x2 = kb.nextInt();
      System.out.print("Enter y2: ");
      double y2 = kb.nextInt(); 
      if (x1 == x2){
        System.out.println("The line defined by the points (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") is a vertical line and the slope is undefined.");
      }else{
        System.out.println("The line defined by the points (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " + ((y2 - y1)/(x2 - x1)) + ".");
      }
    }
}
