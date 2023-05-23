public class FourLoops{
	public static void main(String [] args){
    int [] numList = {10, 2, 2, 3, 4};
    String [] stringList = {"two", "three", "four", "five", "six"};
    double [] doubleList = {2.2, 4.4, 9.9, 10.10, 11.11};

    for(int i = 0;i < numList.length;i++)
      System.out.print(numList[i] + " ");
    System.out.println();
    for(int o:numList)
			System.out.print(o+" ");
    System.out.println();
    
    int i = 0;
    while (i < stringList.length){
      System.out.print(stringList[i] + " ");
      i++;
    }
    System.out.println();
    for(String o:stringList)
			System.out.print(o+" ");
    System.out.println();
    
    i = 0;
    do {
      System.out.print(doubleList[i] + " ");
      i++;
    } while (i < doubleList.length);
    System.out.println();
    for(double o:doubleList)
			System.out.print(o+" ");
    System.out.println();
  }
}