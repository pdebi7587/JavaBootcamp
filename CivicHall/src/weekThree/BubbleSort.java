package weekThree;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String [] args) {
		
		int[] num = {5,10};
		double[] dec = {15.9,11.0,2.0,12.1,20.0};
		//bSort(num);
		//System.out.println(Arrays.toString(num));
		bSortDec(dec);
		System.out.println(Arrays.toString(dec));
		
		
		
	}
	
	public static void bSort(int [] num) {
		
		int j;
		boolean flag = true;
		int temp;
		
		while (flag)
		{
			flag = false;
			for (j=0; j<num.length-1;j++) {
				if (num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = true;
				}
			}
		}
		
	}
	
public static void bSortDec(double [] num) {
		
		int j;
		boolean flag = true;
		double temp;
		
		for (;flag;)
		{
			flag = false;
			for (j=0; j<num.length-1;j++) {
				if (num[j] < num[j+1]) {
					temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
					flag = true;
				}
			}
		}
		
	}
	
	

}
