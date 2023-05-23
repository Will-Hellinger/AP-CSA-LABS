import java.util.Scanner;

public class TestThatNumber
{
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = kb.nextInt();
      if (number < 0){
        System.out.println(number + " is a negative number.");
        System.out.println(number + " is a nonpositive number.");
      }else if(number == 0){
        System.out.println(number + " is zero.");
        System.out.println(number + " is a nonnegative number.");
        System.out.println(number + " is a nonpositive number.");
      }else{
        System.out.println(number + " is a positive number.");
        System.out.println(number + " is a nonnegative number.");
      }
      if (number % 2 != 0){
        System.out.println(number + " is an odd number.");
      }else{
        System.out.println(number + " is an even number.");
      }
      if (number % 10 != 0){
        System.out.println(number + " is not divisible by 10.");
      }else{
        System.out.println(number + " is divisible by 10.");
      }
    }
}
