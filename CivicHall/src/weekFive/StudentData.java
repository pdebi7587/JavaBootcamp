package weekFive;

public class StudentData {
	
	public static void main(String [] args) {
		
		MathMajor ms1 = new MathMajor(1, "Max",3, true);
		Student s1 = new MathMajor(1,"Max", 3, true);
		Student s = new Student(1,"Max",3);
		
		
		
		
		/*
		MathMajor mm = (MathMajor) new Student(2,"Lucy", 2);
		
		ms1.practiceLab();
		ms1.useLibrary();
		
		((MathMajor) s1).practiceLab();
		
		s1.useLibrary();
		
		s.useLibrary();
		
		System.out.println("======================");
		
		mm.practiceLab();
		mm.useLibrary();
		*/
		
		
		ms1.useLibrary();
		
		Student stu = new MathMajor(1,"Lucy",3,true);
		stu.useLibrary();
		((MathMajor) stu).practiceLab();
		
		Student s2 = new Student(1,"Lucy", 3);
		s2.useLibrary();
	}
	

}
