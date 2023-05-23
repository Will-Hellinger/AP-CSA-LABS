import java.util.Scanner;
public class LargestOfFour {

	public static void main(String[] args) {
		String output_text = "";
		int biggest_value = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter four integer values: ");
    String temp = kb.nextLine();
		for (int a = 0; a < temp.split(" ").length; a++) {
			if (Integer.valueOf(temp.split(" ")[a]) >= biggest_value){
				biggest_value = Integer.valueOf(temp.split(" ")[a]);
			}
		}
		for (int a = 0; a < temp.split(" ").length; a++) {
			if (a != 3){
				output_text += temp.split(" ")[a] + ", ";
			}else{
				output_text += "and " + temp.split(" ")[a];
			}
		}
		System.out.println("The largest value of " + output_text + " is " + biggest_value);
	}
}
