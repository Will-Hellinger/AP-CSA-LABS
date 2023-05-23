/*
  Creator: Will Hellinger
  Period: 1
  School: Lake Travis Highschool
*/

public class DotRacer{
    private int position;
    private final int stepSize = 1;
    public String name = "0";

    public DotRacer(String name){
        this.name = name;
        position = 0;
    }

    public DotRacer(String name, int position){
        this.name = name;
    	this.position = position;
    }

    public DotRacer(int position){
    	this.position = position;
    }
    
    public DotRacer(){
        position = 0;
    }
    
    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
    
    public int getStepSize(){
    	return stepSize;
    }
    
    public void move(){
        int numSteps = (int)(Math.random() * 11);
        position += numSteps * stepSize;
    }
    
    public String toString(){
    	return name + " is at position: " + position;
    }    
}
