import java.util.Scanner;
public class AddOneTakeOne 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = kb.nextInt();
		System.out.println((num-1) + " " + num + " " + (num+1));
  }
}