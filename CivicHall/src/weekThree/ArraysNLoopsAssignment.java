package weekThree;
import java.util.Scanner;

public class ArraysNLoopsAssignment {
	
	public static void main(String [] args){
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt user input, declare and assign variables;
		System.out.print("Enter an integer number: ");
		int x = input.nextInt();
		int newNumber = x;
		
		
		while (newNumber!=1) {
			
			if (newNumber%2 == 1) {
				 newNumber = (newNumber+1)/2;
				 
			}
			
			else if (newNumber%2 == 0) {
				 newNumber = newNumber/2;
				 
			}
			
			System.out.println("New Number: "+newNumber);
			
			
		}
		
		//Close Scanner
		input.close();	
		
	}

}

class Prob2{
	
	public static void main(String [] args) {
		
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		
		
		//
		System.out.println("Input words seperated by commas: ");
		String words = input.nextLine();
		
		//int length = words.length();
		//System.out.println(length);
		
		// Split words using a comma as the delimiter
		String[] parts = words.split(",");

		// Print the the string and its parts
		System.out.println(words);
		for(String part : parts) {
		 System.out.println(part);
		}
		
		
		
		
		/*int count = 0;
		String[] arr = new String[length];
		
		for (int i=0; i<length; i++) {
			arr[i] = words[i];
			if (arr.charAt(i) == ",") {
				count++;
			}
			
		}
		*/
		//System.out.println(count);
				
		//Close Scanner
		input.close();
				
		
	}
}

class Prob3{
	
	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("What is your message?");
		String str = input.nextLine();
		
		// Get the length of string
		int len = str.length();
		System.out.println(len);
		// Loop through all characters and print their indexes
		for (int i = 0; i < len; i++) {
		 System.out.println(i+ ":\'"+str.charAt(i)+ "\'");
		}
		
		//Close Scanner
		input.close();
			
	}
		
}

class Prob4{
	
	public static void main(String [] args) {

		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare and assign random pin
		int random = (int) (Math.random()*10000 +1000);
		
		//Output Actual Pin
		System.out.println(random);
		
		
		//Prompt User for input
		System.out.print("Welcome! Enter the 4 digit pin: ");
		int pin = input.nextInt();
		
		//Check conditions
		while (random != pin) {
			System.out.print("INCORRECT PIN. PLEASE TRY AGAIN:");
			pin = input.nextInt();
			continue;	
		}
		
		if (random == pin) {
			System.out.println("PIN ACCEPTED. YOU HAVE $0.00 IN YOUR ACCOUNT. GOODBYE.");
		}
		
		/*else {
			System.out.println("INCORRECT PIN. PLEASE TRY AGAIN");
			
		}*/
		//Close Scanner
		input.close();
				
	}
	
}

class Prob5{
	
	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variable
		String star = "*";
		String space = " ";
		
		//Ask for user input
		System.out.println("How many rows of stars?");
		int rows = input.nextInt();
		
		
		for (int i=0; i<rows ; i++) {
			
			for (int k=rows; k>i;k--) {
				System.out.print(space);
			}
			
			for (int j=0; j<=i; j++) {
				System.out.print(star);
				System.out.print(space);
			}
			
			System.out.println();
			
		}
		
		//Close Scanner
		input.close();
		
	}
	
	
}
