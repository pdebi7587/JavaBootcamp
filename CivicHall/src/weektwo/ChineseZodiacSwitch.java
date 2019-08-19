package weektwo;

import java.util.Scanner;

public class ChineseZodiacSwitch {
	
	public static void main (String [] args)
	{
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int year;
		String animal = "invalid";
		
		//Prompt user input and assign value
		System.out.println("Enter your year of birth: ");
		year = input.nextInt();
		
		//Switch Cases
		switch (year%12) {
		case 0: animal = "monkey";
			break;
		case 1: animal = "rooster";
		break;
		case 2: animal = "dog";
		break;
		case 3: animal = "pig";
		break;
		case 4: animal = "rat";
		break;
		case 5: animal = "ox";
		break;
		case 6: animal = "tiger";
		break;
		case 7: animal = "rabbit";
		break;
		case 8: animal = "dragon";
		break;
		case 9: animal = "snake";
		break;
		case 10: animal = "horse";
		break;
		case 11: animal = "sheep";
		break;
		default: System.out.println("Invalid year");
		
		}
		
		//Output Statement
		System.out.println("Your Chinese zodiac sign for the year " + year + " is " + animal + ".");
		
		//Close Scanner
		input.close();
		
		
		
		
	}

}
