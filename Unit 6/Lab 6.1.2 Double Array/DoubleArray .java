//This is a partial solution. 
//Student completed solutions need to be manually graded.
public class DoubleArray 
{
	public static void main(String [] args)
	{
		double [] grades = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
		for(double d:grades) 
		  System.out.print(d+" ");
	  System.out.println();
		System.out.println(grades[0]);
    System.out.println(grades[4]);
    System.out.println(grades[8]);
		grades[0] = 95.4;
		grades[4] = 85.9;
    grades[8] = 57.3;
		for(double d:grades) 
		  System.out.print(d+" ");
		System.out.println();
		double average = grades[0] + grades[4] + grades[8];
    average = average / 3;
    System.out.println(average);
	}
}