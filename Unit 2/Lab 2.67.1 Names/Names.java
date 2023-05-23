import java.util.Scanner;
public class Names
{
	public static void main(String [] cats)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter first name ==>");
		String first = kb.next();

		System.out.print("Enter last name ==>");
		String last = new String(kb.next());
    
    System.out.println(first + " " + last);
    System.out.println(first.length() + last.length());
    System.out.println(String.valueOf(first.charAt(0)) + String.valueOf(last.charAt(0)));
    System.out.println(first.compareTo(last));
    System.out.println(last.indexOf(String.valueOf(first.charAt(first.length()-1))));
    System.out.println(first.indexOf(String.valueOf(last.charAt(last.length()-1))));
    String[] variableArray = {first, last};
    String[] tempTexts = {"none", "none"};
    for (int a = 0; a < 2; a++) {
      String tempText = "";
      for (int b = 0; b < variableArray[a].length(); b++) {
        if (b >= (variableArray[a].length()/2)){
          tempText += variableArray[a].charAt(b);
        }
      }
      tempTexts[a] = tempText;
    }
    System.out.println(first.replace(tempTexts[0], tempTexts[1]));
    System.out.println(last.replace(tempTexts[1], tempTexts[0]));
	}
}
