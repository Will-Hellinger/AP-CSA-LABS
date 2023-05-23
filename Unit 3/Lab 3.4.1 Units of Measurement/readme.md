# 3.4.1 UnitsOfMeasurement
Write a program that will allow the user to convert from English measurements to metric measurements. The user will enter a value from 1 to 4:

1. to convert from inches to centimeters,
2. to convert from feet to meters,
3. to convert from miles to kilometers, and
4. to convert from pounds to kilograms.

The conversion chart is listed below:
```
1 inch = 2.54 centimeters
1 foot = 0.3048 meters
1 mile = 1.60934 kilometers
1 pound = 0.453592 kilograms
```

Your program should print a menu explaining the user’s choices and then allow for input. If the input is invalid, print an appropriate message.

Your output should be in the following form:

`3.0 miles = 4.82802 kilometers`

Here are several sample runs of the program. <b>Your output must match this format exactly.</b>
```
Converting from English Units to Metric Units
Input one of the following to convert from English to Metric.
[1] to convert from inches to centimeters
[2] to convert from feet to meters
[3] to convert from miles to kilometers
[4] to convert from pounds to kilograms
Enter your choice: 1

Enter the number of inches: 3
3.0 inches = 7.62 centimeters.

Converting from English Units to Metric Units
Input one of the following to convert from English to Metric.
[1] to convert from inches to centimeters
[2] to convert from feet to meters
[3] to convert from miles to kilometers
[4] to convert from pounds to kilograms
Enter your choice: 3

Enter the number of miles: 3
3.0 miles = 4.82802 kilometers.

Converting from English Units to Metric Units
Input one of the following to convert from English to Metric.
[1] to convert from inches to centimeters
[2] to convert from feet to meters
[3] to convert from miles to kilometers
[4] to convert from pounds to kilograms
Enter your choice: 2

Enter the number of feet: 50
50.0 feet = 15.24 meters.
```