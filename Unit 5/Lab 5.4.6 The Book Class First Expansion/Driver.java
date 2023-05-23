public class Driver{
    public static void main(String [] args){
      Book one = new Book("Little Women","Louisa May Alcott",1868);
      System.out.println(one);
      System.out.println(one.getAuthor());
      System.out.println(one.getTitle());
      System.out.println(one.getYearPub());
    }   
  }