import java.util.Scanner;
public class CountDown3 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("First number: ");
		int f = kb.nextInt();
		System.out.print("Second number: ");
		int s = kb.nextInt();
    if (f > s){
      for (int i = f; i >= s; i-- ){
        System.out.print(i + " ");
      }
    }else{
      for (int i = s; i >= f; i-- ){
        System.out.print(i + " ");
      }
    }
	}
}