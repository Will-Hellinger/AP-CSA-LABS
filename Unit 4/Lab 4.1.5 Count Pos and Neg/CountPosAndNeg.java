import java.util.Scanner;
public class CountPosAndNeg
{
	public static void main(String[] args) 
	{
	Scanner kb = new Scanner(System.in);
    int positiveValues = 0;
    int negativeValues = 0;
    while (true){
      System.out.print("Enter a positive or negative number or 0 to quit: ");
      int numIn = kb.nextInt();
      if (numIn == 0){
        break;
      }else if (numIn > 0){
        positiveValues ++;
      }else if (numIn < 0){
        negativeValues ++;
      }
    }
    System.out.println("There were " + positiveValues + " positive numbers and " + negativeValues + " negative numbers.");
	}
}