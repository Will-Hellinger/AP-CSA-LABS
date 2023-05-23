import java.util.Scanner;
public class TempConUserInput
{
  public static void main(String[] args)
  {
    double fahrenheit, celsius;

    Scanner tempObj = new Scanner(System.in);
    System.out.print("Enter the current Fahrenheit temperature: ");
    fahrenheit = Double.parseDouble(tempObj.nextLine());
  
    celsius = (fahrenheit - 32) * (5d / 9d);
    System.out.println(fahrenheit + " degrees Fahrenheit = " + celsius + " degrees Celsius");
  }
}