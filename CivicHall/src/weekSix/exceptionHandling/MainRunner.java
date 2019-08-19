package weekSix.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRunner {
	
	public static void main(String [] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		try {
		
		System.out.println("Please enter the first number: ");
		double a = scn.nextDouble();
		
		System.out.println("Please enter the second number: ");
		double b = scn.nextDouble();
		
		System.out.println("1. Addition, 2.Division");
		int c = scn.nextInt();
		
		

		scn.close();
		Calculator calc = new Calculator();
		
		if (c == 1) {
			calc.add(a, b);
		}
		
		else if (c == 2) {
			calc.division(a, b);
		}
		
		} /*catch (InputMismatchException e) {
			System.out.println("Something went wrong!");
		} catch (ArithmeticException e) {
			System.out.println("Divisor can not be 0!");
		}*/
		
		catch (Exception e){
			//e.printStackTrace();
			//throw new Exception("Something went wrong!");
			throw new e.NewMessage();
			//System.out.println("Something went wrong!");
		}
		
		System.out.println("End of code!");
		
		
		
	}

}
