package weekThree;

public class PrintJava {
	
	public static void main(String [] args){
		
		recursivePrinter(5);
				
	}
	
	public static void recursivePrinter(int n) {
		
		if (n>0){
		System.out.println("Welcome to Java");
		recursivePrinter(n-1);
		}
			
	}
		
}
