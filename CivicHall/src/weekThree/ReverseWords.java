package weekThree;

import java.util.Arrays;


public class ReverseWords {
	
	public static void main(String[] args) {
		
		char[] message = {'c','a','k','e',' ','p','o','u','n','d',' ','s','t','e','a','l'};
		System.out.println(message);
		
		String rvd= reverseWords(message);
		
		System.out.println(rvd);
		
	}
	

	
	public static String reverseWords(char[] letters) {
		

		
		/*
		for (int i=11, j=0;i<=15;i++,j++) {
		char temp = letters[i];
			letters[j] = letters[i];
			letters[j] = temp;				
		}
		
		char temp = letters[15];
		letters[15] = letters[4];
		letters[4] = temp;
		
		char temp2 = letters[5];
		//letters[5]= letters[5];
		letters[5] = temp2;
		
		for (int k=4, l=5;k<=10;l++,k++) {
			//char temp2 = letters[k];
			letters[k] = letters[l];
			//letters[l] = temp2;		
		}
		
		for (int m=0, n=11;m<=3;m++,n++) {
			char temp3 = letters[m];
			letters[m] = letters[n];
			letters[m] = temp3;
		}
		
		

		letters[0]=letters[12];
		letters[1]=letters[13];
		letters[2]=letters[14];
		letters[3]=letters[15];
		
		
		letters[4]=letters[5];
		letters[5]=letters[6];
		letters[6]=letters[7];
		letters[7]=letters[8];
		letters[8]=letters[9];
		letters[9]=letters[10];
		
		
		
		
		
		
		
		
		
		letters[15]=letters[4];
		letters[14]=letters[3];
		letters[13]=letters[2];
		letters[12]=letters[1];
		letters[11]=letters[0];
		
		temp = letters[10];
		letters[10]=letters[11];
		
		*/
		

		/*for (int a=5; a<11;a++) {
			char x = letters[a];
			letters[a] = letters[a-1];
			//letters[a-1] = x;
		}
		
		
		
		for (int b=0; b<4;b++) {
			char y = letters[11];
			letters[11] = letters[11-b];
			letters[11-b] = y;
		}
		
		*/
		
		
		for (int a=0; a<=10;a++) {
			char t= letters[a];
			letters[a];
		}
		
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		

		String line = String.valueOf(letters);
		
		return(line);
		
		}
		
}

	

