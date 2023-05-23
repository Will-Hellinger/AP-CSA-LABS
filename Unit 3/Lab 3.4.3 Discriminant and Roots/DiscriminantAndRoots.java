import java.util.Scanner;
public class DiscriminantAndRoots
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the coefficients for a quadratic equation: ");
        String[] abc = kb.nextLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);

        if (((b * b) - (4 * a * c)) > 0){
          System.out.println(a + "x^2 + " + b + "x + " + c + " has 2 real roots.");
        }
        if (((b * b) - (4 * a * c)) < 0){
          System.out.println(a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots.");
        }
        if (((b * b) - (4 * a * c)) == 0){
          System.out.println(a + "x^2 + " + b + "x + " + c + " has 1 real root.");
        }

    }
}
