public class Truck
{
	private String truckID;
  private double odometer;
  private double mpg;
  private double fuel;
  private final double capacity = 20.0;
  private static double totalFuel;
	
  public Truck(){
    truckID = "na";
    odometer = 0.0;
    mpg = 0.0;
    fuel = 0.0;
  }

  public String getID(){
    return truckID;
  }

  public double getOdometer(){
    return odometer;
  }

  public double getMPG(){
    return mpg;
  }

  public double getFuel(){
    return fuel;
  }

  public void setID(String id){
    truckID = id;
  }

  public void setOdometer(double o){
    odometer = o;
  }

  public void setMPG(double m){
    mpg = m;
  }

  public void setFuel(double f){
    fuel = f;
  }

  public Truck(String id, double o, double m, double f){
    truckID = id;
    odometer = o;
    mpg = m;
    fuel = f;
  }

  public String fill(){
    double f = (capacity - fuel);
    totalFuel += f;
    fuel += f;
    return "Truck " + truckID + " fuel tank filled to capacity with " + f + " gallons.\n";
  }

  public String fill(double f){
    System.out.println("Attempt to fill Truck " + truckID + " with " + f + " gallons.");
    if ((f + fuel) <= capacity){
      totalFuel += f;
      fuel += f;
      return f + " gallons added to Truck " + truckID + ".\n";
    }else{
      return "Attempting to add " + f + " gallons to Truck " + truckID + " exceeds tank capacity.\n";
    }
  }

  public static String getTotalFuel(){
    return "Total fuel pumped so far: " + totalFuel + " gallons.";
  }

  public boolean enoughFuel(double distance){
    if (fuel * mpg >= distance){
      return true;
    }else{
      return false;
    }
  }

  public String drive(double distance){
    System.out.println("Attempt to drive Truck " + truckID + " " + distance + " miles.");
    if (enoughFuel(distance)){
      odometer += distance;
      fuel -= (distance / mpg);
      return "Truck " + truckID + " successfully travels " + distance + " miles.\n";
    } else{
      return "Truck " + truckID + " lacks enough fuel to drive " + distance + " miles.\nTruck " + truckID + " trip canceled due to lack of fuel.\n";
    }
  }

  public String toString()//DO NOT CHANGE
  {
    String s = String.format("Truck: %s\nOdometer: %.1f\nMiles Per Gallon: %.1f\nFuel: %.1f\n",
    truckID,odometer,mpg,fuel);
    return s;
  }
}
