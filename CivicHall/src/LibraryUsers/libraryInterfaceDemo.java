package LibraryUsers;

public class libraryInterfaceDemo {
	
	public static void main(String [] args) {
		
		LibraryUser u1 = new kidUsers(10, "Kids");
		LibraryUser u2 = new kidUsers(18, "Fiction");
		u1.registerAccount();
		u1.requestBook();
		
		u2.registerAccount();
		u2.requestBook();
	
		
		LibraryUser u3 = new adultUser(5, "Kids");
		LibraryUser u4 = new adultUser(23, "Fiction");
		
		u3.registerAccount();
		u3.requestBook();
		
		u4.registerAccount();
		u4.requestBook();
		
		
		
	}

}
