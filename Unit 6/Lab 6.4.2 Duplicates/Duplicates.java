public class Duplicates{
	public static void main(String [] args)	{
		int [] nums = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
		printArray(nums);
		System.out.println(hasDupes(nums));
	}

	/*precondition: parameter list contains a 
	   non-empty array of double values
	  postcondition: return true if all elements in 
	   the array are negative, false otherwise
	*/

	public static boolean hasDupes(int [] list)	{
    for (int a = 0; a < list.length; a++){
      for (int b = 0; b < list.length; b++){
        if (b != a && list[a] == list[b]){
          return true;
        }
      }
    }
    return false;
	}



	//outputs contents of a double array
	public static void printArray(int [] nums)
	{
    String output = "";
    for (int i = 0; i < nums.length; i++){
      output += nums[i] + " ";
    }
    System.out.println(output);
	}
}


