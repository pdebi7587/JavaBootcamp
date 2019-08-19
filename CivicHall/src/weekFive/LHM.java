package weekFive;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;



public class LHM {
	
	public static void main(String [] args) {
		
		//LinkedHashMap<String,Integer> hmap = new LinkedHashMap<String,Integer>(16,.75f,true);
		
		TreeMap<String,Integer> hmap = new TreeMap<String,Integer>();
		
		hmap.put("Max",25);
		hmap.put("Mercy",35);
		hmap.put("Danny",45);
		hmap.put("Lucy",55);
		hmap.put("David",65);
		
		printMap(hmap);
		
		//System.out.println(hmap.get("David"));
		
		hmap.get("Lucy");
		hmap.get("Danny");
		hmap.get("Max");
		hmap.get("Max");
		hmap.get("David");
		hmap.get("David");
		hmap.get("Mercy");
		hmap.get("Lucy");
		
		printMap(hmap);
		
	}
	
	//public static void printMap(LinkedHashMap<String,Integer> hmap) {
		public static void printMap(TreeMap<String,Integer> hmap) {
	//	hmap.forEach((key,value)->{ //lambda expression
	//		System.out.println(key + ": " + value);
	//	});
		
		System.out.println("========================================================");
		
	for(Entry<String,Integer> x: hmap.entrySet()) {
		System.out.println("Key: " + x.getKey() + ", Value: " + x.getValue());
	}
		
		
		
	}
	
	
	

}
