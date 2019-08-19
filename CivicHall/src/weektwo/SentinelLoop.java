package weektwo;

import java.util.Scanner;

public class SentinelLoop {
	
	
	public static void main(String [] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int x = Integer.MAX_VALUE, sum=0;
		
		
		//Prompt user input
		while ( x!= 0 ) {
			System.out.print("Enter integer values to find its sum: ");
			x = input.nextInt(); 
			
			sum += x;
			
		}
		
		//Display output
		System.out.println("Sum = " + sum);
		
		
		//Close scanner
		input.close();
				
	}

}
