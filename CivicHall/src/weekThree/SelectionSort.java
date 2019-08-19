package weekThree;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String [] args) {
		
		//double[] arr = {20,5,1,10,15,25};
		// sort: 1,5,10,15,20,25
		//output:1,25,5,20,10,15;
		//selectionSort(arr);
		//System.out.println(Arrays.toString(arr));
		char[] array_variable = new char[10];
		
		
		for (int k=0;k<10;k++) {
			System.out.print(k);
			array_variable[k] = 'i';
			System.out.print(array_variable[k] + " ");
			++k;
			//System.out.println(k);
			System.out.println();
		}
		
		
		
	}
	
	public static void selectionSort(double [] list) {
		
		for (int i=0; i<list.length; i++) {
			
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1;j<list.length;j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
		}
		
			
	}
	
	

}
