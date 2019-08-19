package student.pack;

import java.util.ArrayList;
import java.util.List;
public interface StudentDao {
	
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudentl(int rollNo, String name);
	public void deleteStudent(int rollNo);
	
	public void addStudent(String name, int rollNo);
	
	public void printList();
	

}
