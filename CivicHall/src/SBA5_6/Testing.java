package SBA5_6;

import java.util.Scanner;

public class Testing {
	
	//Create Scanner Class
	private static final Scanner INPUT_READER = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		String[] lengthWidth = INPUT_READER.nextLine().split(" ");
		float l =  Float.parseFloat(lengthWidth[0]);
		float w = Float.parseFloat(lengthWidth[1]);
		
		float side = Float.parseFloat(INPUT_READER.nextLine());
		float radius = Float.parseFloat(INPUT_READER.nextLine());
		
		shape rectangle = new Rectangle(l, w);
		Rectangle squ = new Square(side);
		shape circle = new Circle(radius);
		
		System.out.println("==========================");
		System.out.println("Finding area and perimeter of shapes");
		System.out.println("==========================");
		
		System.out.println("Area = "+rectangle.getArea() + " and Perimeter = "+rectangle.getPerimeter());;
		
		System.out.println();
		
		System.out.println("Area = "+ squ.getArea() + " and Perimeter = " + squ.getPerimeter());

		System.out.println();
		
		System.out.println("Area = "+ circle.getArea() + " and Perimeter = " + circle.getPerimeter());
		
		System.out.println();
		
		System.out.println("==========================");
		System.out.println("Printing Shapes as String");
		System.out.println("==========================");
		
		System.out.println(rectangle.toString());
	
		System.out.println(squ.toString());
	
		System.out.println(circle.toString());
		
		
		
		//Close Scanner
		INPUT_READER.close();
		
		
		
	}

}