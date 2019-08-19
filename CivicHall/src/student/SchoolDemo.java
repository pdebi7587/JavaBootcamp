package student;

import student.department.DepartmentDao;
import student.department.DepartmentDeoImpl;
import student.pack.StudentDao;
import student.pack.StudentDaoImpl;

public class SchoolDemo {
	
	public static void main(String [] args) {
		
		StudentDao sDAO = new StudentDaoImpl();
		DepartmentDao dDAO = new DepartmentDeoImpl(sDAO);
		
		
		//Initial List
		sDAO.printList();
		System.out.println();
		
		//Show Department List
		dDAO.showAllDept();
		System.out.println();
		
		//Show all students
		sDAO.printList();
		
		//Add 2 students in Department 1
		dDAO.addToDepartment(101, 1);
		dDAO.addToDepartment(103, 1);
		System.out.println();
		
		//Show Students in Department 1
		dDAO.studentsofADept(1);
		
		//Add 3 student in Department 2
		dDAO.addToDepartment(104,2);
		dDAO.addToDepartment(105,2);
		dDAO.addToDepartment(106,2);
		
		
		//Show students in Department 2
		dDAO.studentsofADept(2);
		
		//Remove a student from Department 1
		dDAO.removeFromDepartment(101, 1);
		System.out.println();
		
		//Show students in department 1
		dDAO.studentsofADept(1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
