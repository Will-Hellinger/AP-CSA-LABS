import java.util.Scanner;
public class NameAndSchool
{
  public static void main(String[] args)
  {
    //Get name
    Scanner nameObj = new Scanner(System.in);
    System.out.println("Enter your name (First Last):");
    String name = nameObj.nextLine();

    //Get school
    Scanner schoolObj = new Scanner(System.in);
    System.out.println("Enter your highschool:");
    String school = schoolObj.nextLine();

    //Print Info
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(name);
    System.out.println(school);
  }
}