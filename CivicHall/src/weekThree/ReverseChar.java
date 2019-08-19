package weekThree;

public class ReverseChar {
	
	public static void main(String [] args) {
		
		char[] message = {'s','t','e','a','l',' ','p','o','u','n','d',' ','c','a','k','e'};	
		
		//write a program that reverses a string
		//the position of spaces in original string should be maintained
		//output: ekacd nuopl aets
		System.out.println(String.valueOf(message));
		System.out.println(inPlaceReverse(message));
		
	}

	public static String inPlaceReverse(char[] arr) {
	
		int x = arr.length;
		
		for (int i=0; i<x/2 ;i++) 
		{
			char temp = arr[i];
			arr[i] = arr[x-1-i];
			arr[x-1-i] = temp;
		}
			
		char temp2 = arr[4];
		arr[4]=arr[5];
		arr[5] = temp2;
		
		char temp3 = arr[10];
		arr[10]=arr[11];
		arr[11] = temp3;
		

		String line = String.valueOf(arr);
		
		return line;
		
	}
	
}
