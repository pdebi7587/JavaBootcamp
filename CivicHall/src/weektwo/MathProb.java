package weektwo;

import java.util.Scanner;

public class MathProb {
	
	public static void main (String [] args) {
		
		//Create scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int a =  (int) (Math.random()*10);
		int b =  (int) (Math.random()*10);
		int c = a + b;
		
		//Prompt for repeated input until correct
		
		System.out.println("What is " + a + " + "+ b + "?");
		c = input.nextInt();
		
		//Alternative
		  int res = a + b;
		  boolean result = (c==res);
		  System.out.println(result);
		
		while (c != a + b) {
			System.out.println("Incorrect!");
			System.out.println("What is " + a + " + "+ b + "?");
			c = input.nextInt();
		
		}
		
		// Display Output
		if (a+b == c)
		{
			System.out.println("Correct!");
		}
		
		
		
		
	
		 
		
		
		
		//Close scanner
		input.close();
			
	}

}
