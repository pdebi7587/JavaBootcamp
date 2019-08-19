package weekFive;

public class Student {

	private int sId;
	private String sName;
	private int noOfSemester;

	
	
	public Student(int sId, String sName, int noOfSemester) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.noOfSemester = noOfSemester;

		
	}
	
	public void useLibrary() {
		System.out.println("As a student I can use the library!");
	}
	
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getNoOfSemester() {
		return noOfSemester;
	}
	public void setNoOfSemester(int noOfSemester) {
		this.noOfSemester = noOfSemester;
	}
	
	
	
}
