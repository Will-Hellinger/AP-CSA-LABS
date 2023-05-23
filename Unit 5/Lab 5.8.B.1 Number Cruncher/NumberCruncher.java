import java.util.*;

public class NumberCruncher{
	static int count = 0;
	static double total = 0.0, average = 0.0;
	
	//This Scanner object is visible and usable by all class methods
  static Scanner kb = new Scanner(System.in);

	public static void main(String[] args){
		int num = inputNumber();
		while(num>0){
			processNumber(num);
			num = inputNumber();
		}
		printResults();
	}

	public static int inputNumber() {
		System.out.print("Enter a positive number or 0 to quit: ");
    return kb.nextInt();
	}	

	public static void processNumber(int num){
    count ++;
    total += num;
	}	

	public static void printResults(){
    average = total / count;
		System.out.print("Count = " + count + "\nAverage = " + average);
	}
}