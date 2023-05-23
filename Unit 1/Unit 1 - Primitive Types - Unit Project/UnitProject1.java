/*
  Creator: Will Hellinger
  Period: 1
  School: Lake Travis Highschool
*/

import java.util.Scanner;
public class UnitProject1{
  public static void main(String [] args){
    String[] names = {"Fahrenheit to Kelvin", "Liters to Gallons", "Ounces to Gallons",
        "Feet to Miles", "Acres to Square Miles", "Kilometers to Miles", "Inches to Miles",
        "Hertz to Kilohertz", "Seconds to Weeks", "Gallons to Cubic Feet"};

    //All conversion formulas were pulled from the inbuilt google converter
    String[] formulas = {"Kelvin = (Fahrenheit - 32)*(5 / 9) + 273.15", 
        "Gallons = Liters * 0.264172", "Gallons = Ounces * 0.125", "Miles = Feet / 5280", 
        "Square Mile = Acre / 640", "Miles = Kilometers / 1.609", "Miles = Inches / 63360",
        "Kilohertz = Hertz / 1000", "Weeks = Seconds / 604800", "Cubic Feet = Gallons / 7.48"};

    Scanner kb = new Scanner(System.in);
    System.out.println("Conversions by Will Hellinger");
    for (int i = 0; i < 10; i++) {
      System.out.println(names[i] + ":");
      System.out.println(formulas[i]);
      System.out.print("Enter " + names[i].split(" to ", 2)[0] + ": ");

      double tempNumber = kb.nextDouble();
      System.out.println(formulas[i].replace(names[i].split(" to ", 2)[0], String.valueOf(tempNumber)));

      double[] equations = {((tempNumber - 32)*(5 / 9d) + 273.15), (tempNumber * 0.264172), (tempNumber * 0.125),
          (tempNumber / 5280), (tempNumber / 640), (tempNumber / 1.609), (tempNumber / 63360), (tempNumber / 1000),
          (tempNumber / 604800), (tempNumber / 7.48)};

      System.out.println(tempNumber + " " + names[i].split(" to ", 2)[0] + " = " + (double)(((int)((equations[i] * 100) + ((equations[i] * 100) % 1)))/100d) + " " + names[i].split(" to ", 2)[1] + "\n");
    }
  }
}