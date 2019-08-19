package weekone;

import java.util.Scanner;

public class Assignment2 {

	//Solution to First Problem
	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		
		//Declare variables
		double inches, meters;
		final double convert = .0254;
		
		//Prompt for input and assign values
		System.out.print("Input a value for inch: ");
		inches = input.nextDouble();
		
		//Calculate 
		meters = inches * convert;
		
		
		//Display Output
		System.out.println(inches + " inch is " + meters + " meters");
		
		//Close Scanner
		input.close();
		
		
	}
}

	class Prob2{
		
		//Solution to Problem 2
		public static void main(String [] args) {
	
			//Create Scanner class
			Scanner input = new Scanner(System.in);
			
			
			//Declare variables
			double num_1, num_2, product;
			
			
			//Prompt for input and assign values
			System.out.println("Input first number: ");
			num_1 = input.nextDouble();
			
			System.out.println("Input second number: ");
			num_2 = input.nextDouble();
			
			//Calculate
			product = num_1 * num_2;
			
			
			//Display Output
			System.out.println(num_1 + " * " + num_2 + " = " + product);
			
			//Close Scanner
			input.close();
			
		}
	
	}
	
	class Prob3{
		
		//Solution to Problem 3
		public static void main(String [] args) {
		
			//Create Scanner class
			Scanner input = new Scanner(System.in);
			
			
			//Declare Variable
			int x, product;
			
			//Prompt user input and assign value
			System.out.println("Input a number: ");
			x = input.nextInt();
			
			//Calculate and Display
			for (int i=1; i<=10; i++) {
				
				product = x*i;
				System.out.println(x + " x " + i + " = " + product);	
			}
			
			//Close Scanner
			input.close();
			
		}
		
		
	}