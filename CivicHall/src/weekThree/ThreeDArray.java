package weekThree;

import java.util.Arrays;

public class ThreeDArray {
	
	public static void main(String [] args) {
		
		int[][][] arr = new int[3][5][4];
		
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				for(int k=0;k<4;k++) {
					arr[i][j][k] = (int)(Math.random()*100 +1);
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		System.out.println(Arrays.deepToString(arr));
		
	}
}
