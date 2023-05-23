import java.util.Scanner;
public class GradePoint{
	public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String[] letterGrades = {"A", "B", "C", "D", "F"};
    double[] numberGrades = {4.0, 3.0, 2.0, 1.0, 0.0};
    double grade = 0;
    System.out.println("Enter seven letter grades (A,B,C,D or F)");
    for (int a = 0; a < 7; a++) {
      String input = kb.nextLine();
      for (int b = 0; b < letterGrades.length; b++) {
        if (input.equals(letterGrades[b]))
          grade += numberGrades[b];
      }
    }
    System.out.println("GPA = " + Math.round((grade/7) * 100)/100d);
  }
}