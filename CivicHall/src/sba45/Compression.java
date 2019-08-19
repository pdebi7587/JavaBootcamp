package sba45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class Compression {

	public static void main(String [] args) {
		
		//Create Scanner
		Scanner in = new Scanner(System.in);
		
		
		//Prompt User Input
		System.out.println("Enter a word: ");
		
		String word = in.next();
		
		System.out.println(word + " " +word.length());
		
		char[] wo = new char[word.length()];
		wo = word.toCharArray();
		
		List<String> w = new LinkedList<String>();
		
		//  w.add(word);
		   
		 //  System.out.println(w);
		   
		for (int i=0;i<word.length();i++) {
			
			
			System.out.println(w.get(i));
			
		/*	for (int j=1; j<w.size()-i;j++) {
			if(wo[i] == wo[i+j]) {
				w.set(i, word);
			}
			*/
		}
			
		
		
		System.out.println(w);
		
		
		//Close Scanner
		in.close();	
	}
	
	

}
