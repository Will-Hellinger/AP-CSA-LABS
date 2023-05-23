import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
    System.out.print("Enter three sides of a triangle: ");
		String temp = kb.nextLine();
    int a = Integer.valueOf(temp.split(" ")[0]);
    int b = Integer.valueOf(temp.split(" ")[1]);
    int c = Integer.valueOf(temp.split(" ")[2]);
    if (((a * a) + (b * b)) == (c * c)){
      System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " form a right triangle.");
    } else if (a + b <= c || a + c <= b || b + c <= a){
      System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " do not form a triangle.");
    } else{
      System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " form a triangle but not a right triangle.");
    }
	}
}
