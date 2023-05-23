import java.util.Scanner;
public class EveryOtherLetter 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = kb.next();
		for(var i = 0; i < s.length(); i++)
      if (i % 2 == 0){
			  System.out.print(s.substring(i, i + 1));
      }
	}
}