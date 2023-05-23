public class TotalWithTax 
{
	public static void main(String[] args) 
	{
		final double TAXRATE = 0.0825;
    double price, tax, totalCost;
    price = 52.75;
    tax = price*TAXRATE;
    totalCost = price + tax;

    System.out.println("Price: $" + price + "\nSales Tax: $" + tax + "\nTotal: $" + totalCost);
    
	}
}