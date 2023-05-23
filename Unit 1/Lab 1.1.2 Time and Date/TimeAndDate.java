import java.util.Scanner;
public class TimeAndDate
{
  public static void main(String[] args)
  {
    Scanner timeObj = new Scanner(System.in);
    System.out.println("Enter current time (hh:mm)");
    String time = timeObj.nextLine();
    Scanner dateObj = new Scanner(System.in);
    System.out.println("Enter current date (mm/dd/yyyy)");
    String date = dateObj.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println(time);
    System.out.println(date);
  }
}