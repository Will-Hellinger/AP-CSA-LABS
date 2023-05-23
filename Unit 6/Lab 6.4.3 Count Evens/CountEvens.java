public class CountEvens
{
	public static void main(String [] args){
		int [] list = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
	    printArray(list);
	    System.out.println("Number of even elements: " + numEvens(list));
	}

	public static int numEvens (int [] nums){
    int evenCount = 0;
    for(int i = 0; i < nums.length; i++){
      if (nums[i] % 2 == 0){
        evenCount += 1;
      }
    }
    return evenCount;
	}

	public static void printArray(int [] nums){
		for(int z:nums)
			System.out.print(z + " ");
		System.out.println();
	}
}