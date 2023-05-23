import java.util.Scanner;
public class Palindromes{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = kb.next();

    String output = "";
    for(var i = word.length(); i > 0; i--){
      output += word.charAt((i - 1));
    }
    if (output.equals(word)){
      System.out.println(word + " is a palindrome.");
    } else{
      System.out.println(word + " is not a palindrome.");
    }
  }
}