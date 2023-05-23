# 5.8.B.1 NumberCruncher
### <b>For the partially implemented class NumberCruncher shown below, based on the Method Decomposition scenario Chanel presented in the E-Lesson 5.8 Part B, where you are asked to enter several positive whole numbers, count them, find the average and print the results, write the code for the unimplemented methods. Run the program and test with at least 3 positive whole numbers.</b>
```
    import java.util.*;

    public class NumberCruncher 
    {
      static int count = 0;
      static double total = 0.0, average = 0.0;
            
        //This Scanner object is visible and usable by all class methods
      static Scanner kb = new Scanner(System.in);

      public static void main(String[] args) {
        int num = inputNumber();
        while(num>0)
        {
          processNumber(num);
          num = inputNumber();
        }
        printResults();
      }

      public static int inputNumber() 
      {

      }

      public static void processNumber(int num)
      {

      }

      public static void printResults()
      {

      }
    }
```
### <b>Here is a possible sample run:</b>
```
Enter a positive number or 0 to quit: 5
Enter a positive number or 0 to quit: 8
Enter a positive number or 0 to quit: 2
Enter a positive number or 0 to quit: 0
Count = 3
Average = 5.0
```