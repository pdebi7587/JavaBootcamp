package weekFive;
import weekFive.PeopleObject;

public class People {
/*
	private String Fname;
	private String Lname;
	private int StudentID;
	private String StudentEmail;
	private String StudentPhone;
	
	public void setFName(String Fname) {
		this.Fname = Fname;
	}
	
	public void setLName(String Lname) {
		this.Lname = Lname;
	}
	
	public void setID(int StudentID) {
		this.StudentID = StudentID;
	}
	
	public void setEmail(String StudentEmail) {
		this.StudentEmail = StudentEmail;
	}
	
	public void setPhone(String StudentPhone) {
		this.StudentPhone = StudentPhone;
	}
	
	public String toString() {
		
		return "I'm "+ Fname + " " + Lname + ", my Student Id is " + StudentID + ", my email is " + StudentEmail + " and my phone number is " + StudentPhone +".";
	}
	
	public void DisplayInformation() {
		
		System.out.println("Student Id  	First Name		Last Name		E-mail		 		Phone");;
		System.out.println(StudentID + "  		" +  Fname + "   	" + Lname + "   		" + StudentEmail + " 		 " + StudentPhone);
		System.out.println();
	}
	*/
	
	
	private static String a = "unmodified";
	private String b = "unmodified";
	
	public static void setA(String newA) {
		a = newA;
	}
	
	public static String getA() {
		return a;
	}
	
	public void setB(String newB) {
		this.b = newB;
	}
	
	public String getB() {
		return this.b;
	}
	
}
