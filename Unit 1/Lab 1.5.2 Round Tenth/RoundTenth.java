import java.util.Scanner;
public class RoundTenth 
{
	public static void main(String[] args) 
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("Decimal number? ");
		double number = kb.nextDouble() * 10;
        double roundedNum;

	if (number < 0){
      if ((number % 1) < -.5){
        roundedNum = (number - (1 + (number % 1)))/10;
      }
      else{
        roundedNum = (number - (number % 1))/10;
      }
    }
    else{
      if ((number % 1) > .5){
        roundedNum = (number + (1 - (number % 1)))/10;
      }
      else{
        roundedNum = (number - (number % 1))/10;
      }
    }

		System.out.println((number/10d) + " rounded to the nearest tenth is " + roundedNum);
	}
}