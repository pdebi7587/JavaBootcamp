package weekFour;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CartSystem {
	
	static HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	
	public  String itemName;
	//public double itemPrice;
	public int itemQuantity;
	

	public CartSystem(String itemName,int itemQuantity) {
		this.itemName = itemName;
		//this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
	
	public static void ADD(String itemName, int itemQuantity) {
		
		hmap.put(itemName,itemQuantity);
		
		
	}






	public static void main(String [] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		for( int i=0; i<5; i++) {
		
		System.out.println("Input item name and quantity: (item name, quantity)");
		String itemINFO = input.next();
		
		int numb = Integer.parseInt(itemINFO);
		
		
		String name = numb.substring(0,numb.indexOf(","));
		
		
		CartSystem thing = new CartSystem(name,numb);
		ADD(name,numb);
		
		}
		
		System.out.println(hmap);
		
		
		
		
		//Close
		input.close();
		
	

		
		
		
	}

}
	/*
	class Item{
		
		
		
		for(Entry<Integer,Integer> entry:hmap.entrySet()) {
			hmap.put(itemName,itemPrice);
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	
		
			
	}
	
		*/

