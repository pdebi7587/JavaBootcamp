package coreJava.Models;

public class Attending {
	
	public String courseID;
	public String studentEmail;
	
	
	
	
	public Attending(String courseID, String studentEmail) {
		super();
		this.courseID = courseID;
		this.studentEmail = studentEmail;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
}
