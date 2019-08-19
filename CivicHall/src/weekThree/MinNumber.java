package weekThree;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		
		//int[] arr = {7,1,5,4,3};
		
		double arr[] = new double[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
		}
		
		
		double min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("The minimum is: " + min );
		
		scan.close();
		
		
		
	}
}
