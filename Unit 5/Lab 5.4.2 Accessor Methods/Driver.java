public class Driver
{
   public static void main(String [] args)
   {
      Thing three = new Thing();
   	  System.out.println(three);
      Thing cat = new Thing(5);
      System.out.println(cat);

   }
}

class Thing{
  String output;
  public Thing(){
    output = "CAT";
  }
  Thing(int i){
    output = Integer.toString(i);
  }
  public String toString(){
    return output;
  }
}