# 2.67.1 Names
Write a program to input and instantiate two String objects containing the first and last name of a person of your own choosing, a celebrity, interesting person, or fictional character.

Output the two names in the following ways:
* First Last
* The sum of the lengths of the two names
* The two initials side by side
* The comparison of the two original names
* The index position in the last name of the last letter of the first name, -1 if not there
The index position in the first name of the last letter of the last name, -1 if not there
* A new first and last name made of the following:
  * New first name = first half of first + last half of last
  * New last name = first half of last + last half of first

<b>Requirement</b> - all of the original name letters must be used in the new names.

<b>Hint</b>: create two int variables called mid1 and mid2 to contain the midpoint value of each name to be used in creating the new names as described above. For example, the midpoint of “Carl” is 2 (4 / 2) and the midpoint of “Sagan” is 2 (5 / 2)

## <b>Methods used:</b>
* <b>length</b>
* <b>substring</b>
* <b>compareTo</b>
* <b>indexOf</b>
* <b>charAt</b> (not included in designated AP list of String class methods, but still useful and acceptable for String processing)

### <b>Sample Input 1</b>
```
First name: Carl 
Last name: Sagan
```

Resulting Output:
```
Enter first name ==> Carl
Enter last name ==> Sagan
Carl Sagan
9
CS
-16
-1
-1
Cagan Sarl
```
