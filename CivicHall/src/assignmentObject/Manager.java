package assignmentObject;

public class Manager extends Employee{

	public Manager(long employeeID, String employeeName, String employeeAddress, long employeePhone, double basicSalary,
			double specialAllowance, double hRA) {
		super(employeeID, employeeName, employeeAddress, employeePhone, basicSalary, specialAllowance, hRA);
		
		
		
	}
	
	public static void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = .15 * basicSalary;
		System.out.println(transportAllowance);
	}

	

}
