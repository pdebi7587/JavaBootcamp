package weekFive;

public class MathMajor extends Student{
	
	private boolean analyticalSkill;

	public MathMajor(int sId, String sName, int noOfSemester,  boolean analyticalSkill) {
		super(sId, sName, noOfSemester);
		// TODO Auto-generated constructor stub
		
		this.analyticalSkill= analyticalSkill;
	}
	
	public void practiceLab() {
		System.out.println("As a math student I have a practice lab!");
	}
	
	public void useLibrary() {
		System.out.println("As a Math student I use a special Math library!");
	}
	
	public void useLibrary(String msg) {
		System.out.println("Welcome to the library of Math Major.");
	}
	
	public void ancestor() {
		System.out.println("MathMajor calling his/her ancestor!");
		super.useLibrary();
	}

	public boolean isAnalyticalSkill() {
		return analyticalSkill;
	}

	public void setAnalyticalSkill(boolean analyticalSkill) {
		this.analyticalSkill = analyticalSkill;
	}

}
