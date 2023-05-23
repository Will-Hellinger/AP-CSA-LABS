import java.util.Scanner;
public class NumericComparisons
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1, num2;
        boolean isOdd, isEven;
        System.out.print("Enter num1 ==>");
        num1 = kb.nextInt();
        isOdd = num1 % 2 != 0;
        System.out.println(num1 + " is odd: " + isOdd);      
        System.out.print("Enter num2 ==>");
        num2 = kb.nextInt();
        System.out.println(num2 + " is even: " + (num2 % 2 == 0));
        System.out.println(num1 + " is zero: " + (num1 == 0));
        System.out.println(num1 + " is positive: " + (num1 > 0));
        System.out.println(num1 + " is negative: " + (num1 < 0));
        System.out.println(num1 + " is non negative: " + (num1 >= 0));
        System.out.println(num1 + " is non positive: " + (num1 <= 0));
        System.out.println(num1 + " is a factor of " + num2 + ": " + (num2 % num1 == 0));
        System.out.println(num1 + " is a multiple of " + num2 + ": " + (num1 % num2 == 0));

        //Input a value for num2 and assign isEven the results of testing if num2 is even
        //output the results in the same fashion shown above.

        //Create the following boolean variables: isZero, isPositive, isNegative, isNonnegative,
        //isNonpositive        

        //Use num1 and perform the appropriate comparisons assigned to the appropriate 
        //boolean variable.  Output the results in the same fashion shown above.        

        //Create two boolean variables: isFactor, isMultiple
        //Assign the variables the results of the appropriate comparisons to test if
        //num1 is a factor of num2 and if num1 is a multiple of num2
        //Output the results in the same fashion as shown above
     }
}
