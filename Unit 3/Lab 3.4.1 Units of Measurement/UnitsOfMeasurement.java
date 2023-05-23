import java.util.Scanner;
public class UnitsOfMeasurement
{
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      double[] conversions = {2.54, 0.3048, 1.60934, 0.453592};
      String[] options = {"inches to centimeters", "feet to meters", "miles to kilometers", "pounds to kilograms"};
      System.out.println("Converting from English Units to Metric Units\nInput one of the following to convert from English to Metric.");
      for (int a = 0; a < conversions.length; a++) {
        System.out.println("[" + (a + 1) + "] to convert from " + options[a]);
      }
      System.out.print("Enter your choice: ");
      int choice = kb.nextInt();
      if (choice < conversions.length + 1){
        System.out.print("Enter the number of " + options[choice-1].split(" to ", 2)[0] + ": ");
        double unit = kb.nextDouble();
        System.out.print(unit + " " + options[choice-1].split(" to ", 2)[0] + " = " + (unit * conversions[choice-1]) + " " + options[choice-1].split(" to ", 2)[1] + ".");
      }else{
        System.out.println("Invalid Input.");
      }
    }
}
