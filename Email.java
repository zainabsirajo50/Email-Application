import java.util.*;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String dept;
	private String email;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	

	
	public Email() {
		
		System.out.println("************WELCOME!************");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		
		
		System.out.println();
		
		
		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
				 
				
		  this.firstName = firstName;
		  this.lastName = lastName;			 		   
		  this.dept = setDept();		 
		  this.password = setPassword(defaultPasswordLength);
		 		  
		  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + "." + companySuffix;
		  
		 
		  
		  // to print shortcut for printmethod, type "sysout" then do control+space
	 }
	
	private String setDept() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER DEPT: \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for None");
		int choice = input.nextInt(); 
		
		if(choice == 1) {
			return "sales";
		} else if (choice == 2) {
			return "dev";
		} else if (choice == 3) {
			return "accounting";
		} else {
			return " ";
		}
	}
	
	private String setPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);		
		}
		
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMAPANY EMAIL: " + email +
				"\nMAILBOX CAPCITY: " + mailBoxCapacity + " megabytes" +
				"\nPASSWORD: " + password;
				
	}
}
