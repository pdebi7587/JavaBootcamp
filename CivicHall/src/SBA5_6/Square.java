package SBA5_6;

public class Square extends Rectangle{

	float side;

	public Square(float side) {
		super(getLength(), getWidth());
		// TODO Auto-generated constructor stub
		
		this.side = getLength();
		this.side = getWidth();
		
		
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	@Override
	public float getArea() {
		
		float area = getLength()*getLength();
		
		System.out.println("Finding area of square with side = {" + length + "}");
		System.out.println("Finding area of rectangle with length = {" + length + "} and width = " + length + "}");
		
		return area;
	}

	@Override
	public float getPerimeter() {
		
		System.out.println("Finding perimeter of square with side = {" + length + "}");
		System.out.println("Finding perimeter of rectangle with length = {" + length +"} and width = {"+length +"}");
		
		return 4*(length);
	}
	
	@Override
	public String toString() {
		
		String message = "Square = [side: {"+length+"}, Area: {"+length*length+"}, Perimeter: {" + 4*length+ "}]";
		
		//System.out.println(message);
		return message;
	}

	
	

}
