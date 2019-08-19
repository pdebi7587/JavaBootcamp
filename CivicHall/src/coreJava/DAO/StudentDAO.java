package coreJava.DAO;

import coreJava.Models.Student;
//import fileHandler.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
	
	List<Student> students = new ArrayList<Student>();
	  String location = "/Users/student_113/eclipse-workspace/CivicHall/src/coreJava/students.csv";
	  File file = new File(location);
	
	  public List<Student>  getStudents(){
		  
		  try {
			Scanner input= new Scanner(file);
			
			 while (input.hasNextLine()) {
				  String[] line = input.nextLine().split(",");
				  Student theStudent = new Student(line[0],line[1],line[2]);
				  //students.add(new Student(line[0],line[1],line[2]));
				  
				  students.add(theStudent);
				  
			 }
			 
			 
			 
			 input.close();
			 
			 	  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return students;

	    }

	    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
	    	
	    	Student lookup = null;
			for(Student s: studentList) {
				if(s.getEmail().equals(studentEmail)) {
					lookup = s;
				}
			}
			return lookup;
	    
	    }

	    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){
	    	
	    	//Student lookup = null;
	    	boolean found = false;
			for(Student s: studentList) {
				if((s.getEmail().equals(studentEmail)) && (s.getPass().equals(studentPass)) ){
					found = true;
					
				}
			}
			
			return found;
				
	    }

}
