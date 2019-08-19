package weekThree;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		
		//Prompt user input
		System.out.println("Enter a number: ");
		int x = input.nextInt();
		
		String y = Integer.toString(x);
		
		boolean same = false;
		
		for (int i=0;i<y.length()-1;i++) {
			
			if (y.length()%2==1) {
			if ((i!=y.length()/2)&&(y.charAt(i)==y.charAt(y.length()-1-i)) ) {
				same = true;
				//System.out.println(y.charAt(i) + "  "+ y.charAt(y.length()-1-i));
			}
			
			else {
				same = false;
				break;
				}
			}
			
			if (y.length()%2 ==0) {
				if (y.charAt(i)==y.charAt(y.length()-1-i)) {
					same = true;
					//System.out.println(y.charAt(i) + "  "+ y.charAt(y.length()-1-i));
				}
				
				else {
					same = false;
					break;
					
				}
			}
			
			
		}
		
		
		for(int j=0; j<y.length();j++) {
		System.out.println(y.charAt(j) + "  "+ y.charAt(y.length()-1-j));
		}
		
		if (same==true) {
			System.out.println(x+ " is a palindrome");
		}
		
		else {
			System.out.println(x+" is not a palindrome");
		}
		
		//Close scanner
		input.close();
		
		
		
		
		
	}
	
}
