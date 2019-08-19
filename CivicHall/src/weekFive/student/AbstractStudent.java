package weekFive.student;

public abstract class AbstractStudent {
	
	protected String firstName;
	protected String lastName;
	protected double gpa;
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGpa(double grade) {
		this.gpa = grade;
	}
	
	abstract void getInfo();
	abstract String[] getName();
	
	

}
