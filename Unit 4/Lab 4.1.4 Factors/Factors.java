import java.util.Scanner;
public class Factors 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = kb.nextInt();
    String outputText = "The factors of " + num + " are: ";
    for (int i = 0; i < num; i++) {
      if (num % (i + 1) == 0){
        outputText += (i + 1) + " ";
      }
    }
    System.out.println(outputText);
	}
}