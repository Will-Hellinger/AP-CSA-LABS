import java.util.Scanner;
public class ClassHealthQuizRevisited {

  static void generate_underline(String text) {
    String outputText = "";
    for (int a = 0; a < text.split(" ").length; a++) {
      for (int b = 0; b < text.split(" ")[a].length(); b++) {
        outputText += "=";
      }
      outputText += " ";
    }
    System.out.println(outputText);
  }

  public static void main(String[] args) {
    int health = 0;
    String[] questions = {"Do you complete each assigned reading for this class? ", "Do you complete your written homework for this class? ", "Do you come in for tutoring when needed for this class? ", "Do you pay attention in this class? ", "Do you complete each assigned program for this class? "};
    Scanner kb = new Scanner(System.in);
    System.out.println("Computer Science Class Health Quiz");
    generate_underline("Computer Science Class Health Quiz");
    System.out.print("Enter your name: ");
    String name = kb.nextLine();
    System.out.println("For each of the following questions, enter y or n.");
    for (int a = 0; a < questions.length; a++) {
      System.out.print(questions[a]);
      if (kb.nextLine().equals("y")){
        health += 1;
      }
    }
    System.out.println(name + ", your score is " + health + ".");
    if (health >= 3 ){
      System.out.println("Your Computer Science Class Health is good. You should do well in this class.");
    } else{
      System.out.println("Your Computer Science Class Health is poor. Do your work and see your teacher!");
    }
  }
}