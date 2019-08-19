package weektwo;

import java.util.Scanner;

public class GuessingNumbers {
	
	public static void main (String [] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		
		//Declare variables
		int a = (int) (Math.random()*101);
		
		
		
		
		//Prompt for user input 
		
		System.out.println("Enter an integer between 0 and 100 inclusive: ");
		int b = input.nextInt();

		while (b != a) {
		
			if (b > a) {
				System.out.println("Number is too high. Pick a lower number: ");
			}
			
			if (b < a) {
				System.out.println("Number is too low. Pick a higher number: ");
			}
			
			b = input.nextInt();
		}
		
		if (b == a) {
			System.out.println(b + " is the correct number");
		}
		
		
		//Close Scanner
		input.close();
			
	}
}
