package practisequestions;

import java.util.*;

class EmployeeDetails{
	long empId;
	String empName;
	String empAddress;
	String empEmail;
	String empDesignation;
	
	
	public EmployeeDetails(long id, String name, String address, String email, String designation) {
		this.empId=id;
		this.empName=name;
		this.empEmail=email;
		this.empAddress=address;
		this.empDesignation=designation;
	}


	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	 public int hashCode() {
	        return (int) this.empId;
	    }
	 
	 public boolean equals(Object obj) {
	        EmployeeDetails employee = (EmployeeDetails) obj;
	        if (employee.empId == this.empId) {
	            employee.setEmpAddress(this.empAddress);
	            employee.setEmpEmail(this.empEmail);
	            employee.setEmpDesignation(this.empDesignation);
	            return true;
	        } else {
	            return false;
	        }
	    }

	public String toString() {
        return "Employee id=" + empId + ", Name=" + empName + ", Address=" + empAddress + ", Email= "+empEmail+", Designation= "+empDesignation+"]";
    }
	
}
public class EmployeeInfo {
	
	
	static HashSet<EmployeeDetails> emp=new HashSet<>();
	void menu()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("         Select an operation         ");
		System.out.println("Press 1: To Enter employee details");
		System.out.println("Press 2: To view employee details");
		System.out.println("Press 3: To modify employee details");
		System.out.println("Press any other key to exit");
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:enter();break;
		case 2:view();break;
		case 3:modify();break;
		default: System.out.println("Exit");
		}
		
		scanner.close();
	}
	void enter()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee id, name, address, email, designation : ");
		long id=scanner.nextLong();
		String name=scanner.next();
		String address=scanner.next();
		String email=scanner.next();
		String designation=scanner.next();
		emp.add(new EmployeeDetails(id,name,address,email,designation));
		
		menu();
		scanner.close();
	}
	
	void view()
	{
		for (EmployeeDetails e : emp) {
			System.out.println(e);
		}
		menu();
	}
	
	void modify()
	{
		Scanner scanner=new Scanner(System.in);
		if(emp.isEmpty())
		{
			System.out.println("Employee data is empty");
		}
		else {
			
			System.out.println("Enter id and name of employee to modify the details");
			long id=scanner.nextLong();
			String name=scanner.next();
			System.out.println("Enter address :");
			String address=scanner.next();
			System.out.println("Enter email :");
			String email=scanner.next();
			System.out.println("Enter designation :");
			String designation=scanner.next();
			emp.add(new EmployeeDetails(id,name,address,email,designation));
		}
		menu();
		
		scanner.close();
	}
	public static void main(String args[]) 
	{	
		emp.add(new EmployeeDetails(101,"Praveen","Rajahmundry","p@xoriant.com","Associate software Engineer"));
		EmployeeInfo empInfo=new EmployeeInfo();
		empInfo.menu();
		
	}
	
}



