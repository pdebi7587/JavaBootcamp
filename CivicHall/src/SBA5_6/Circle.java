package SBA5_6;

public class Circle implements shape{
	
	float radius;

	public Circle(float new_radius) {
		super();
		this.radius = new_radius;
	}

	@Override
	public float getArea() {
		
		System.out.println("Finding area of circle with radius = {" + radius + "}");
		
		return (float) (3.14 * radius *radius);
	}

	@Override
	public float getPerimeter() {
		
		System.out.println("Finding perimeter of circle with radius = {" + radius + "}");
		
		return (float) (6.28*radius);
	}
	
	@Override
	public String toString() {
		
		String message = "Circle = [radius: {"+radius+"}, Area: {"+(float)3.14*radius*radius+"}, Perimeter: {" + (float)6.28*radius+ "}]";
		
		//System.out.println(message);
		return message;
	}


}
