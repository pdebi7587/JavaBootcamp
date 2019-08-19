package weekThree;

import java.util.Arrays;

public class Reverse {
	
	public static void main(String[] args){
		
		int[] numbers = {77,1,5,9};
		System.out.println("Original array is "+ Arrays.toString(numbers));
		
		
		int[] numbers2 = reverse(numbers);
		System.out.println("The reversed array is "+ Arrays.toString(numbers2));
		
		int[] numbers3= inPlaceReverse(numbers);
		System.out.println("In place reverse: "+ Arrays.toString(numbers3));
		

		
			
	}


	public static int[] inPlaceReverse(int[] arr) {
		// TODO Auto-generated method stub
		
		int x = arr.length;
		
		for (int i=0; i<x/2;i++) {
			int temp = arr[i];
			arr[i] = arr[x-1-i];
			arr[x-1-i] = temp;
			
		}
		
		return arr;
		
	}


	public static int[] reverse(int[] list) {
		
		int[] result = new int[list.length];
		
		for (int i=result.length-1, j=0;j<list.length; i--,j++) {
			result[i] =list[j];	
		}
		
		return result;
		
	}
	
	
}