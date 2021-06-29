package thirdweekjavapractise;

import java.util.*;


@SuppressWarnings("serial")
class MyCustomException extends Throwable 
{
	MyCustomException(String s)
	{
		super(s);
	}
}


public class CustomExceptionExample {
	static String originalPassword="ImAdmin";
	
	 static ArrayList<Employee2> employee=new ArrayList<>(); 

	public static void menu() throws MyCustomException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("                      MENU                      ");
		System.out.println("Press 1 : To display employee details");
		System.out.println("Press 2 : To enter new employee details");
		System.out.println("Press 3 :Forgot admin password,Reset now");
		System.out.println("Select any one Option :");
		int option = scanner.nextInt();
		switch (option) {
		case 1:display();break;
		case 2:update();break;
		case 3: resetPassword();break;
		default :System.out.println("Invalid input");
		}
		scanner.close();
	}

	static void display() {
		for (Employee2 e : employee) {
			System.out.println(e);
		}
	}
	
	static void update() throws MyCustomException
	{
		System.out.println("Enter admin Password : ");
		Scanner scanner=new Scanner(System.in);
		String inputPassword=scanner.nextLine();
		
		if(inputPassword.equals(originalPassword)) {
			System.out.println("Enter id,name,designation of new employee : ");
			employee.add(new Employee2(scanner.nextLong(),scanner.nextLine(),scanner.nextLine())); 
		}
		else {
			System.out.println("passwaord mismatch");
			menu();
		}
		scanner.close();
	}
	
	static void resetPassword() throws MyCustomException
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your designation : ");
		String temp=scanner.nextLine();
		scanner.close();
		if(temp=="Admin") {
			System.out.println("Type new Password"); originalPassword=scanner.nextLine();
			System.out.println("Password Updated succesfully");
		}
		else {
			throw new MyCustomException("Access denied");
		}
		
	}

	public static void main(String[] args) {

		  
		  employee.add(new Employee2(101l,"Praveen","Associate Software Engineer")); 
		  employee.add(new Employee2(102l,"Libin","Lead")); 
		  employee.add(new Employee2(103l,"Alvis","Software Engineer")); 
		  employee.add(new Employee2(104l,"Vaishnavi","Software Engineer")); 
		  employee.add(new Employee2(999l,"Paul","Admin"));
		try {
		menu();}
	    catch (MyCustomException e) {
	    	System.out.println("CustomException Occured");
		}
		
	}

}
