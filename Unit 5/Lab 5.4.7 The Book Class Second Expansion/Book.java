public class Book{
    String author;
    String title;
    int yearPub;
  
    public Book(){
      author = "na";
      title = "na";
      yearPub = 0;
    }
  
    public Book(String t, String a, int y){
      author = a;
      title = t;
      yearPub = y;
    }
  
    public void setAuthor(String a){
      author = a;
    }
  
    public void setTitle(String t){
      title = t;
    }
  
    public void setYearPub(int y){
      yearPub = y;
    }
  
    public String getAuthor(){
      return author;
    }
  
    public String getTitle(){
      return title;
    }
  
    public String getYearPub(){
      return Integer.toString(yearPub);
    }
  
    public String toString(){
      return title + ", by " + author + ", published in " + yearPub;
    } 
  }
  
  
  