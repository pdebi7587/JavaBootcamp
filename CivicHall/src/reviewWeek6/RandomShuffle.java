package reviewWeek6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomShuffle {
	
	public static void main (String [] args) {
		
		Character[] arr = {'a', 'p', 's', 'r', 'z'};
		
		List<Character> al= new ArrayList<Character>();
		
		Set<String>hs = new HashSet<String>();
		
		al = Arrays.asList(arr);
		
		System.out.println(al);
		
		String word = "";
		
		for (Character elm:al) {
			 word +=elm;
		}
		
		
		System.out.println(word);
		
		String temp = "";
		
		int x = word.length();
		
		
		int k=0;
		
		
		
		while ( k<word.length()) {
			
		int j = (int)(Math.random()*(x-1));
			
		while(k!=j) {
			 temp += word.charAt(j);
			 k++;
			}
			
			hs.add(temp);
		
			System.out.println(hs);
			
		}
		
		
		
		
		
		
		//String abc = ((Object) al).concate(arr);
		
		//double rnd = Math.random()*120;
		
		int i=0;
		
		while(i<150) {
		
		//java.util.Collections.shuffle(al);
		
		
		
		
		if (!hs.contains(word)) {
			System.out.println(i+ ": "+temp);
			i++;
		}
		
		
		}
		
	
		
		
		
		
	}

}
