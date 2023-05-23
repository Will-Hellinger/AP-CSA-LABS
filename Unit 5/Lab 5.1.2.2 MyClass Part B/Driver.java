//Lab 05.1.2.2 - Part B - MyClass

/*
  This is the main driver class which matches the name of the file. 
  Do not change this header.
*/
public class Driver
{
 public static void main(String[] args) {

   //instantiate your own default object and output it

   //Change this to match your own class definition
   Game me1 = new Game();
   System.out.println(me1);
   
   Game me2 = new Game("Hollow Knight", "Feb. 24, 2017");
   System.out.println(me2);
   //instantiate a two-parameter object and output it
 }
}

/*
Copy your completed class definition from Lab 05.1.2.1 here 
and designate each element as private or public as appropriate.
As you did in the first lab, you may create a new file and place
your class definition there.

DO NOT designate your class as public. Only the Driver class is public in this file.
*/

//changed class because older class wasnt to the specifications of the assignment. (I didnt really understand what was going on.)
class Game{
private String game;
private String releaseDate;

public Game(){
game = "NA";
releaseDate = "NA";
}

public Game(String g, String r){
game = g;
releaseDate = r;
}

public String toString(){
return "your favorite game is " + game + " which was released on " + releaseDate + ".";
}

}
