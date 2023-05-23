import java.util.*;

public class FindLarge{

  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = kb.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = kb.nextInt();
    if (num1 == num2){
      System.out.println(num1 + " and " + num2 + " are equal.");
    }else if (num1 > num2){
      System.out.println(num1 + " is larger than " + num2 + ".");
    }else{
      System.out.println(num2 + " is larger than " + num1 + ".");
    }
  }
}
