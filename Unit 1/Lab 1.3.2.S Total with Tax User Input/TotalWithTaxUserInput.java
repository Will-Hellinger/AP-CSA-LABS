import java.util.Scanner;
public class TotalWithTaxUserInput 
{
	public static void main(String[] args) 
	{
		final double TAXRATE = 0.0825;
		double totalCost, tax, price;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the price: ");
		price = Double.parseDouble(kb.nextLine());
   
		tax = price * TAXRATE;
		totalCost = price + tax;
		System.out.println("Price: $" + price);
		System.out.println("Sales Tax: $" + tax);
		System.out.println("Total: $" + totalCost);
	}
}
