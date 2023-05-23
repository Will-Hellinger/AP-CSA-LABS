# 3.4.3 DiscriminantAndRoots
Write a program that will determine the number and type of roots for a quadratic equation, given the coefficients a, b, and c.

x = (-b ± √(b² - 4ac)) / (2a)

The discriminant is the portion of the quadratic formula that is under the squareroot radical: `b^2 - 4ac`. When a, b, and c are evaluated in this expression, the number of type of roots can be determined. If the discriminant is negative, there are 2 imaginary roots. If positive, there are 2 real roots. If the discriminant is 0, there is one real root, called a double root.

Allow the user to input a, b, and c and then determine the type and number of roots for the quadratic equation that a, b, and c define. Below is a sample output. Use this format for your output.

Here are several sample runs:
```
Enter the coefficients for a quadratic equation: 1 4 4
1x^2 + 4x + 4 has 1 real root.

Enter the coefficients for a quadratic equation: 1 2 3
1x^2 + 2x + 3 has 2 imaginary roots.

Enter the coefficients for a quadratic equation: 1 5 6
1x^2 + 5x + 6 has 2 real roots.

Enter the coefficients for a quadratic equation: 6 -5 -21
6x^2 + -5x + -21 has 2 real roots.
```