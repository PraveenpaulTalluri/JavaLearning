package practicequestionpart2;

public class Employee {
	
	int employeeId;
	String name;
	String address;
	
	public Employee(int employeeId, String name, String address)
	{
		this.employeeId=employeeId;
		this.name=name;
		this.address=address;
	}
	
	public String toString()
	{
		return "Employee [id=" + employeeId + ", Name=" + name + ", Address=" + address + " ]";
	}

}
