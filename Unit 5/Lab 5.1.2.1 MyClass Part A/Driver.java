//Lab 05.1.2.1 - MyClass

/*
  This is the main driver class which matches the name of the file. 
  Do not change this header.
*/
public class Driver{
    public static void main(String[] args) {
      Python python = new Python();
      python.print("hello world", true);

    }
  }

  //Define your own class here, in the same way as the Bell class.
  class Python{
    String output;
    public String print(String str, boolean new_line){
      if (new_line == true){
        System.out.println(str);
      }else{
        System.out.print(str);
      }
      return null;
    }
   }