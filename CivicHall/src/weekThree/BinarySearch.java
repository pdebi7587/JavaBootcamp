package weekThree;

public class BinarySearch {
	
	public static void main(String [] args) {
		
		int [] arr = {2,3,4,10,40};
		int key = 10;
		//int startIndex = 0;
		//int endIndex = arr.length-1;
		
		int result = binarySearch(arr,key);
		if (result == -1) {
			System.out.println("Element not present");
		}
		
		else {
			System.out.println("Element found at " + "index " + result);
		}
		
	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while (startIndex <= endIndex) {
			
			int midIndex = startIndex + (endIndex-startIndex)/2;
			
			if (arr[midIndex] == key) {
				return midIndex;
			}
			
			if(arr[midIndex] < key) {
				startIndex = midIndex+1;
			}
			
			if(arr[midIndex] > key) {
				startIndex = midIndex-1;
			}	
			
		}
	
		return -1;
		
		
	}
	
	
	
	

}
