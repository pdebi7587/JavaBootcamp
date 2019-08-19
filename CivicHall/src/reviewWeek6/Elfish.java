package reviewWeek6;

import java.util.HashSet;
import java.util.Scanner;

public class Elfish {
	
	public final static HashSet<Character> hs = new HashSet<Character>();
	
	public static void main (String [] args) {
		
		//Create Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt User input
		System.out.println("Enter a word to see if it is Elfish (contains letters e-l-f):");
		
		String word = in.next();
		
		System.out.println(elfish("elf", word));
		
		System.out.println("Enter word to see if it contains letters in test word:");
		
		String test = in.next();
		
		int res = exish(test, word);
		
		if (res == test.length()) {
			System.out.println("elfish");
		}
		else {
			System.out.println("NOT elfish");
		}
		
		
		//Close Scanner
		in.close();
			
		
	}
	
	
	
	public static Boolean elfish(String elf, String message ) {
		
		Boolean found = false;
		
		for (int i=0; i<elf.length();i++) {
		hs.add(elf.charAt(i));
		}
		
		for (int i=0; i<message.length(); i++) {
		if (hs.contains(message.charAt(i)) ) {	
			found = true;	
		}
		
		}
		
		return found;
			
	}
	
	public static int exish(String elf, String mess) {
		
		int count=0;
		
		
		if (elf.length() == 0) {
			return 0;
		}
		
		else if(mess.contains(elf.substring(0,1))) {
			count++;
			return count + exish(elf.substring(1),mess);
		}
		
		return count;
			
	}

}
