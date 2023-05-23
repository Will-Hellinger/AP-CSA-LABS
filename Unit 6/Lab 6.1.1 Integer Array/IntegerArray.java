public class IntegerArray{
    public static void main(String [] args){
      int [] list = {5, 10, -2, 6, 3, 5, 1};
      int [] choices = {0, 6, 4, 3};
      for (int i = 0; i <= choices.length-1; i++) {
        System.out.println(list[choices[i]]);
      }
      System.out.println(list.length);
    }
  }