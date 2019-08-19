package weektwo;

public class TuitionIncrease {
	
	public static void main (String [] args) {
		
		double tuition= 10000;
		
		int year = 0;
		
		
		for (year=0; tuition<=20000; year++) {
			System.out.printf("%d  %.2f\n",year, tuition);
			tuition*=1.07;
			
		}
		
		System.out.printf("In %d years tuition will be more than $20,000 at $%.2f .", year, tuition);			
		
	}

}
