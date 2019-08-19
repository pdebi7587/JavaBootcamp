package weekFive;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	
	public static void main(String [] args) {
		
		//int [] numbers = {5,1,55,22,5,0,1};
		String[] fruit = {"Mango", "Apple", "Orange", "Mango", "mango"};
		
		//Set<Integer> set = new HashSet<Integer>();
		
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i<fruit.length; i++) {
			//set.add(numbers[i]);
			set.add(fruit[i]);
		}
		
		
		System.out.println(set);
	}

}
