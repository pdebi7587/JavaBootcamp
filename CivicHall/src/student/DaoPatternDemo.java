package student;

import java.util.ArrayList;
import java.util.Scanner;

import student.pack.Student;
import student.pack.StudentDao;
import student.pack.StudentDaoImpl;

public class DaoPatternDemo{

	public static void main(String [] args) {
		
		StudentDao studentdao = new StudentDaoImpl();
		
		Scanner input = new Scanner(System.in);
		
		//Get all students
		studentdao.printList();
		
		
		
		//Print all students
		System.out.println("==============Business Need=============");
		
		
		boolean keepAdding = true;
		
		while(keepAdding) {
			System.out.println("Do you want to add a new student? Enter 1 to add a new student, 2 to skip. ");
			int x = input.nextInt();
			
			if (x==2) {
				keepAdding = false;	
			}
			
			else {
				System.out.println("Enter a student roll no:");
				int roll = input.nextInt();
				System.out.println("Enter a name:");
				String name = input.next();
				studentdao.addStudent(name, roll);
				studentdao.printList();
				System.out.println();	
			}
			
		}
		
		
		for (Student student: studentdao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name: " + student.getName() + "]");
		}
		
		//Get the student
		System.out.println("Please provide the student roll you want to retrieve:");
		int y = input.nextInt();
		Student retrieveStudent = studentdao.getStudent(y);
		System.out.println();
		System.out.println("Student: [RollNo : " + retrieveStudent.getRollNo() + ", Name: " + retrieveStudent.getName() + "]");
		
		
		//Update Student
		System.out.println("Please provide the student roll number you want to update:");
		int z = input.nextInt();
		System.out.println("Please enter new student name:");
		String nam = input.next();
		studentdao.addStudent(nam, z);
		
		//Delete a Student
		System.out.println("Please provide the student roll you want to delete: ");
		int a = input.nextInt();
		studentdao.deleteStudent(a);
		System.out.println("Student has been deleted from list with roll number: " + a);
		
		
		//After operation
		studentdao.printList();
		
		
		
		
		
		
	}

	
	
	
}
