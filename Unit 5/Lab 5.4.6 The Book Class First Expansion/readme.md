# 5.4.6 TheBookClassFirstExpansion
Add code to the Book class from the previous lab to enable the output shown below. New elements include a suitable constructor, accessor methods for each field, and a toString method to produce the output shown. Adjust the main method in the Driver class accordingly.

In the Driver class construct the book shown and output accordingly.
```
    public static void main(String[] args)
    {
        Book one = new Book("Little Women","Louisa May Alcott",1868);
        System.out.println(one);
        System.out.println(one.getAuthor());
        System.out.println(one.getTitle());
        System.out.println(one.getYearPub());
    }
}
```
```
Little Women, Louisa May Alcott, published in 1868
Louisa May Alcott
Little Women
1868
```