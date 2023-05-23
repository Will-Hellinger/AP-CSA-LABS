//WeTeach_AP�CSA - Lesson 6.4 - LeftShift

import java.util.Scanner;
public class LeftShift{
	public static void main(String [] args)	{
		Scanner kb = new Scanner(System.in);
		int [] nums = {1,0,1,1,0,1,0,1};
		printArray(nums);
		System.out.print("Enter shift value ==>");
		int shift = kb.nextInt();
		nums = leftShift(nums,shift);
		printArray(nums);
	}

	public static int [] leftShift(int [] list, int shft)	{
    int[] numbers = new int[list.length + shft];
    for (int i = 0; i < list.length; i++){
      numbers[i] = list[i];
    }
    return numbers;
	}

	public static void printArray(int [] nums)
	{
		for(int z:nums)
			System.out.print(z + " ");
		System.out.println();
	}
}


