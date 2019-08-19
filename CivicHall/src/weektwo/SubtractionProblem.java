package weektwo;

import java.util.Scanner;

public class SubtractionProblem {

	public static void main (String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int c, counter = 0, correct = 0;
		
		//Prompt user input and assign values
		while (counter != 5) {
			int a = (int) (Math.random()*10);
			int b = (int) (Math.random()*10);
			
			System.out.print(a + " - " + b + " = ");
			c = input.nextInt();
			counter++;
			
			if (c == (a-b)){
				correct++;
			}	
			
		}
		
		//Display number of correct numbers
		System.out.println("Number of correct answers: " + correct);
		
		
		//Close Scanner Class
		input.close();
		
		
	}
}
