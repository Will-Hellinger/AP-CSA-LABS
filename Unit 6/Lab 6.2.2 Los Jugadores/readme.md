# 6.2.2 Los Jugadores
Write a program to instantiate an integer array containing jersey numbers of your favorite "jugadores", or players (for any sport, any team) with 5 values. Write four loops, your choice of for, while, or do while, and output the following, with single spaces between each value, and a new line for each loop:

* all the jersey numbers in forwards order
* all the jersey numbers in reverse order
* all the jersey numbers in forwards order except the first element of the array
* all the jersey numbers in reverse order except for the last element of the array

For example, if the jersey numbers were 34, 11, 15, 17 and 29, the four outputs would be:
```
34 11 15 17 29
29 17 15 11 34
11 15 17 29
17 15 11 34
```

You are required to use the `length` field in controlling each loop.

For the first output, use the values provided in the sample output.

- - -
For the second output, create a keyboard input loop to change the five values in the array to new numbers, and then perform the same four outputs as before. Use the values shown in the sample output below.
- - -

For the third output, read five numbers from a data file called "numbers.dat", change the array elements to those values, and repeat the same output as before. When ready to test, change the name of the data file in the source code to "test.dat".
- - -
A sample run might be:
```
First output:
34 11 15 17 29 
29 17 15 11 34 
11 15 17 29 
17 15 11 34 

Enter a player number: 12
Enter a player number: 44
Enter a player number: 31
Enter a player number: 74
Enter a player number: 36
Second output:
12 44 31 74 36 
36 74 31 44 12 
44 31 74 36 
74 31 44 12 

Third output:
14 25 62 48 71 
71 48 62 25 14 
25 62 48 71 
48 62 25 14 
```

## <b>Remember to change the name of the data file to "test.dat", and then Compile again before you click the Check It button!</b>