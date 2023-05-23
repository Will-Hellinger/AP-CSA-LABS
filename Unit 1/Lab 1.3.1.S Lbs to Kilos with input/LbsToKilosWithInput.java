import java.util.Scanner;
public class LbsToKilosWithInput 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the weight in pounds: ");
		double pounds= Double.parseDouble(kb.nextLine());
		double kilograms=pounds/2.205;
		System.out.println(pounds+" pounds = "+kilograms+" kilograms");
	}
}