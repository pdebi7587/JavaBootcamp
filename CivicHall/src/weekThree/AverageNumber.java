package weekThree;

public class AverageNumber {
	public static void main(String [] args) {
		
		int arr[] = new int[100];
		double sum=0;
		int count=0;	
		int arr2[] = new int[100];
		double sum2 = 0;
				
		for(int i=0;i<100;i++) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i]+" ");
			
			sum+=arr[i];
			
		}
		System.out.println();
		System.out.println("Total :" + sum);
		double avg = sum/100;
		
		
		
		System.out.println("average = " + avg);
		
		for (int i=0; i<100;i++) {
			if (avg < arr[i]) {
				count++;
			}
			
		}
		
		System.out.println(count + " numbers are above the average");
		
		
		for (int i=0; i<100; i++) {
			arr2[i] = (int) (Math.random()*100);
			System.out.print(arr2[i]+" ");
			sum2+=arr2[i];
		}
		System.out.println();
		System.out.println("Total : " + sum2);
		double avg2 = sum2/100;
		
		System.out.println("average = " + avg2);
		int count2 = 0;
		
		for (int i=0; i<100;i++) {
			if (avg2 < arr2[i]) {
				count2++;
			}
			
		}
		
		System.out.println(count2 + " numbers are above the average");
		
		
	}

}
