import java.lang.Math;
import java.util.Scanner;
public class SquareWordRoot{
  public static void main(String [] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your word: ");
    String word = kb.nextLine();
    System.out.println("The \"square root\" of " + word + " is " + word.charAt((int)(Math.sqrt(word.length()) + (Math.sqrt(word.length()) % 1))));
  }
}