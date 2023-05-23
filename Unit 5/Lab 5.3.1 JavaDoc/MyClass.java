/** 
 * WeTeach_AP®CSA, 
 * Unit 5, 
 * Topic 5.3<p>
 *	Javadoc Lesson<p>	 
 *	This class demonstrates how to document the
 *	definition of a class in preparation for
 *	Javadoc style comments.
 *
 *  This is the starter code for this lab.
 *  
 *  DO NOT CHANGE THE NAME OF THIS CLASS. IT MUST MATCH THE NAME OF THE FILE.
 */
public class MyClass
{
  /* Note: Since accessor methods have yet to be introduced,
     it is necessary for the main method to be embedded inside
     this class so that direct access to private data is still possible.
     
     Using a separate Driver class requires accessor methods, 
     which will be covered in the next series of lessons.
  */
  public static void main(String [] args)
  {
      MyClass me = new MyClass();
      System.out.println(me);
      System.out.println(me.greetings());
      MyClass you = new MyClass("Sam",15);
      System.out.println(you.greetings(me.myName));
      System.out.println(you);
  }

  //declares private name variable which cant be referenced outside the class or object
  private String myName;

  //declares private age variable which cant be referenced outside the class or object
  private int myAge;
   
  
   
  /**
   * Generalized greeting about specfifc person.
   * @return Gives basic greeting back with general information provided earlier when settings the object..
   */
  public String greetings()
  {
      return "Hello " + myName + ", age " + myAge + "!";
  }
  /**
   * A greeting from a friend for the person of the object
   * @return a general	greeting from an outside friend
   * @param friend name of outside person sending the greeting
   */
  public String greetings(String friend)
  {
      return "Hello " + myName + ", age " + myAge 
      + "! My name is " + friend + ".";
  }
  /**
   * General information about the object
   * @return general information in the form of a String.
   */
  public String toString()
  {
      return "This is a MyClass object for " + myName + ", age " + myAge;
  }

  /**
   * Creating an object without arguments
   * @param nothing.
   */
  public MyClass()
  {
      myName = "Jane";
      myAge = 16;
  }

  /**
   * Creating an object with arguments
   * @param name of person and age.
   */
  public MyClass(String name, int age)
  {
      myName = name;
      myAge = age;
  }

  
}
