public class StringArray{
    public static void main(String [] args){
      String [] names = {"Bob", "Jeff", "Timmy", "Steve", "Roy"};
      for (int i = 0; i <= names.length - 1; i++) {
        System.out.println(names[i]);
      }
      names[0] = "Tom";
      System.out.println();
      for (int i = 0; i <= names.length - 1; i++) {
        System.out.println(names[i]);
      }
    }
  }