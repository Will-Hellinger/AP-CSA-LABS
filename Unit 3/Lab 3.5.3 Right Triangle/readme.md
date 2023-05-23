# 3.5.3 RightTriangle
Given the side lengths of a triangle, determine if the triangle is a valid triangle. If the triangle is a valid triangle, determine if the triangle is a right triangle.

<b>Triangle facts</b>: The triangle inequality theorem states that the sum of any two sides of a triangle must be greater than the third side to be a triangle. Test this first to verify that the given sides form a triangle.

Use the Pythagorean Theorem to determine if a valid triangle is right or not.

If a^2+b^2=c^2, then the triangle is a right triangle.

Use nested if else statements in this program. Be sure to thoroughly test your program.

<b>Do not assume that the sides are entered in any particular order.</b>

Here are three sample runs of the program:
```
Enter three sides of a triangle: 12 5 13
The side lengths of 12, 5, and 13 form a right triangle.

Enter three sides of a triangle: 5 2 3
The side lengths of 5, 2, and 3 do not form a triangle.

Enter three sides of a triangle: 12 5 15
The side lengths of 12, 5, and 15 form a triangle but not a right triangle.
```