public class DivisibleBy3And5
{
	public static void main(String[] args)
	{
    for (int i = 0; i < 30; i++) {
      if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)){
        System.out.println((i + 1) + " is divisible by both.");
      }else{
        if ((i + 1) % 3 == 0){
          System.out.println((i + 1) + " is divisible by 3.");
        }
        if ((i + 1) % 5 == 0){
          System.out.println((i + 1) + " is divisible by 5.");
        }
      }
    }
	}
}