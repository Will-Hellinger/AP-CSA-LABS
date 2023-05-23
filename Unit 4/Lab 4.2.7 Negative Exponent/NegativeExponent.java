import java.util.Scanner;

public class NegativeExponent{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the base: ");
    int base = kb.nextInt();
    System.out.print("Enter the exponent: ");
    int exponent = kb.nextInt();

    double output = 1;
    if (exponent >= 0){
      for (int i = 0; i < exponent; i++){
        output *= base;
      }
    } else{
      exponent *= -1;
      for (int i = 0; i < exponent; i++){
        output *= base;
      }
      output = 1/output;
      exponent *= -1;
    }
    
    System.out.println(base + " ^ " + exponent + " = " + output);
  }
}