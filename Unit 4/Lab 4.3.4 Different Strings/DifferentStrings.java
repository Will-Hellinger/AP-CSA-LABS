import java.util.Scanner;
public class DifferentStrings{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
		System.out.print("First word: ");
		String first_word = kb.next();
    System.out.print("Second word: ");
		String second_word = kb.next();

    if (first_word.compareTo(second_word) == 0){
      System.out.println(first_word + " and " + second_word + " are the same.");
    } else{
      int differ = Integer.MAX_VALUE;

      if (first_word.length() < second_word.length()){
        for(var i = 0; i < first_word.length(); i++){
          if (String.valueOf(first_word.substring(i, i + 1)).compareTo(String.valueOf(second_word.substring(i, i + 1))) != 0){
            differ = i + 1;
            break;
          }
        }
        if (differ == Integer.MAX_VALUE){
          differ = first_word.length() + 1;
        }
      } else{
        for(var i = 0; i < second_word.length(); i++){
          if (String.valueOf(second_word.substring(i, i + 1)).compareTo(String.valueOf(first_word.substring(i, i + 1))) != 0){
            differ = i + 1;
            break;
          }
        }
        if (differ == Integer.MAX_VALUE){
          differ = second_word.length() + 1;
        }
      }
      System.out.println(first_word + " and " + second_word + " are not the same. They differ at letter number " + differ + ".");
    }
  }
}