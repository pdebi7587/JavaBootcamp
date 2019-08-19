package weektwo;

import java.util.Scanner;

public class DivisibleProblem {
	public static void main (String [] args){
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int num1;
		
		//Prompt for user input and assign values
		System.out.println("Enter a positive integer: ");
		num1 = input.nextInt();
		
		//Check for Divisibility
		if ((num1%2 == 0) && (num1%3 == 0)) {
			System.out.println(num1 + " is divisible by 2 and 3");
		}
		
		if ((num1%2 == 0) || (num1%3 == 3)) {
			System.out.println(num1 + " is divisible by 2 or 3");
		}
		
		
		if ((num1%2 == 0) ^ (num1%3 == 0)) {
			System.out.println(num1 + " is divisible by 2 or 3 but not both");
		}
		//Close Scanner Class
		input.close();
			
	}

}


class LeapYear {
	public static void main (String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int year;
		
		//Prompt for user input and assign value
		System.out.println("Enter year to check if it is a leap year: ");
		year = input.nextInt();
		
		//Conditions for a leap year
		if (((year%4 == 0) && (year%100!= 0)) || (year%400 ==0)) {
			System.out.println(year + " is a leap year!");
		}
		
		else {
			System.out.println(year + " is not a leap year!");
		}
		
		
		//Close Scanner Class
		input.close();
	
		
	
}
}
