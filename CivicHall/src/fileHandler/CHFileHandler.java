package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CHFileHandler {
	
	public static void main(String [] args) {
		
		ArrayList<Course> data = new ArrayList<Course>();
		
		try {
			String location = "/Users/student_113/eclipse-workspace/CivicHall/src/fileHandler/courses.txt";
			
			String loc2 = "/Users/student_113/eclipse-workspace/CivicHall/src/fileHandler/sample.txt";
			
			File file = new File(location);
			
			File file2 = new File(loc2);
			
			FileWriter writer = new FileWriter(file2, true);
			
			
			
			
			
			writer.write("Course Code,Course Name,Instructor \n");
			

			Course cout = new Course("002", "XP1", "Marshalls");
			
			writer.write(String.format("%-10s,%-10s,%-10s \n", cout.getCode(),cout.getCourse(),cout.getInstructor()));
			
			writer.close();
			
		
			
			
			
			
			
			
			
			Scanner input = new Scanner(file);
			
			while (input.hasNextLine()) {
				String [] line = input.nextLine().split(",");
				data.add(new Course(line[0], line[1],line[2]));	
				
			    //System.out.println(Arrays.toString(line));
			}
			
			for (Course course:data ) {
				System.out.format("%-15s | %-25s | %-25s \n",course.getCode(),course.getCourse(),course.getInstructor());
			}
			
			input.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
	}
}

	
	class Course{
		private String code, course, instructor;

		public Course(String code, String course, String instructor) {
			super();
			this.code = code;
			this.course = course;
			this.instructor = instructor;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getInstructor() {
			return instructor;
		}

		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}
		
		
	
	}
	
	



