package weekThree;

public class TwoDProbs {
	
	public static void main(String [] args) {
		
		int[][] box = new int[3][3];
		
		int incrementBy = 10;
		
		for (int i=0; i<box.length ;i++) {
			
			for (int j=0; j<box[i].length;j++) {
				box[i][j]= incrementBy;
				incrementBy+=10;
				
				System.out.print(box[i][j] + " ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println();
		
		for (int i=0; i<box.length ;i++) {
			
			for (int j=0; j<box[i].length;j++) {
				box[i][j]= (int) (Math.random()*101);
			
				System.out.print(box[i][j] + " ");
			}
			
			System.out.println(" ");
		}
		
		
		
		
	}

}
