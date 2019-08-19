package student.department;

import java.util.List;

import student.pack.Student;

public class Department {

	private int deptId;
	private String deptName;
	private List<Student> studentList;
	public Department(int deptId, String deptName, List<Student> studentList) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.studentList = studentList;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getdeptName() {
		return deptName;
	}
	public void setdeptName(String name) {
		this.deptName = name;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
	
	
}
