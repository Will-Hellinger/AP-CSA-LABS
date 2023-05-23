import java.util.Scanner;
public class FlippedTriangle{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = kb.nextInt();

		for(var a = 0; a < n; a++){
			for(var b = 0; b < (n - a); b++){
				System.out.print("*");
      }
			System.out.println();
		}
	}
}
