package weekThree;

import java.util.Scanner;

public class RandomArray {
	
	public static void main(String [] args) {
		
		int length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want in the array:");
		
		//Assigning the length of the array from user input
		length = scan.nextInt();
		
		//Declaring and creating the array
		int arr[] = new int[length];
		
		//Fill the array with random values
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100);
		}
		
		//For printing those numbers
		for(int i=0;i<arr.length;i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
		}
		
		
		
		scan.close();
		
		
		
		
		
	}

}
