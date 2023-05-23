public class CheckForAllNegative{

	public static void main(String [] args)	{
		double [] dubs = {-2.5, -9.3, -6.7, -8.4, -9.2, 3.6, 1.2};
		printArray(dubs);
    System.out.println("All negatives: " + allNegs(dubs));
	}

	public static boolean allNegs(double[] list)	{
    boolean allNeg = true;
    for (int i = 0; i < list.length; i++){
      if (list[i] >= 0){
        allNeg = false;
      }
    }
		return allNeg;
	}

	//outputs contents of a double array
	public static void printArray(double [] nums){
		String output = "";
    for (int i = 0; i < nums.length; i++){
      output += nums[i] + " ";
    }
    System.out.println(output);
	}
}
