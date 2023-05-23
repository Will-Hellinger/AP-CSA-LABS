import java.util.Scanner;

public class CookieOrdersElseIf
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("********** Cookie Order **********\nWelcome to Mrs. Baker's Cookie Shop\nThe price per box is as follows: ");
        String[] boxing_stuff = {"1 – 4", "5 – 9", "10 – 15", "16"};
        double[] box_prices = {6.95, 5.95, 5.50, 4.95};
        double price = 0;
        String[] box_prices_string = {"6.95", "5.95", "5.50", "4.95"};
        int price_spacing = 18;
        for (int a = 0; a < box_prices_string.length; a++) {
          String box_type = "";
          String spacing = "";
          if (boxing_stuff[a].indexOf("–") >= 0){
            box_type = " boxes:";
          }else{
            box_type = " or more boxes:";
          }
          for (int b = 0; b < (price_spacing - (boxing_stuff[a] + box_type).length()); b++) {
            spacing += " ";
          }
          System.out.println(boxing_stuff[a] + box_type + spacing + box_prices_string[a] + " per box");
        }
        System.out.print("Enter the number of boxes you wish to purchase: ");
        int box_count = kb.nextInt();
        if (box_count <= 0){
          System.out.println("Your input is invalid.");
        }else{
          for (int a = 0; a < boxing_stuff.length; a++) {
            if (boxing_stuff[a].indexOf("–") >= 0){
              if (Integer.parseInt(boxing_stuff[a].split(" – ")[0]) <= box_count && Integer.parseInt(boxing_stuff[a].split(" – ")[1]) >= box_count){
                price = box_prices[a];
              }
            } else{
              if (Integer.parseInt(boxing_stuff[a]) <= box_count){
                price = box_prices[a];
              }
            }
          }
          System.out.println("You bought " + box_count + " boxes of cookies at  $" + price + " per box.\nYour total bill is $" + (price * box_count) + ".");
        }
    }
}