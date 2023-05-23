# Birthday Program
Given the month, day, and year of a person’s birth as an integer, determine the day of the week on which a date occurred. The following are the steps required to find the day of week corresponding to any date from 1700 to 2099.

1. Divide the last two digits of the birth year by 4. Put the quotient (ignoring the remainder) in total. For example, if the person was born in 1983, divide 83 by 4 and store 20 in the total.

2. Add the last two digits of the birth year to total.

3. Divide total by 7 and put the remainder back into total.

4. For dates in the
   * 1700’s, add 4 to total.

   * 1800’s, add 2 to total.

   * 1900’s, add 0 to the total.

   * 2000’s, add 6 to total.

5. Add the day integer to total.

Using the following table, add to the total the value based on the input month.

### <b>Month Add Values</b>

```
For:
- January or October, add 1 to the total
- May, add 2
- August, add 3
- February, March or November, add 4
- June, add 5
- September or December, add 6
- April or July, add nothing
```

* If the year is a leap year and the month is January or February, subtract 1 from total. A non-century year is a leap year if it is divisible by 4. If the year is a century (1800, 1900, etc.), it is a leap year only if it is <b>also divisible by 400</b>.

* Find the remainder when total is is divided by 7. Look up the remainder in the following table to determine the day of week the person was born.
```
1 -- Sunday      5 -- Thursday
2 -- Monday      6 -- Friday
3 -- Tuesday     0 -- Saturday
4 -- Wednesday
```

### <b>Sample output:</b>

```
Enter the birth year: 2022
Enter the month number of your birth [1 - 12]: 8
Enter the day of month [1 - 31]: 9
Your birthday, 8/9/2022, was on a Tuesday.

Enter the birth year: 2016  
Enter the month number of your birth [1 - 12]: 3
Enter the day of month [1 - 31]: 25
Your birthday, 3/25/2016, was on a Friday.

Enter the birth year: 1956
Enter the month number of your birth [1 - 12]: 10
Enter the day of month [1 - 31]: 8
Your birthday, 10/8/1956, was on a Monday.
```

### <b>Show all your work!</b>