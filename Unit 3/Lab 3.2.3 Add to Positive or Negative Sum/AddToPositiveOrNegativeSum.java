import java.util.Scanner;
public class AddToPositiveOrNegativeSum
{
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      int num;
      int positive_number = 0;
      int negative_number = 0;
      for (int a = 0; a < 10; a++) {
        System.out.print("Enter a number: ");
        num = kb.nextInt();
        if (num > 0){
          positive_number += num;
        }else{
          negative_number += num;
        }
      }
      System.out.println("The sum of the positive numbers is " + positive_number + ".");
      System.out.println("The sum of the negative numbers is " + negative_number  + ".");
    }
}
