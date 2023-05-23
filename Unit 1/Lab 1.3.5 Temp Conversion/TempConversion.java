import java.util.Scanner;
public class TempConversion
{
  static void clear_console() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  public static void main(String[] args)
  {
    clear_console();
    double fahrenheit, celsius;

    Scanner tempObj = new Scanner(System.in);
    System.out.print("Enter fahrenheit: ");
    fahrenheit = Double.parseDouble(tempObj.nextLine());

    clear_console();
  
    celsius = (fahrenheit - 32) * (5d / 9d);
    System.out.println(fahrenheit + " degrees Fahrenheit = " + celsius + " degrees Celsius");
  }
}