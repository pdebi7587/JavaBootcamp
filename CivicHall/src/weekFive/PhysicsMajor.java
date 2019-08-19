package weekFive;

public class PhysicsMajor extends Student{
	
	private boolean gravityLab;
	
	public boolean isGravityLab() {
		return gravityLab;
	}

	public void setGravityLab(boolean gravityLab) {
		this.gravityLab = gravityLab;
	}

	public PhysicsMajor(int sId, String sName, int noOfSemester, boolean gravityLab) {
		super(sId, sName, noOfSemester);
			
		
	}

	
	

}
