package sba45;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserNames {

	public static void main(String [] args) {
		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		//Prompt for user names:
		System.out.println("How many users do you want to enter?");
		
		int n = input.nextInt();
		
		
		String[] userList = new String[n];
		
		List<String> l = new ArrayList<String>();
		Set<String> hs = new HashSet<String>();
		Set<String> hs2 = new TreeSet<String>();
		
	
		
		
		for (int i=0; i<n; i++) {
			
		 userList[i] = input.next();
		 
		 
		 hs.add(userList[i]);
		 
		}
		
		l.addAll(hs);
		 
		
		
		for (int i=0; i<n;i++) {
		 for (int j=1; j<=i;j++) {
		 if (hs.contains(userList[i])) {
	
		 l.add(userList[i]+j);
		 
		
		 }
		 
		 
		 else {
			 l.add(userList[i]);
			 break;
		 }
		 
		 
		 
		}
		}
		
		
		hs2.addAll(l);
		
		System.out.println(l);
		System.out.println(hs2);
		
		
		
		
		
		//Close Scanner Class
		input.close();
		
		
		
		
		
	}
	
	
}
