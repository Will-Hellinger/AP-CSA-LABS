# 5.7.1 Truck and TruckTest - Phase #1
For this program the <b>main method should be within the TruckTest class</b>, which serves as the Driver class for this lab. The <b>toString</b> method for the <b>Truck</b> class has been pre-defined and should not be changed.

## <b>Phase 1: Define a Truck class with the following specifications:</b>
* Include the following private instance variables:
  * <b>truckID</b> – a String that represents an identification number for each vehicle object.
  * <b>odometer</b> – a double that represents the mileage on the odometer at any point in time.
  * <b>mpg</b> – a double that stores the miles per gallon that this particular vehicle gets.
  * <b>fuel</b> – a double that shows the amount of fuel in the tank at any given time.
* Define two constructors:
  * One with a single parameter that initializes the <b>truckID</b>, and sets all other instance fields to zero.
  * Another to initialize each of the four instance variables.
* A <b>toString</b> method has been provided to display the information in the format provided in the sample runs.
* In the <b>TruckTest</b> class construct two <b>Truck</b> objects:
  * Instantiate a <b>Truck</b> object named <b>t1</b> with just the id 123ABC.
  * Instantiate a second <b>Truck</b> object named <b>t2</b> with the following data:
  * id: 456DEF
  * odometer: 45500
  * mpg: 18
  * fuel: 10

### <b>Compile, Run and Check what you have so far, which for Phase #1 should be:</b>
```
********** Phase #1 **********
Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 0.0
Fuel: 0.0

Truck: 456DEF
Odometer: 45500.0
Miles Per Gallon: 18.0
Fuel: 10.0
```
## <b>Your program’s output must match EXACTLY the expected output’s values and format including the labels and spacing.</b>
- - -
# 5.7.1 Truck and TruckTest - Phase #2
## <b>Phase 2: Add to the Truck class definition the following elements:</b>
* Declare a private constant double field <b>CAPACITY</b> representing the capacity of the fuel tank and set the value to 20.0.
* Declare a private static double variable <b>totalFuel</b>, used to keep track of the amount of fuel pumped into all the trucks.
* Define accessor methods for all four instance variables.
* Define a mutator method for the <b>mpg</b> field.
* Define a method <b>enoughFuel</b> receiving a double parameter <b>miles</b> and returns <b>true</b> if there is enough fuel in the tank of this truck to travel the number of miles, <b>false</b> otherwise.
* Define a <b>drive</b> method receiving a double parameter <b>miles</b> and attempts to “drive” the truck that many miles. This method MUST use the <b>enoughFuel</b> method described above, and only proceed if there is enough fuel, otherwise report an error message indicating not enough fuel in the tank to drive the designated number of miles. If enough fuel, this method must reduce the fuel in the tank the appropriate amount based on the miles per gallon field, add the miles driven to the odometer, and report a successful trip.
* Include two <b>fill</b> methods, both adding the appropriate number of gallons to the static variable <b>totalFuel</b>.
  * The first should be a no argument method filling the truck’s tank to capacity.
  * The second will add a designated number of gallons to the tank. This second fill method should print an error message if the designated number of gallons will make the total number of gallons in the tank greater than the tank’s capacity.

### <b>For Phase #2, in the TruckTest class:</b>
* Set t1’s mpg to 15.0.
* Completely fill t1’s fuel tank.
* Drive t1 150 miles
* Print t1.
* Drive t1 60 more miles.
* Print t1 again.

### <b>Compile, Run and Check what you have so far, which for Phase #2 should be:</b>
```
********** Phase #1 **********
Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 0.0
Fuel: 0.0

Truck: 456DEF
Odometer: 45500.0
Miles Per Gallon: 18.0
Fuel: 10.0

********** Phase #2 **********
Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 0.0
Fuel: 0.0

Truck 123ABC fuel tank filled to capacity with 20.0 gallons.

Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 15.0
Fuel: 20.0

Attempt to drive Truck 123ABC 150.0 miles.
Truck 123ABC successfully travels 150.0 miles.

Truck: 123ABC
Odometer: 150.0
Miles Per Gallon: 15.0
Fuel: 10.0

Attempt to drive Truck 123ABC 60.0 miles.
Truck 123ABC successfully travels 60.0 miles.

Truck: 123ABC
Odometer: 210.0
Miles Per Gallon: 15.0
Fuel: 6.0
```

## <b>Your program’s output must match EXACTLY the expected output’s values and format including the labels and spacing.</b>
- - -
# 5.7.1 Truck and TruckTest - Phase #3
<b>For Phase #3, in the Truck class:</b>
* Add a static method named getTotalFuel that will return the value stored in totalFuel.

<b>In the TruckTest class:</b>
* Attempt to drive t2 500 miles.
* Attempt to add 30 gallons to t2’s tank.
* Attempt to add 8 gallons to t2’s fuel.
* Drive t2 300 miles.
* Print t2.
* Print the total amount of fuel pumped for both t1 and t2.

### <b>Compile, Run and Check what you have so far, which for Phase #3 should be:</b>
```
********** Phase #1 **********
Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 0.0
Fuel: 0.0

Truck: 456DEF
Odometer: 45500.0
Miles Per Gallon: 18.0
Fuel: 10.0

********** Phase #2 **********
Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 0.0
Fuel: 0.0

Truck 123ABC fuel tank filled to capacity with 20.0 gallons.

Truck: 123ABC
Odometer: 0.0
Miles Per Gallon: 15.0
Fuel: 20.0

Attempt to drive Truck 123ABC 150.0 miles.
Truck 123ABC successfully travels 150.0 miles.

Truck: 123ABC
Odometer: 150.0
Miles Per Gallon: 15.0
Fuel: 10.0

Attempt to drive Truck 123ABC 60.0 miles.
Truck 123ABC successfully travels 60.0 miles.

Truck: 123ABC
Odometer: 210.0
Miles Per Gallon: 15.0
Fuel: 6.0

********** Phase #3 **********
Truck: 456DEF
Odometer: 45500.0
Miles Per Gallon: 18.0
Fuel: 10.0

Attempt to drive Truck 456DEF 500.0 miles.
Truck 456DEF lacks enough fuel to drive 500.0 miles.
Truck 456DEF trip canceled due to lack of fuel.

Attempt to fill Truck 456DEF with 30.0 gallons.
Attempting to add 30.0 gallons to Truck 456DEF exceeds tank capacity.

Attempt to fill Truck 456DEF with 8.0 gallons.
8.0 gallons added to Truck 456DEF.

Attempt to drive Truck 456DEF 300.0 miles.
Truck 456DEF successfully travels 300.0 miles.

Truck: 456DEF
Odometer: 45800.0
Miles Per Gallon: 18.0
Fuel: 1.3

Total fuel pumped so far: 28.0 gallons.
```
## <b>Your program’s output must match EXACTLY the expected output’s values and format including the labels and spacing.</b>