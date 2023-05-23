# 5.4.8 TheBookAndIntClasses
Use the predefined Int class definition provided in the `Int.java` file and adjust the `Book` class accordingly making the private instance field `yearPub` now of class `Int` instead of a primitive `int` data type.

You may use the solution for your previous lab to continue developing the Book class.

Use the main method below in the Driver class to produce the outputs below, which includes providing input for a third Book object, outputting all three Books at the end.

- - -
```
import java.util.Scanner;
public class Driver
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      Book one = new Book("Little Women","Louisa May Alcott",1868);
      
      Book two = new Book();
      two.setAuthor("L.M. Montgomery");
      two.setTitle("Anne of Green Gables");
      Int year = one.getYearPub();
      year.setVal(year.getVal()+40);
      two.setYearPub(year);
      
      //code to input data for a Book object
      //  ...prompts much match exactly provided output example
      //code to construct Book three
      
      System.out.println(one);
      System.out.println(two);
      System.out.println(three);
   }   
}
```
- - -
## <b>Sample Run and Output:</b>
```
Enter a book title: Harry Potter and the Sorcerers Stone
Enter the author: J. K. Rowling
Enter the publication year: 1997
Little Women, by Louisa May Alcott, published in 1868
Anne of Green Gables, by L.M. Montgomery, published in 1908
Harry Potter and the Sorcerers Stone, by J. K. Rowling, published in 1997
```
- - -