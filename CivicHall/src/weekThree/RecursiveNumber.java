package weekThree;

public class RecursiveNumber {
	
	static int n1=0, n2=1, n3;
	
	public static void main(String [] args) {
		
		//subtractNum(10);
		//System.out.println(factorial(1));
		
		
		/*int nth=10;
		
		for (int i=0; i<nth; i++) {
		System.out.print(fibonacci(i) + " ");
		}
		*/
		
		int count = 10;
		System.out.print(n1 + " " + n2);
		fibonacci2(count-2);
		
	}
	
	public static void subtractNum(int n) {
		
		if (n>0) {
			subtractNum(n-2);
			System.out.println(n);
			
		}
	}
	
	public static int factorial(int x) {
			
		if (x == 0) {
			return 1;
		}
		
		return x*factorial(x-1);
			
		}
		
	public static int fibonacci(int y) {
		
		//0,1,2,3,5,8,13,21,34,55
	
		
		if( y <=1) {
			return y;
			
		}
		else {
			return fibonacci(y-1)+fibonacci(y-2);
		}
			
	}
	
	public static void fibonacci2(int count) {
		
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibonacci2(count-1);
		}
		
		
	}
		
	}
	


