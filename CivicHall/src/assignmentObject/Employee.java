package assignmentObject;

public class Employee {
	
	private long employeeID;
	private String employeeName;
	private String employeeAddress;
	private Long employeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hRA = 1000.50;
	
	
	public Employee(long employeeID, String employeeName, String employeeAddress, Long employeePhone,
			double basicSalary, double specialAllowance, double hRA) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.setbasicSalary(salary);
		
	}
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double salary) {
		this.basicSalary = salary;
	}
	
	public static void calculateSalary(double basicSalary, double specialAllowance, double hRA) {
		 salary = (basicSalary/100)*(100 + specialAllowance + hRA);
		
		System.out.println(salary);
	}
	
	public static void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = .10 * basicSalary;
		System.out.println(transportAllowance);
	}
	
	

}
