# 5.4.7 TheBookClassSecondExpansion
Further expanding the Book class from the previous lab, add sufficient code to produce the output shown below.

This includes:
* changing all data fields to private
* adding a default (no parameter) constructor, which sets all fields to default values,
* adding "setter", modifier, or mutator methods, enabling changes to private instance fields.

Adjust the main method in the Driver class accordingly to produce the output shown.
```
    public static void main(string[] args)
    {
        Book one = new Book("Little Women","Louisa May Alcott",1868);
        System.out.println(one);
        Book two = new Book();
        two.setAuthor("L.M. Montgomery");
        two.setTitle("Anne of Green Gabies");
        two.setYearPub(1908);
        System.out.println(two);
    }
}
```
```
Little Women, Louisa May Alcott, published in 1868
Anne of Green Gabies, L.M. Montgomery, published in 1908
```