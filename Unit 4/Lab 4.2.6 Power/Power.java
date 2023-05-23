import java.util.Scanner;

public class Power{
  public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the base: ");
      int base = kb.nextInt();
      System.out.print("Enter the exponent: ");
      int exponent = kb.nextInt();

      int output = 1;
      for (int i = 0; i < exponent; i++){
        output *= base;
      }
      System.out.println(base + " ^ " + exponent + " = " + output);
  }
}