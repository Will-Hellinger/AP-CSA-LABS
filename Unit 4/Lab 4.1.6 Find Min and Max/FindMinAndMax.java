import java.util.Scanner;
public class FindMinAndMax {
	public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int smallestValue = Integer.MAX_VALUE;
    int largestValue = Integer.MIN_VALUE;
    
    for (int i = 0; i < 5; i++) {
      System.out.print("Number: ");
      int temp_number = kb.nextInt();
      if (temp_number >= largestValue){
        largestValue = temp_number;
      }
      if (temp_number <= smallestValue){
        smallestValue = temp_number;
      }
    }
    System.out.println("Max value is: " + largestValue + "\nMin value is: " + smallestValue);
  }
}