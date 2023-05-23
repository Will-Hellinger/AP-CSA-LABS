import java.util.Scanner;
public class CountTheVowels {
	public static void main(String[] args) {
    String vowels = "aeiou";
    int total_vowels = 0;

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = kb.next();
    
		for(var i = 0; i < s.length(); i++){
			if(vowels.indexOf(s.substring(i, i + 1)) != -1){
        System.out.print(s.substring(i, i + 1) + " ");
        total_vowels++;
			}
		}
		System.out.println();
		System.out.print("Total vowels = " + total_vowels);
	}
}