# 3.1.3 NumericComparisons
Write the following program. The instructions are in the comments of the program shell.
```
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

        isOdd = num % 2 != 0;
        System.out.println(num1 + " is odd: " + isOdd);

        //Input a value for num2 and assign isEven the result of testing if num2 is even
        //output the result in the same fashion shown above.
        

        //Create the following boolean variables: isZero, isPositive, isNegative, isNonnegative,
        //isNonpositive
        //Use num1 and perform the appropriate comparisons assigned to the appropriate
        //boolean variable. Output the results in the same fashion shown above.



        //Create two boolean variables: isFactor, isMultiple
        //Assign the variables the results of the appropriate comparisons to test if
        //num1 is a factor of num2 and if num1 is a multiple of num1
        //output the results in the same fashion as shown above
    }
}
```

Sample run:
```
Enter num1 ==>10
10 is odd: false
Enter num2 ==>5
5 is even: false
10 is zero: false
10 is positive: true
10 is negative: false
10 is non negative: true
10 is non positive: false
10 is a factor of 5: false
10 is a multiple of 5: true
```