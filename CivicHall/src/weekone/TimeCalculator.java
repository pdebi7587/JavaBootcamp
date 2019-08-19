package weekone;

import java.util.Scanner;


public class TimeCalculator {
	
	public static void main (String [] args) {
		
		//Declaring the variables
		int time;
		int minutes;
		int seconds;
		
		//Assign variable
		System.out.println("How many seconds? ");
		Scanner input = new Scanner(System.in);
		time = input.nextInt();
		
		//Calculating the time
		 minutes = time/60;
		 seconds = time%60;
		
		//Display result
		System.out.println(time + " seconds is equal to " + minutes + " minutes and " + seconds + " seconds");
		
		//Closing the scanner
		input.close();
		
		
		System.out.println("This is\" Java.");
	}

}
