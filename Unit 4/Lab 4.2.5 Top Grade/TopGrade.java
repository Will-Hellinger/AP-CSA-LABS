import java.util.Scanner;
public class TopGrade 
{
	public static void main(String[] args) 
	{
	Scanner kb = new Scanner(System.in);
    String top_student = "temp";
	int top_grade = 0;

    System.out.print("How many students? ");
    int student_count = kb.nextInt();
    for (int i = 0; i < student_count; i++ ){
      System.out.print("Name? ");
      String temp_name = kb.next();
      System.out.print("Grade? ");
      int temp_grade = kb.nextInt();
      if (temp_grade >= top_grade){
        top_grade = temp_grade;
        top_student = temp_name;
      }
    }

    System.out.println(top_student + " " + top_grade);
	}
}