import java.util.Scanner;
public class CountDown2 
{
	public static void main(String[] args) 
	{
    Scanner kb = new Scanner(System.in);
    int f = 0;
    int s = 0;
    while (true){
		  System.out.print("First number: ");
		  f = kb.nextInt();
		  System.out.print("Second number: ");
		  s = kb.nextInt();	
      if (f > s){
        System.out.println("The second number must be larger than the first.");
      } else{
        break;
      }
    }
    for (int i = s; i >= f; i-- ){
      System.out.print(i + " ");
    }
	}
}