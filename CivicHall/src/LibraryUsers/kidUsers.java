package LibraryUsers;

public class kidUsers implements LibraryUser{
	
	private int age;
	private String bookType;
	
	public kidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		
		
		if (age < 12) {
			System.out.println(age + ": You have successfully registered under a Kids account!");
		}
		
		if (age >= 12) {
			System.out.println("Sorry, age must be less than 12 to register as a kid!");
		}
		
		
	}

	@Override
	public void requestBook() {
		
		if (bookType.equals("Kids")) {
			System.out.println(bookType + ": Book Issued successfully,  please  return  the  book  within  10  days");
		}
		
		else {
			System.out.println("Oops,  you  are  allowed  to  take  only  kids books");
		}
		
		
	}

}
