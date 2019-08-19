package weekFive;

import java.util.Scanner;
import java.util.Stack;

public class OpenCloseBrackets {
	
	//Create Stack
	static	Stack<Character> stack = new Stack<Character>();
	 
	
	public static void isBalanced(String s) {
		
		for (int i=0; i<s.length();i++) {
			
			if ((s.charAt(i) == '{') || (s.charAt(i) == '[')|| (s.charAt(i) == '(')) {
				stack.push(s.charAt(i));
				
				
			}
			
			else if ((s.charAt(i) == '}') || (s.charAt(i) == ']')|| (s.charAt(i) == ')')) {
				stack.pop();
			}
					
			System.out.println(stack);
			
			
		}
		
		
	}
	
	
	
	

	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter input: ");
		String message = input.nextLine();
		
		isBalanced(message);
		
		
		
		//Close
		input.close();

	}
	
	
	
}
