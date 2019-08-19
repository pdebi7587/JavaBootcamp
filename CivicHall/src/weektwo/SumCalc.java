package weektwo;

public class SumCalc {
	public static void main(String [] args) {
		
		
		//For loop outputting integer that sums greater than 5789
		int sum=0;
		
		
		for (int i=0;sum<=5789 ;i++) {
			
			sum+=i;
			
			//System.out.println(i + " "+ sum);
			
			if (sum >= 5789) {
				System.out.println("For loop output: "+ i);
			}
			
		}
		
			
		
	//While loop outputting integer that sums greater than 5789
	
	
	int x=0, total=0;
	
	while (total<=5789) {
		total+=x;
		//System.out.println(x + " "+ total);
		
		if (total>=5789)
		{
			System.out.println("While loop output: "+ x);
		}
		x++;
	}
	
	
}

}
