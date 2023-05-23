public class MultiplicationTable {
	public static void main(String[] args){
    System.out.println("***************************");
    for (var a = 0; a < 9; a++){
      for (var b = 0; b < 9; b++){
        if (((b + 1) * (a + 1)) >= 10){
          System.out.print(" " + ((b + 1) * (a + 1)));
        } else{
          System.out.print("  " + ((b + 1) * (a + 1)));
        }
      }
      System.out.println();
    }
  }
}