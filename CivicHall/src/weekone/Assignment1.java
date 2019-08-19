package weekone;

import java.util.Scanner;

public class Assignment1 {
	
	
	// Solution to the first problem
	public static void main(String [] args) {
		
		
		//Declaring variables
		String name;
		int age;
		double wage;
		
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Ask for Inputs and Assign Values
		System.out.println("Hello, What's your name?");
		name = input.nextLine();
		
		System.out.println("Hi " + name +"! How old are you?");
		age = input.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name +"?");
		wage = input.nextDouble();
		
		//Display Output
		System.out.println(wage + "! That's really good for your age!");	
		
		//Close scanner
		input.close();
	}
}




class Problem2{
	
	//Solution to the Second problem
	public static void main(String [] args) {
	
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String fname;
		String lname;
		int grade;
		int id;
		String login;
		double gpa;
		
		
		//Prompt user for input and assign values
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("First Name: ");
		fname = input.nextLine();
		
		System.out.println("Last Name: ");
		lname = input.nextLine();
		
		System.out.println("Grade (9-12): ");
		grade = input.nextInt();
		
		System.out.println("Student ID: ");
		id = input.nextInt();
		
		System.out.println("Login: ");
		login = input.next();
		
		System.out.println("GPA (0.0-4.0): ");
		gpa = input.nextDouble();
		
		
		//Display the following 
		System.out.println("Your Information:");
		System.out.println("Login: " + login);
		System.out.println("ID: " + id);
		System.out.println("Name: " + lname + ", " + fname);
		System.out.println("GPA: " + gpa);
		System.out.println("Grade: " + grade);
		
		//Close Scanner
		input.close();
		    
		
	}
}

class Problem3{
	
	//Solution to the Third Problem
	public static void main (String [] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables;
		String name;
		int age;
		
		//Ask for input and assign values:
		System.out.println("Hi there. What's your name?");
		name = input.nextLine();
		
		System.out.println("Hi, " + name + "! My name is Java. Nice to meet you.");
		System.out.println("How old are you?");
		age = input.nextInt();
		
		
		//Calculate ages 5 years before and after
		int newAge = age + 5;
		int oldAge = age - 5;
		
		//Display values
		System.out.println("Did you know that in five years you will be " + newAge + " years old?");
		System.out.println("And five years ago you were " + oldAge + "! Imagine that!");
		
		//Close scanner
		input.close();
	}
}


class Problem4{
	
	//Solution to Fourth Problem
	public static void main(String[] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		double num_1, num_2, num_3, Calc_value;
		
		//Prompt for user input:
		System.out.println("What is your first number?");
		num_1 = input.nextDouble();
		
		System.out.println("What is your second number?");
		num_2 = input.nextDouble();
		
		System.out.println("What is your third number?");
		num_3 = input.nextDouble();
	
		
		//Calculate sum/2:
		Calc_value = (num_1 + num_2 + num_3)/2.0;
		
		//Display Output
		System.out.println("(" + num_1 + " + " + num_2 + " + " + num_3 +")/2 is ...");
		System.out.println(Calc_value + "!");
		
		//Close Scanner
		input.close();
	
	}	
}

class Problem5{
	
	//Solution to Fifth Problem
	public static void main(String [] args) {
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		double height, weight, BMI;
		
		//Prompt for input and assign values:
		System.out.println("Your height in m:");
		height = input.nextDouble();
		
		System.out.println("Your weight in kg:");
		weight = input.nextDouble();
		
		//Calculate BMI
		BMI = weight/ (Math.pow(height, 2));
		
		//Display output
		System.out.printf("Your BMI is %7.5f",BMI);
		
		//Close Scanner
		input.close();
		
	}
	
}
