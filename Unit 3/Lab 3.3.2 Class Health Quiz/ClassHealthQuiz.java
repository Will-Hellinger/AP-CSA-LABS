import java.util.Scanner;
public class ClassHealthQuiz
{
  static void generate_underline(String text) {
    String outputText = "";
    String[] tempText = text.split(" ");
    for (int a = 0; a < tempText.length; a++) {
      for (int b = 0; b < tempText[a].length(); b++) {
        outputText += "=";
      }
      outputText += " ";
    }
    System.out.println(outputText);
  }
  public static void main(String[] args)
  {
    int health = 0;
    String[] questions = {"Do you complete each assigned reading for this class? ", "Do you complete your written homework for this class? ", "Do you come in for tutoring when needed for this class? ", "Do you pay attention in this class? ", "Do you complete each assigned program for this class? "};
    Scanner kb = new Scanner(System.in);
    System.out.println("Computer Science Class Health Quiz");
    generate_underline("Computer Science Class Health Quiz");
    System.out.print("Enter your name: ");
    String name = kb.nextLine();
    System.out.println("For each of the following questions, enter 1 for yes or 0 for no.");
    for (int a = 0; a < questions.length; a++) {
      System.out.print(questions[a]);
      health += kb.nextInt();
    }
    System.out.println(name + ", your score is " + health + ".");
    if (health >= 3 ){
      System.out.println("Your Computer Science Class Health is good. You should do well in this class.");
    } else{
      System.out.println("Your Computer Science Class Health is poor. Do your work and see your teacher!");
    }
  }
}
