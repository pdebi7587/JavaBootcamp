package weektwo;

import java.util.Scanner;

public class Practice2 {
	
	public static void main (String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number: ");
		int num = input.nextInt();
		
		
		
		System.out.println( (num%2 == 0) ? num + " is even" : num + " is odd" );
		
		input.close();
		
		
	}

}
