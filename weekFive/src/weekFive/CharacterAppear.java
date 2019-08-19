package weekFive;

import java.util.Map;
import java.util.Scanner;


import java.util.TreeMap;


public class CharacterAppear {
	
	static TreeMap<Character, Integer> hmap = new TreeMap<Character,Integer>();
	
	public static void main(String [] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user input:
		System.out.println("Enter input: ");
		
		String message = input.nextLine();
		
		
		
	
	
			
			
		countCharacter(message, hmap);
		
		
		System.out.println(hmap);
		
		//Close Scanner
		input.close();
		
		
	}
	

	
	
	public static void countCharacter(String s, Map <Character,Integer> map) {
		
		
		
		for (int i=0; i<s.length();i++) {
			
				if (map.containsKey(s.charAt(i))) {	
					map.put(s.charAt(i),map.get(s.charAt(i))+1);	
				}
				
				else {
					map.put(s.charAt(i), 1);	
				}
			}
				
				
		}
		
	
	
	
	

}
