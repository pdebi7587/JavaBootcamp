package weekFour;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class LlConstructor {

	public static void main(String [] args) {
		
		LinkedList <Integer> c1 = new LinkedList<Integer>();
		LinkedList <Integer> c2 = new LinkedList<Integer>();
		LinkedList <Integer> c3 = new LinkedList<Integer>();
		
		for (int i=0;i<10;i++) {
			
			if (i!=9) {
				c1.add(i);
				c3.add(i);
			}
			System.out.println("c1: " + c1);
			if (i%2==0 || i%3==0) {
				c2.add(i);
				c3.add(i);
			}
			System.out.println("c2: " + c2);
		}
		
		
		
		 Collections.sort(c3);
		
		System.out.println("c3: " + c3);
	}
}
