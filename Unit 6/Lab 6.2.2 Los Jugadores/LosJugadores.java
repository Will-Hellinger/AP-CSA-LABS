import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class LosJugadores
{
	public static void main(String [] args)
	 throws IOException
	{
		//-----------------------------------------
		int [] nums = {34, 11, 15, 17, 29};
		//forwards
		System.out.println("First output:");
		for(int x=0;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-1;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();

		for(int x=1;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-2;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		
		//-----------------------------------------
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i <= nums.length-1; i++){
			System.out.print("Enter a player number: ");
			nums[i] = kb.nextInt();
		}
				
		kb.close();

		//output a second time
		System.out.println("Second output:");
		for(int x=0;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-1;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();

		for(int x=1;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-2;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		//-----------------------------------------
		//input from data file five values and reassign each array element
		//CHANGE THE NAME OF THIS FILE TO "test.dat" BEFORE CLICKING the Check It Button
		Scanner f = new Scanner(new File("test.dat"));
		for (int i = 0; i <= nums.length-1; i++){
			nums[i] = f.nextInt();
		}
		
		f.close();
		
		//output a third time
		System.out.println("Third output:");
		for(int x=0;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-1;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();

		for(int x=1;x<nums.length;x++)
			System.out.print(nums[x]+" ");
		System.out.println();
		
		for(int x=nums.length-2;x>=0;x--)
			System.out.print(nums[x]+" ");
		System.out.println();
	}
}
