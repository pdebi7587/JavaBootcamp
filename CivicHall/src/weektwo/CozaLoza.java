package weektwo;

public class CozaLoza {
	
	public static void main(String [] args) {
		
		String A = "Coza";
		String B = "Loza";
		String C = "Woza";
		
		
		for (int i = 1; i<111; i++) {
			
		boolean D =  (i%3==0);
		boolean E =  (i%5==0);
		boolean F =  (i%7==0);
		
		if (D && E && F) {
			System.out.print(A +B + C + " ");
		}
		
		else if (D && E) {
			System.out.print(A + B + " ");
		}
		
		else if (D && F) {
			System.out.print(A + C + " ");
		}
		
		else if (E & F) {
			System.out.print(B + C + " ");
		}
		
		else if (D) {
			System.out.print(A + " ");
		}
			
		else if (E) {
			System.out.print(B + " ");
		}
			
		else if (F) {
			System.out.print(C + " ");
		}
			
		
		
		else {
			System.out.print(i + " ");
		}
		
		if (i%11== 0) {
			System.out.println(" ");
		}
			
	}
		
		
	}
}

