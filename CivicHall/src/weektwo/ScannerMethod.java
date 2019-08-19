package weektwo;

import java.util.Scanner;

public class ScannerMethod {
	
	static Scanner input = new Scanner(System.in); 
	
	public static String getUserInput(String prompt, Scanner input) {
		
		
		System.out.println(prompt);
		//String fName = input.next();
		
		return input.next();
	}

	
	
	public static void main(String [] args) {
		
		//Scanner input = new Scanner(System.in);
		
		
		//System.out.println("What is your first name?");
		//String fName = input.next();
		String fName = getUserInput("What is your first name?", input);
		
		
		//System.out.println("What is your last name?");
		//String lName = input.next();
		String lName = getUserInput("What is your last name?", input);
		
		
		//System.out.println("What is your city name?");
		//String city = input.next();
		String city = getUserInput("What is your city name?", input);
		
		
		System.out.println("Information about you:");
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(city);
		
		
		input.close();
		
		
		
	}
	
	
	
	
}
