package student.department;

import java.util.List;

import student.pack.Student;

public interface DepartmentDao {
	

	public List<Department> getAllDepartments();
	public Department getADepartment(int deptId);
	public void updateDepartment(int deptId, String deptName);
	public void deleteDepartment(int deptId);
	
	public void addDepartment(String deptName, int deptId);
	public void addToDepartment(int roll, int deptId);
	public void removeFromDepartment(int roll, int deptId);
	
	public void studentsofADept(int deptId);
	public void showAllDept();
	

}
