import java.util.Scanner;
public class FromHereToThere 
{
	public static void main(String[] args) 
	{
    Scanner kb = new Scanner(System.in);
		System.out.print("First number? ");
		int first = kb.nextInt();
		System.out.print("Second number? ");
		int second = kb.nextInt();
    while (first <= second) {
      System.out.println(first);
      first++;
    }
  }
}