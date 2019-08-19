package coreJava.Models;

public class Course {
	
	private String ID;
	private String name;
	private String instructor;

	public Course(String iD, String name, String instructor) {
		super();
		ID = iD;
		this.name = name;
		this.instructor = instructor;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}


}
