package weekone;

import java.util.Scanner;

public class AreaCalculator {
	public static void main (String [] args) {
	    // Declaring the variables
	    double radius;
        double area;
    
    
        //Assign variable 
       // radius = 20;
        System.out.println("What is the radius?"); 
        Scanner input = new Scanner (System.in);
        radius = input.nextDouble(); //instead of writing 20 statically
        
        //Calculating the area
        area = 3.14159*radius*radius;
        
        //Display result
        System.out.println("The area of the circle of radius " + radius + " is " + area + ".");
	
        //closing the scanner
        input.close();
	
	} 
}
