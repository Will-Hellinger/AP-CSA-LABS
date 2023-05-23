import java.util.Scanner;
import java.lang.Math;
public class FindThePower 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = kb.nextInt();
		System.out.print("Enter the exponent: ");
		int exponent = kb.nextInt();
    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
    /*
    double output = base;
    for (int a = 0; a < exponent-1; a++) {
      if exponent >= 2:
        output *= base;
      else if (exponent == 0){
        output = 1;
      }
    }
    System.out.println(base + "^" + exponent + " = " + output);
		*/
	}
}
