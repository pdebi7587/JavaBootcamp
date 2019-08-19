package weekSix.exceptionHandling;

public class Calculator {

	void printResult(String method, double res) {
		System.out.println("a" + method + "b" + " =" + res);
	}
	
	int add(int a, int b) {
		int res = a + b;
		printResult("+", res);
		return a + b;
	}
	
	double add(double a, double b) {
		double res = a + b;
		printResult("+", res);
		return a + b;
	}
	
	double division(double a, double b) {
		if (b==0) {
			throw new IllegalArgumentException("Value of second number can not be 0");
		}
		
		double res = a/b;
		printResult("/",res);
		return a/b;
	}
	
	
	
}
