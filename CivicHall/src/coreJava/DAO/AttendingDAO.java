package coreJava.DAO;

import coreJava.Models.Attending;
import coreJava.Models.Course;
import coreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
	
	List<Attending> attending = new ArrayList<Attending>();
	  
	  String location = "/Users/student_113/eclipse-workspace/CivicHall/src/coreJava/attending.csv";
	  File file = new File(location);
	  public List<Attending> getAttending(){
		  
			try {
				Scanner input= new Scanner(file);
						
				while (input.hasNextLine()) {
							  
					String [] line = input.nextLine().split(",");
					Attending theAttending = new Attending(line[0],line[1]);
					attending.add(theAttending);
							   
				}
						  
				input.close();
			     
					  
						  
			} catch (FileNotFoundException e) {
						e.printStackTrace();
			}catch (ArrayIndexOutOfBoundsException e) {
						e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return attending;		
		  
	    }

	    public void registerStudentToCourse(List<Attending> attending, String studentEmail, String courseID){
	    		
	    	boolean found = false;
			for(Attending s: attending) {
				if((s.getStudentEmail().equals(studentEmail)) && (s.getCourseID().equals(courseID))) {
					found = true;
					//break;
				}
			}
			
			if (found == false){
			Attending a = new Attending(courseID,studentEmail);
				attending.add(a);
			}
			
			
	    	
	    }

	    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
	    	String temp;
	    	List<Course>courseL = new ArrayList<Course>();
	    	for(Attending s: attending) {
				if((s.getStudentEmail().equals(studentEmail)) ) {
					temp = s.getCourseID();
					for (Course course: courseList) {
						if (course.getID().equals(temp)) {
							Course course2 = new Course(temp, course.getName(), course.getInstructor());
							courseL.add(course2);
						}
					}
					
				}
			}
	    	
	    	return courseL;
	    }

	    public void saveAttending(List<Attending> attending){
	    	try {
	    	String location = "/Users/student_113/eclipse-workspace/CivicHall/src/coreJava/attending.csv";
	 		File file = new File(location);
	    	FileWriter writer = new FileWriter(file, false);
		
	    	for (Attending elm: attending) {
	    		String data = "\n"+elm.getCourseID() +"," + elm.getStudentEmail();
	    		writer.write(data);
	    		data =null;	
	    	}
			
			writer.close();
			
	    	}catch (Exception e) {
				System.out.println(e);
			}
	    	

	    }
}
