# 5.1.2.1 MyClass Part A
Using as a reference the Bell class case study viewed in the video as a part of this lesson, as well as the Dog class demonstrated in the E-Lesson, define a class based on an <b>object of your own interest and choosing</b>. It cannot be a Bell or a Dog. It needs to have two facts to be represented as instance fields.

Your class should have two instance fields, two constructors (one default, the other a two-parameter constructor), and then you must redefine the toString method in a similar way to the one for the Bell class.

Include the main method inside your class containing client code to instantiate two objects, one a default, and one with two parameters, one for each instance field, and then output each object.

Again, refer to the Bell or Dog class definitions to help design your class. Here is the basic structure of your class.

```
 /*
 This is the main driver class which matches the name of the source file. 
 Do not change this header.
 */
 public class Driver
 {
  public static void main(String[] args) {

    //instantiate your own default object and output it

    //Change this to match your own class definition
    Bell me1 = new Bell();
    System.out.println(me1);

    //instantiate a two-parameter object and output it
  }
}

//Define your own class here, or in a new file, in the same way as the Bell or Dog class.
//If you keep it here, it cannot start with public.
//If you create your own file, it must begin with public.
class Bell
{
  //two instance fields

  //default constructor

  //two-parameter constructor

  //toString method
 }
```