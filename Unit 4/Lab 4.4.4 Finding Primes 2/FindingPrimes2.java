//This is the FindingPrimes code from 
//Lesson 4.4.3 Finding Prime Numbers.

//Modify this code to match the output shown in the sample runs
import java.util.Scanner;
public class FindingPrimes2 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
    int start  = 0;
    int end = 0;

    while (true){
		  System.out.print("Enter two positive numbers: ");
		  start = kb.nextInt();
		  end = kb.nextInt();
      if (start > end){
        int temp = start;
        start = end;
        end = temp;
      }
      if (start >= 1 && end >= 1 && ((kb.nextLine()).split(" ")).length <= 2){
        break;
      } else{
        System.out.print("Numbers must be greater than zero. Please try again.");
      }
    }
		for(int num = start; num <= end; num++)
		{
			int divisor = 2;
			boolean isPrime = true;
			while(isPrime && divisor <= Math.sqrt(num))
			{
				if(num % divisor == 0)
					isPrime = false;
				divisor++;
			}
			if(isPrime)
        if (num != 1)
				  System.out.print(num + " ");
		}
	}
}