/*
  Creator: Will Hellinger
  Period: 1
  School: Lake Travis Highschool
*/

import java.util.Scanner;
public class Driver
{
	private static Scanner kb = new Scanner(System.in);
	private static DotRacer racer1, racer2, racer3;
	
	public static void main(String[] args) 
	{
		System.out.println("Let's see who is the fastest DotRacer!\n");
		racer1 = makeRacer();
		racer2 = makeRacer();
		racer3 = makeRacer();

		System.out.println("\nHow many moves in today's race?");
		int moves = kb.nextInt();
		race(moves);
		printRaceResults();
	}
	
	public static DotRacer makeRacer(){
		System.out.print("Racer name? ");
		String name = kb.next();

		return new DotRacer(name, 0);
	}
	
	public static void race(int moves){
		for(var i = 0; i <= moves; i++){
			racer1.move();
			racer2.move();
			racer3.move();
		}
		
	}
	
	public static void printRaceResults(){
		String winner;
		System.out.println(racer1);
		System.out.println(racer2);
		System.out.println(racer3);
		if (racer1.getPosition() >= racer2.getPosition()){
			if (racer1.getPosition() >= racer3.getPosition()){
				winner = racer1.getName();
			}else{
				winner = racer3.getName();
			}
		}else{
			if (racer2.getPosition() >= racer3.getPosition()){
				winner = racer2.getName();
			}else{
				winner = racer3.getName();
			}
		}

		System.out.println("The winner is " + winner + "!");
	}
}
