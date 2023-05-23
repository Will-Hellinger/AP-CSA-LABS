import java.lang.Math;
import java.util.Scanner;
public class QuadraticFormula{
  public static String quadformula(double a, double b, double c) {
    double positive_output = ((-1 * b) + Math.sqrt(Math.pow(b, 2)- (4 * a * c)))/(2 * a);
    double negative_output = ((-1 * b) - Math.sqrt(Math.pow(b, 2)- (4 * a * c)))/(2 * a);
    return String.valueOf(positive_output) + " " + String.valueOf(negative_output);
  }
  public static void main(String [] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the values for a, b and c: ");
    String[] tempString = kb.nextLine().split(" ", 3);
    String[] output = quadformula(Double.parseDouble(tempString[0]), Double.parseDouble(tempString[1]), Double.parseDouble(tempString[2])).split(" ", 2);
    System.out.print("x = " + output[0] + " and " + output[1]);
  }
}