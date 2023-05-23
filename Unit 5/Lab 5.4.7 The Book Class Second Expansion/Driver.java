public class Driver
{
   public static void main(String [] args)
   {
      Book one = new Book("Little Women","Louisa May Alcott",1868);
      System.out.println(one);
      Book two = new Book();
      two.setAuthor("L.M. Montgomery");
      two.setTitle("Anne of Green Gables");
      two.setYearPub(1908);
      System.out.println(two);
   }   
}