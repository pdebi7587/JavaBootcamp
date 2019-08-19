package weekThree;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input:
		System.out.print("Enter an integer to find its factorial:");
		int x = Math.abs(input.nextInt());
		
		int factorial=1;
		
		
		for(int i=1 ;i<=x; i++) {
			factorial*=i;
		}
		
		System.out.println("Factorial of "+ Math.abs(x)+" is "+ factorial);
		
		
		
		
		
		//CLose Scanner
		input.close();
		
		
		
		
		
		
		
	}
	
	
	

}
