/*
  Creator: Will Hellinger
  Period: 1
  School: Lake Travis Highschool
*/

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
		System.out.print("Enter the starting value: ");
    int starting_value = kb.nextInt();
    System.out.print("Enter the ending value: ");
    int ending_value = kb.nextInt();

    int[] nums = {0, 1, 0};
    boolean found = false;

    while (nums[0] < ending_value){
      if (nums[0] >= starting_value && nums[0] <= ending_value){
        found = true;
        System.out.print(nums[0] + " ");
      }
      nums[2] = nums[0] + nums[1];
      nums[0] = nums[1];
      nums[1] = nums[2];
    }
    if (found == false){
      System.out.println("None found.");
    }
  }
}