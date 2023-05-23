import java.util.Scanner;
public class FindTheAverage 
{
	public static void main(String[] args) 
	{
    double average = 0;
//    double values[];
//    values = new double[4];
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter four values.");
    for (int i = 0; i < 4; i++) {
      System.out.print("Value " + (i+1) + ": ");
//		  values[i] = (kb.nextDouble());
      average += kb.nextDouble();
    }
		System.out.println("Average = " + (average/4d));
	}
}