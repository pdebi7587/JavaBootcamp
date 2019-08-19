package weektwo;

import java.util.Scanner;

public class ComputingTaxes {

	public static void main(String [] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		
		//Declare variables
		
		double taxableIncome, incomeTax = 0;
		int status = 0;
		
		
		//Prompt User for Input
		
		
		
		System.out.println("What is your taxable income?");
		taxableIncome = input.nextDouble();
		while ( (status <=0) || (status >=5)) {
		
		
		System.out.println("Enter a number based on your filing status:");
		System.out.println("1.Single");
		System.out.println("2.Married Filing Jointly or Qualifying Widow(er)");
		System.out.println("3.Married Filing Separately");
		System.out.println("4.Head of Household");
		
		status = input.nextInt();
		}
		
		//Method Logic
		
	
			if ((status>=1) && (status<=4)) {
				if (status == 1) {
					
					if ((taxableIncome>=0) && (taxableIncome <= 8350)) {
						incomeTax = taxableIncome * .10;
					}
					
					else if ((taxableIncome>=8351) && (taxableIncome <= 33950)) {
						incomeTax = taxableIncome * .15;
					}
					
					else if ((taxableIncome>=33951) && (taxableIncome <= 82250)) {
						incomeTax = taxableIncome * .25;
					}
					
					else if ((taxableIncome>=82251) && (taxableIncome <= 171550)) {
						incomeTax = taxableIncome * .28;
					}
					
					else if ((taxableIncome>=171551) && (taxableIncome <= 372950)) {
						incomeTax = taxableIncome * .33;
					}
					
					else if (taxableIncome>=372951) {
						incomeTax = taxableIncome * .35;
					}	
					
				}
				
				else if (status == 2) {
					
					if ((taxableIncome>0) && (taxableIncome <= 16700)) {
						incomeTax = taxableIncome * .10;
					}
					
					else if ((taxableIncome>=16701) && (taxableIncome <= 67900)) {
						incomeTax = taxableIncome * .15;
					}
					
					else if ((taxableIncome>=67901) && (taxableIncome <= 137050)) {
						incomeTax = taxableIncome * .25;
					}
					
					else if ((taxableIncome>=137051) && (taxableIncome <= 208850)) {
						incomeTax = taxableIncome * .28;
					}
					
					else if ((taxableIncome>=208851) && (taxableIncome <= 372950)) {
						incomeTax = taxableIncome * .33;
					}
					
					else if (taxableIncome>=372951) {
						incomeTax = taxableIncome * .35;
					}
					
					
				}
				
				else if (status == 3) {
					
					if ((taxableIncome>0) && (taxableIncome <= 8350)) {
						incomeTax = taxableIncome * .10;
					}
					
					else if ((taxableIncome>=8351) && (taxableIncome <= 33950)) {
						incomeTax = taxableIncome * .15;
					}
					
					else if ((taxableIncome>=33951) && (taxableIncome <= 68525)) {
						incomeTax = taxableIncome * .25;
					}
					
					else if ((taxableIncome>=68526) && (taxableIncome <= 104425)) {
						incomeTax = taxableIncome * .28;
					}
					
					else if ((taxableIncome>=104426) && (taxableIncome <= 186475)) {
						incomeTax = taxableIncome * .33;
					}
					
					else if (taxableIncome>=186476) {
						incomeTax = taxableIncome * .35;
					}
				}
				
				else if (status == 4) {
					
					if ((taxableIncome>0) && (taxableIncome <= 11950)) {
						incomeTax = taxableIncome * .10;
					}
					
					else if ((taxableIncome>=11951) && (taxableIncome <= 45500)) {
						incomeTax = taxableIncome * .15;
					}
					
					else if ((taxableIncome>=45501) && (taxableIncome <= 117450)) {
						incomeTax = taxableIncome * .25;
					}
					
					else if ((taxableIncome>=117451) && (taxableIncome <= 190200)) {
						incomeTax = taxableIncome * .28;
					}
					
					else if ((taxableIncome>=190201) && (taxableIncome <= 372950)) {
						incomeTax = taxableIncome * .33;
					}
					
					else if (taxableIncome>=372951) {
						incomeTax = taxableIncome * .35;
					}
					
				}
				
				
				}
			
				
		
		
		//Display Output
		System.out.println("Income tax: " + incomeTax);

			
		
		
		
		//Close Scanner
		input.close();	
		
	}
}
