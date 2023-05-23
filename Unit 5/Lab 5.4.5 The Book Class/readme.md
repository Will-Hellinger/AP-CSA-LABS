# 5.4.5 TheBookClass
Write a class called Book using the program code shown below, and run it using the Driver method to achieve an output like the one shown at the bottom of the image. <b>The hash code may be different</b>, but the structure should be the same.

Class Definition:
```
public class Book
{
  String author;
  String title;
  int yearPub;
}
```

Driver Class
```
public class Driver
{
  public static void main(String [] args)
  {
    Book one = new Book();
    System.out.println(one);
  }   
}
```

Expected Output (hash code value may differ, needs to be graded manually):
```
Book@1f32e575
```