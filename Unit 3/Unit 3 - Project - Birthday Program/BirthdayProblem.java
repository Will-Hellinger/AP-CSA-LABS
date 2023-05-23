/*
  Creator: Will Hellinger
  Period: 1
  School: Lake Travis Highschool
*/

import java.util.Scanner;
public class BirthdayProblem{
  public static void main(String [] args){
    Scanner kb = new Scanner(System.in);
    String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] birth_questions = {"Enter the birth year: ", "Enter the month number of your birth [1 - 12]: ", "Enter the day of month [1 - 31]: "};
    int[] year_check = {1700, 1800, 1900, 2000};
    int[] month_add = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
    int[] birth_info = {0, 0, 0}; // year, month, day
    int birthday = 0;
    for (int a = 0; a < birth_info.length; a++) {
      System.out.print(birth_questions[a]);
      birth_info[a] = kb.nextInt();
    }

    birthday += ((birth_info[0] % 100)/4); //1
    birthday += (birth_info[0] % 100); //2
    birthday = (birthday % 7); //3
    switch (birth_info[0] - birth_info[0]%100)
    {
      case 1700:
        birthday += 4;
        break;
      case 1800:
        birthday += 2;
        break;
      case 1900:
        birthday += 0;
        break;
      case 2000:
        birthday += 6;
        break;
      default:
        System.out.println("INVALID BIRTH YEAR ENTERED");
        break;
    }
    birthday += birth_info[2]; //5
    birthday += month_add[(birth_info[1] - 1)];
    boolean leap_year = false;
    for (int a = 0; a < year_check.length; a++) {
      if (birth_info[0] == year_check[a]){
        leap_year = true;
      }
    }
    if ((birth_info[0] % 4 == 0 && !leap_year) || ((birth_info[0] - (birth_info[0] % 100)) % 400 == 0 && leap_year)){
      if (birth_info[1] == 1 || birth_info[1] == 2){
        birthday--;
      }
    }
    birthday %= 7;

    System.out.println("Your birthday, " + birth_info[1] + "/" + birth_info[2] + "/" + birth_info[0] + ", was on a " + days[birthday] + ".");
  }
}