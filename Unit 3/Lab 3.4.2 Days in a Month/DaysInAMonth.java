import java.util.Scanner;
public class DaysInAMonth
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] month_days_length = {"31 days", "28 days or 29 days in a leap year", "31 days", "30 days", "31 days", "30 days", "31 days", "31 days", "30 days", "31 days", "30 days", "31 days"};
        System.out.print("Enter the month number (1 - " + months.length + "): ");
        int month_choice = kb.nextInt();
        if (month_choice < months.length + 1){
          System.out.println(months[month_choice-1] + " has " + month_days_length[month_choice-1] + ".");
        } else{
          System.out.println(month_choice + " is invalid input.");
        }
    }
}
