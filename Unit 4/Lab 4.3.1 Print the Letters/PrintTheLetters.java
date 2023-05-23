import java.util.Scanner;
public class PrintTheLetters 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = kb.next();
		for(int i = 0; i < s.length(); i++)
			System.out.println(s.substring(i, i+1));
	}
}
