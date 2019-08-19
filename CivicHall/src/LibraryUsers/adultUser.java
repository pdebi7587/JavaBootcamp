package LibraryUsers;

public class adultUser implements LibraryUser{

	private int age;
	private String bookType;
	
	
	
	

	public adultUser(int age, String bookType) {
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
		
		if (age >= 12) {
			System.out.println(age + ": You have successfully registered under an Adult Account");
			
		}
		
		else {
			System.out.println("Sorry,  Age  must  be  greater  than  12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		
		if (bookType.equals("Fiction")) {
			System.out.println(bookType + ": Book Issued successfully, please return the book within 7 days");
		}
		
		else {
			System.out.println("Oops,  you  are  allowed  to  take  only  adult Fiction books”");
		}
		
	}

}
