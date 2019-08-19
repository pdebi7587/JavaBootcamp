package weekThree;

import java.util.Arrays;

public class NumberGeneration {

	public static void main(String [] args) {
		
		int [] num = new int[10];
		//boolean found=false;
		
		for(int k=0; k<10;k++) {
			
		for (int i=0; i<10; i++) {
			
			num[i] = (int) (1+ Math.random()*15);
		
			for (int j=0; j<i ; j++){
				if (num[j] == num[i]){
					num[i] = (int) (1+ Math.random()*15);
					j=-1;
					}	
				}	
						
		}
			System.out.println(k+1 + ":" + Arrays.toString(num));
		}
		/*for (int k=0; k<10;k++) {
		System.out.println(k+1 + ":" + Arrays.toString(num));	
		}*/
	}
}





/*	public static String reverseWords(char[] letters) {

String[] temp = new String[letters.length];

/*for (int i=0;i<x;i++) {
	if (letters[i] == ' ') {
		count++;
	}
}*/

System.arraycopy(temp,0,letters,0, temp.length);
System.arraycopy(temp,5,letters,4, temp.length);
System.arraycopy(temp,12,letters,11, temp.length);

//System.out.println(Arrays.toString(temp));


return(Arrays.toString(temp));

}
*/
