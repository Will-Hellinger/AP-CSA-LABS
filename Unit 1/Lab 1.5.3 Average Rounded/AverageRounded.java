import java.util.Scanner;
public class AverageRounded
{
  public static void main(String[] args)
  {
    double number = 0;
    int roundedNum;
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.print("Number " + (i+1) + "? ");
      number += kb.nextDouble();
    }
    number = number/3d;
    if (number < 0){
      if ((number % 1) < -.5){
        roundedNum = (int)(number - (1 + (number % 1)));
      }
      else{
        roundedNum = (int)(number - (number % 1));
      }
    }
    else{
      if ((number % 1) > .5){
        roundedNum = (int)(number + (1 - (number % 1)));
      }
      else{
        roundedNum = (int)(number - (number % 1));
      }
    }
    System.out.println("Average = " + roundedNum);
  }
}