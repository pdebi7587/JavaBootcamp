package weektwo;

import java.util.Scanner;

public class GCD {
	
	public static void main(String [] args) {
		
		
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int a , b;
		
		//Prompt user input and assign variable
		System.out.print("Enter a Positive Integer:");
		a = input.nextInt();
		
		
		System.out.print("Enter another Positive Integer:");
		b = input.nextInt();
		
		
		while ((a<=0) || (b<=0)) {
			System.out.println("Invalid!");
			
			if (a<=0) {
				System.out.print("Enter another positive Integer");	
				a = input.nextInt();
			}
			
			else if (b<=0) {
				System.out.print("Enter another positive Integer");
				b = input.nextInt();
			}
			
			
			
		}
		
		//Greatest Common Divisor
		int i=1, GCD=1;
		while((i <=a )&& (i<=b)) {
			
			if ((a%i == 0) & (b%i == 0)){
				GCD = i;
			}
			
			i++;
			
		}
		
		System.out.println("Greatest Common Divisor of "+ a + " and " + b + " is " + GCD);
		
		//Close Scanner
		input.close();
		
		
		
		
		
	}

}
