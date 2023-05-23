import java.util.Scanner;
public class Driver{
  public static void main(String [] args){
    Scanner kb = new Scanner(System.in);
    Book one = new Book("Little Women","Louisa May Alcott",1868);
      
    Book two = new Book();
    two.setAuthor("L.M. Montgomery");
    two.setTitle("Anne of Green Gables");
    Int year = new Int(one.getYearPub());
    year.setVal(year.getVal()+40);
    two.setYearPub(year.getVal());
      
    Book three = new Book();
    System.out.print("Enter a book title: ");
    three.setTitle(kb.nextLine());
    System.out.print("Enter the author: ");
    three.setAuthor(kb.nextLine());
    System.out.print("Enter the publication year: ");
    three.setYearPub(kb.nextInt());

    System.out.println(one);
    System.out.println(two);
    System.out.println(three);
  }   
}
