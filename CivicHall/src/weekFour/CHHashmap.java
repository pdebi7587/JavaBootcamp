package weekFour;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class CHHashmap {
	
	public static void main(String [] args) {
		
		Integer [] grades = {87,89,90};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>(16,.75f);
		
		for (int i=0;i<grades.length;i++) {
			hmap.put(i,grades[i]);
		}
		
		for(Entry<Integer,Integer> entry:hmap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		/*
		//HashMap<String, Integer> grades = new HashMap<String,Integer>();
		
		grades.put("Max" , 91);
		grades.put("Ruby", 89);
		grades.put("Tom", 87);
		
		//int[] test = {1,2,4};
		
		
		
		
		for (Entry<String, Integer> x: grades.entrySet()) {
			System.out.print(x.getKey() + ": ");
			System.out.println(x.getValue());
		}
		
		//System.out.println(grades);
		//grades.clear();
		//System.out.println(Arrays.toString(test));
		//System.out.println(grades);
		//System.out.println(grades.containsKey("Max"));
		//System.out.println(grades.containsValue(89));
		
		
		HashMap<Character, Integer> grades = new HashMap<Character,Integer>();
		
		
		
		for (int j=0; j<30; j++) {
			char c = (char) (65+(Math.random()*26));
			int i =  (int) c;//(int)(Math.random()*100);
			grades.put(c, i);
			
		}
		
		System.out.println(grades);
		System.out.println(grades.size());
		
		for (Entry<Character, Integer> x: grades.entrySet()) {
			System.out.print(x.getKey() + ": ");
			System.out.println(x.getValue());
		}
		
		
		*/
		
	}
	
	
	public V get(Object key) {
		Node<K,V> e;
		return (e= getNode(hash(key),key)) == null ? null :e.value;
	}

}
