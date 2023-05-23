# 3.1.2 StringReferences
Write a program that creates four String variables as declared in the program shown below:
```
public class StringReferences
{
    public static void main(String[] args)
    {
        String word = "Hello";
        String word2 = new String ("Hello");
        String sentence = null;
        String str = "Hello";
        
        System.out.println(word == sentence);  //false
        //Complete the rest of the program
    }
}

```

## <b>Convert the English expressions to Java code and output the following comparisons using the == and != operators:</b>
- - -
1. Test if `word` and `sentence` contain the same address (reference the same `String` object).
2. Test if `sentence` is `null` (does not reference a `String` object).
3. Test if `word` and `word2` reference the same `String` object.
4. Test if `word` and `str` contain the same address (reference the same `String` object).
5. Test if `word` is not `null` (does reference a `String` object).