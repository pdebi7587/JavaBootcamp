package weekThree;

import java.util.Arrays;
import java.util.Scanner;

public class RandomShuffle {
	
	public static void main(String [] args) {

		
		//Create Scanner Class
		Scanner input = new Scanner(System.in);
		
		
		
		String[] myList = {"C", "Java", "Python", "C++", "Ruby"};
		
		System.out.println(Arrays.toString(myList));
		
		System.out.println("Left shift by what? ");
		int shiftBy = input.nextInt();
		
		//Assign temporary variables
		//String temp1 = myList[0];
		//String temp2 = myList[1];
		String[] temp = new String[shiftBy];
		
		for (int i=0; i<shiftBy; i++) {
			temp[i] = myList[i];
		}
		
		System.out.println(Arrays.toString(temp));
		
		for (int j=0; j<myList.length-shiftBy; j++) {
			myList[j] = myList[j+shiftBy];
				
		}
		
	/*	for (int k=myList.length-shiftBy, l=0; k<myList.length;k++, l++) {
			myList[k] = temp[l];
		}
		*/
		System.arraycopy(temp,0,myList,myList.length-shiftBy, temp.length);
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(myList));
		
		
		
		
				
				
				
				
		/*		
		myList[0] = myList[2];
		myList[1] = myList[3];
		myList[2] = myList[4];
		myList[myList.length-2] = temp2; //temp[1]
		myList[myList.length-1] = temp1;  //temp[0]
		
		System.out.println(Arrays.toString(myList));
		
		*/
		/*for (int i=0;i<myList.length;i++) {
			System.out.print(myList[i]+" ");
		}
		
		System.out.println(" ");
		
		for (int i=2;i<(myList.length-1);i++) {
			
			myList[i-2] = myList[i];
			System.out.print(myList[i]+ " ");
			myList[myList.length - 2] = temp;
		}
		
		
		*/
		
		
		//Close Scanner
		input.close();
		
		
		
	}

}
