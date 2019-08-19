package weekone;

import java.util.Scanner;

public class LoanCalculator {

	static public void main(String [] args) {
		
		// Declaring variables
		double IR;
		int Y;
		double L;
		double MP;
		//double TP;
		
		
		//Assign variables
		System.out.println("Enter the monthly interest rate:");
		Scanner input = new Scanner(System.in);
		IR = input.nextDouble();
		
		double monthlyIR=(IR/12)/100;
		
		System.out.println("Enter the number of years:");
		Y = input.nextInt();
		
		
		
		System.out.println("Enter the loan amount:");
		L = input.nextDouble();
		
		
		//Calculate 
		double X = Math.pow(1+ monthlyIR, 12*Y);
		
		MP = (L*monthlyIR)/(1-(1/X));
		
		
		//Display
		System.out.printf("Monthly payment is $%.2f",MP);
		
		
		//Close Scanner
		input.close();
		
		
	}
}
