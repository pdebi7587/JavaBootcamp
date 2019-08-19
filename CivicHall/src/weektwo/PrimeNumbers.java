package weektwo;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to find out if it is prime: ");
		int y = input.nextInt();
		int c=0;
		
		for (int b=1; b<=y; b++) {
			if (y%b == 0) {
				c++;
			}
		}
		
		if (c==2) {
			System.out.println(y + " is prime");
		}
		
		else {
			System.out.println(y + " is not prime");
		}
		
		
		int prime=0;
		
		for (int x=1;x<=20;x++) {
			
			for (int i=1; prime<20; i++) {
			
				int count = 0;
			
				for (int j=1; j<=i; j++) {
				
				if (i%j == 0) {
					count++;	
					//System.out.println(i+ " "+ j+" "+ count++);
				}
					
			}
			
			if (count==2) {
				System.out.println(x++ + ". "+ i + " is prime");
				prime++;
			}
		
		}
		
		
		}
		
		
		input.close();
	}
		
}




