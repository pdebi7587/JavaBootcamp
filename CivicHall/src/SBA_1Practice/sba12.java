package SBA_1Practice;

import java.util.Scanner;

public class sba12 {
	
	public static void main(String [] args) {
		
		//Declare and assign variables:
		int [] fib = new int[25];
		int evenSum = 0;
		fib[0] = 0;
		fib[1] = 1;
		
		
		//Create fibonacci sequence:
		for (int i=2;i<25;i++) {
			fib[i]= fib[i-1]+fib[i-2];
			//System.out.println(fib[i]);
		}
		
		
		
		//Check if fibonacci number is even and add to sum:
		for (int k=0;k<25;k++) {
			//System.out.println(k + "th term: "+ fib[k]);
			
			if (fib[k]%2==0) {
				evenSum+=fib[k];
				//System.out.println("even #:"+ fib[k]);
				//System.out.println("even sum: "+evenSum);
			}
		}
		
		//Display Output of sum of even numbers:
		System.out.println("In the Fibonacci series, the sum of all the even numbers for the first 25 numbers is "+ evenSum + ".");
			
	}
}
	
	class abec{
		
		public static void main(String [] args) {
			
			//Create Scanner class
			Scanner input = new Scanner(System.in);
			
			//Prompt User input
			System.out.println("Enter a word to check if it is abecedarian: ");
			String word = input.next();
			
			
			//Use method to check if user input is abecedarian:
			//System.out.println(word);
			checkWord(word);
			
			//Check list of abecedarian words
			// Create array of abecedarian words:
			String [] list = {"abdest", "acknow", "acorsy", "adempt", "adipsy", "agnosy", "befist", "behint", "beknow", "bijoux", "biopsy", "cestuy", "chintz", "deflux", "dehors", "dehort", "deinos", "diluvy", "dimpsy"};
			
			for (int z=0; z<list.length; z++) {
				//checkWord(list[z]);
			}
			
			
		
			//Close scanner class
			input.close();
			
		}
		
		public static void checkWord(String word) {
			
			//Declare variables
			boolean abec = true;
			
			
			//Find integer value of characters in word:
			for (int i=0; i<word.length();i++) {
				System.out.print(word.charAt(i) + " = ");
				int n = word.charAt(i);
				System.out.println(n);
			
				//Check if letters are alphabetical
				for (int j=0; j<i; j++) {
					if (n< word.charAt(j)) {
						abec = false;
					}
				}
			}
			
			
			//Display Output
			if (abec == false) {
				System.out.println(word + " is not abecedarian.");
			}
			
			if (abec == true) {
				System.out.println(word + " is abecedarian.");
			}
		}
	}


