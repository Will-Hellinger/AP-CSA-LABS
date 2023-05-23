import java.util.Scanner;
public class RoundNegatives 
{
	public static void main(String[] args) 
	{
    int roundedNum;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a negative decimal number: ");
		double number = kb.nextDouble();

    if (number < 0){
      if ((number % 1) < -.5){
        roundedNum = (int)(number - (1 + (number % 1)));
      }
      else{
        roundedNum = (int)(number - (number % 1));
      }
    }
    else{
      if ((number % 1) > .5){
        roundedNum = (int)(number + (1 - (number % 1)));
      }
      else{
        roundedNum = (int)(number - (number % 1));
      }
    }

		System.out.println(number + " rounded to a whole number is " + roundedNum);
	}
}
