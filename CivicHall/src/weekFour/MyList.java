package weekFour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String [] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> ll2 = new LinkedList<Integer>();
		
		ll2.add(25);
		
		System.out.println(ll2);
		
		LinkedList<Integer> al3= new LinkedList<Integer>();
		al3.add(24);
		System.out.println(al3);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		System.out.println(newList);
		
		newList = al3;
		al3 = newList;
		
		
		
	}
}
