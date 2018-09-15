/*
 * Prologue
 * how to run program
 * 1. compile file: javac Flight.java
 * 2. run program: java Flight 1 n 2 e 2 n 3 w
 */

//Imports
import java.util.Scanner;

public class Flight {
	
	//Instance variables 
	
	//Main method where code will run; Generic code memorize!
	public static void main(String[] args) {
		
		//Set the variables
		final double earthRadius = 3963.1676;
		double destinationLongitude = 0.0;
		double destinationLatitude = 0.0;
		double homeLongitude = 0.0;
		double homeLatitude = 0.0;
		char destinationNorthSouth;
		char destinationEastWest;
		String userChoice = "";
		char homeNorthSouth;
		char homeEastWest;
		
		//This is called instantiation, basically just making the class
		//into an object so you can use its methods
		Flight fly = new Flight();
		
		fly.example();
		
		//get the parameters that the user ran this file with
		//but first make sure there are enough parameters
		if(args.length != 8) {
			System.out.println("Sorry either too few or too many parameters entered");
			
			System.exit(1);
		}
		
		//get the params
		homeLatitude = Double.parseDouble(args[0]);
		homeNorthSouth = args[0].charAt(0);
		//....you can do the rest

		//print the parameters gathered
		//fly.printCoordinates();

		//calculate the distance between coordinates
		fly.calcDistance();
		
		//in order to get inputs from the console you need:
		// Creating an object of Scanner class
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter something fool");
		userChoice = userInput.next();
		userInput.close();
		System.out.println(userChoice);

		//Do if statment here checking for user answer/choise

		//print out the link here if user answers yes
		fly.printLink();

		//open map and draw picture
		fly.draw();

	}
	
	//////////////////////METHODS//////////////////////////
	
	/*
	 * This is the proper way to comment methods
	 * Try to make your application as modular as possible
	 * modular - make different methods that take care of different stuff
	 * This method will print out a message
	 * @return for any return variables
	 * @param for any parameters
	 */
	public void example() {
		
		System.out.println("I am great");
	}

	/*
	 * This is the proper way to comment methods
	 * Try to make your application as modular as possible
	 * modular - make different methods that take care of different stuff
	 * This method will print out a message
	 * @return for any return variables
	 * @param for any parameters
	 */
	public void draw() {
		
		System.out.println("Drawing someting here ");
	}

	/*
	 * This is the proper way to comment methods
	 * Try to make your application as modular as possible
	 * modular - make different methods that take care of different stuff
	 * This method will print out a message
	 * @return for any return variables
	 * @param for any parameters
	 */
	public void printLink() {
		
		System.out.println("Link is here");
	}

	/*
	 * This is the proper way to comment methods
	 * Try to make your application as modular as possible
	 * modular - make different methods that take care of different stuff
	 * This method will print out a message
	 * @return for any return variables
	 * @param for any parameters
	 */
	public void calcDistance() {
		
		System.out.println("do a calculation here");
	}

	/*
	 * This is the proper way to comment methods
	 * Try to make your application as modular as possible
	 * modular - make different methods that take care of different stuff
	 * This method will print out a message
	 * @return for any return variables
	 * @param for any parameters
	 */
	public void printCoordinates(double hLang, double hLong, char hN, char hE, double dLang, double dLong, char dN, char dE) {
		
		System.out.println("Home latitude is" + hLang);
		System.out.println("Home Longitude is" + hLong);
	}

	//////////////////////ENDofFILE//////////////////////////
}