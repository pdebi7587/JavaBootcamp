package weekone;

import java.util.Scanner;

public class TaxCalculator {

	public static void main (String [] args) {
	
		//Declaring variables
		double amount;
		double tax;
		
		//Assign Variables
		
		System.out.println("Input an amount to calculate sales tax:");
		Scanner input = new Scanner(System.in);
		amount = input.nextDouble();
		final double x=.08875;
		
		//Calculate NY Sales tax
		tax = (float) amount*x;
		
		//Display Output
		System.out.printf("Sales tax of $%.2f is $%.2f.", amount, tax);
		
		//Close Scanner
		input.close();
		
		
		
		
	}
}
