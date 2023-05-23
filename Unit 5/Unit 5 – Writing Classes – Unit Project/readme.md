# Unit 5 – Writing Classes – Unit Project
<b>Project Description</b>

In this project you will create <b>DotRacer</b> objects, give them names and then let them race. <b>Due to the randomness of the moves, this project must be manually graded.</b>

You will be modifying the <b>DotRacer</b> class and will test this class in <b>Driver.java</b>, the class containing the client code which runs the race. There will always be three <b>DotRacer</b> objects in each race. Your program should prompt the user for the name of each <b>DotRacer</b> object and for the number of moves each <b>DotRacer</b> object will make during the race. After the race has been run, print the location of each and which <b>DotRacer</b> won the race, the one reaching the farthest positive position on the number line.

To give you an idea of where you are headed, here is a sample run of the completed project.
```
Let's see who is the fastest DotRacer!

Racer name? Mongo
Racer name? Thrasher
Racer name? Bruiser
How many moves in today's race?
100
Mongo is at position: 505
Thrasher is at position: 556
Bruiser is at position: 496
The winner is Thrasher!
```

<b>Modifications To The DotRacer Class</b>
1. Make the <b>stepSize</b> field a constant and assign the value of 1.
2. Declare a <b>name</b> field of type <b>String</b>.
3. Add accessor and mutator methods for the <b>name</b> field.
4. Add a constructor with a single formal parameter for** name**. This constructor should set the position to 0 (zero) and assign the formal parameter to the <b>name</b> field.
5. Correct all references to <b>stepSize</b> that are causing errors.
6. Modify the <b>move</b> method so that the <b>DotRacer</b> objects always move in a positive direction.
7. Modify the <b>toString</b> method to print each <b>DotRacer</b> object’s name and position as shown in the sample run above.

<b>The Driver Class</b>

The Driver class’s main method should print a greeting and then prompt the user for the name of each of the three racers. Instantiate three <b>DotRacer</b> objects using the names provided by the user. Next, prompt the user for the number of moves each <b>DotRacer</b> will make. Then, run the race and print the results.

In addition to the main method you must implement three more static methods. The <b>makeRacer</b> method should return an instance of <b>DotRacer</b> with a name and a starting position of 0 (zero). The <b>race</b> method should move all three racers the number times entered by the user. The <b>printRaceResults</b> method should print the position of each racer at the end of the race and print which racer is the winner. Format the output as you see in the sample run shown above.

Here is a partial implementation of the class that includes the variable declarations, completed main method and the header for each of the new static methods.
```
    import java.util.Scanner;
    public class Driver 
    {
      private static Scanner kb = new Scanner(System.in);
      private static DotRacer racer1, racer2, racer3;
      
      public static void main(String[] args) 
      {
        System.out.println("Let's see who is the fastest DotRacer!\n");
        racer1 = makeRacer();
        racer2 = makeRacer();
        racer3 = makeRacer();
        System.out.println("\nHow many moves in today's race?");
        int moves = kb.nextInt();
        race(moves);
        printRaceResults();
      }
      
      public static DotRacer makeRacer()
      {
        
      }
      
      public static void race(int moves)
      {
        
      }
      
      public static void printRaceResults()
      {
        
      }
    }
```