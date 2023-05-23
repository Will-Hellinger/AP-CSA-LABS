# 2.2.1 PointsAndRectangles
<i>You may refer to the constructor summaries for the Point, Dimension and Rectangle classes that are shown after the problem description.</i>

Write a program that will allow the user to enter the coordinates of the top left corner of a rectangle and its length and width. The program should then declare a Point object using the coordinates for the top left corner using those values entered by the user. Next, instantiate a Dimension object using the length and width entered by the user. Use the Point and Dimension objects to instantiate a Rectangle object representing the rectangle and its location. Finally, print the Point object, Dimension object and the Rectangle object. A sample run is shown below.
```
Enter the x coordinate: 1
Enter the y coordinate: 5
Enter the width: 5
Enter the height: 6
java.awt.Point[x=1,y=5]
java.awt.Dimension[width=5,height=6]
java.awt.Rectange[x=1,y=5,width=5,height=6]
```

## <b>Constructor Summary</b>
---
### <b>Constructor Description</b>

<b><u>Point()</u></b> Constructs and initializes a point at the origin (0, 0) of the coordinate space.

<b><u>Point​</b></u>(int x, int y)Constructs and initializes a point at the specified (x,y) location in the coordinate space.

<b><u>Point​(Point </b></u>p) Constructs and initializes a point with the same location as the specified Point object.

<b><u>Dimension()</b></u>  Creates an instance of Dimension with a width of zero and a height of zero.

<b><u>Dimension​(int width, int height)</b></u> Constructs a Dimension and initializes it to the specified width and specified height.

<b><u>Dimension​(Dimension d)</b></u> Creates an instance of Dimension whose width and height are the same as for the specified dimension.

<b><u>Rectangle()</b></u> Constructs a new Rectangle whose upper-left corner is at (0, 0) in the coordinate space, and whose width and height are both zero.

<b><u>Rectangle​(int width, int height)</b></u> Constructs a new Rectangle whose upper-left corner is at (0, 0) in the coordinate space, and whose width and height are specified by the arguments of the same name.

<b><u>Rectangle​(int x, int y, int width, int height)</b></u> Constructs a new Rectangle whose upper-left corner is specified as (x,y) and whose width and height are specified by the arguments of the same name.

<b><u>Rectangle​(Dimension d)</b></u> Constructs a new Rectangle whose top left corner is (0, 0) and whose width and height are specified by the Dimension argument.

<b><u>Rectangle​(Point p)</b></u> Constructs a new Rectangle whose upper-left corner is the specified Point, and whose width and height are both zero.

<b><u>Rectangle​(Point p, Dimension d)</b></u> Constructs a new Rectangle whose upper-left corner is specified by the Point argument, and whose width and height are specified by the Dimension argument.

<b><u>Rectangle​(Rectangle r)</b></u> Constructs a new Rectangle, initialized to match the values of the specified Rectangle.