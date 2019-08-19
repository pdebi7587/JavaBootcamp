package SBA_1Practice;

import java.util.Scanner;

public class PrintNumber {
	
	public static void main(String[] args) {
		
		for (int i=0;i<10;i++) {
			System.out.println(i+1);
			
		}
			
	}
}

	
	class NaturalSum{
		
		public static void main(String[] args){
			
			int sum=0;
			
			for(int i=0; i<=10;i++) {
				sum+=i;
			}
			
			System.out.println(sum);
				
		}
	}
		
	class MultiplicationTable{
		
		public static void main(String [] args) {
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt user input;
		System.out.println("Enter number for multiplication table: ");
		int x = input.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.println(x + "*" + i + "=" + x*i);
		}
		
		//Close Scanner Class
		input.close();
				
	}
		
	}
	
	class Factorial{
	
		public static void main(String[] args) {
			
			//Create Scanner
			Scanner input = new Scanner(System.in);
			
			//Declare variables
			int factorial = 1;
			
			//Prompt user for number:
			System.out.println("Enter number for factorial value:");
			int x = input.nextInt();
			
			
			
			
			for (int i=1;i<=x;i++) {
				factorial*=i;
				
			}
			
			System.out.println("Factorial of "+ x + " is " + factorial);
			
			//Close Scanner
			input.close();
				
		
	}
	}
	
	class Pattern{
		
		public static void main(String [] args) {
			
			//Create Scanner class
			Scanner input = new Scanner(System.in);
			
			//Prompt user input
			System.out.println("Enter number for number of rows:");
			int r = input.nextInt();
			
			//Declare variable
			char x = '*';
			String s = "";
			
			for (int z=0; z<r; z++) {
				
				for (int k =0;k<=r;k++) {
					System.out.print(s);
				}
				
				
				
				for (int y=z; y>=0;y--) {
					System.out.print(y+1+s);
				}
				
				
				
				for (int y=0; y<=z;y++) {
					System.out.print(y+1+s);
				}
				System.out.println();
			
			}
			
			
			//Close Scanner
			input.close();
			
			
			
			
		}
		
		
		
	}
