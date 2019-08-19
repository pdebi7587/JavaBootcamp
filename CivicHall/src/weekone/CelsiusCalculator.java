package weekone;

import java.util.Scanner;

public class CelsiusCalculator {

	public static void main (String [] args) {
		
		// Declaring the variables:
		double fahrenheit;
		double celsius;
		
		double one;
	
		
		//Assign variable:
		System.out.println("How many degrees in Fahrenheit?");
		Scanner input = new Scanner (System.in);
		fahrenheit = input.nextDouble();
		final double x=5.0/9;
		final double y=32;
		
		//Calculating the temperature:
		
		one =(fahrenheit-y);
		celsius = x*one;
		
		//Display output
		System.out.println(fahrenheit +" degrees Fahrenheit is " + celsius + " Celsius.");
		System.out.printf("%4.2f  degrees Fahrenheit is  %4.2f  Celsius.", fahrenheit, celsius);
		//Close Scanner
		input.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
