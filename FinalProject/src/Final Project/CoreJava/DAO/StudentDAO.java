package CoreJava.DAO;

import CoreJava.Models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	String location = "/Users/student_113/eclipse-workspace/FinalProject/src/Final Project/students.csv";
	
	File file = new File(location);
	
	List<Student> students = new ArrayList<Student>();
	
	
	
	
	
	
    public List<Student>  getStudents(){

    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

    }
}
