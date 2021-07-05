/*8.	Implement vector class for this problem
-	Create an Employee class which will have details like EmployeeNo, EmployeeName and Address. You should pass value for EmployeeNo, EmployeeName and Address through constructor.
-	Create a method addInput( ) which will add employee details to vector.
-	Create method display( ) which should display all data from vector using Enumeration.
-	Note :  addInput( ) and display( ) should not be member functions of Employee class.  
*/
package practicequestionpart2;

import java.util.*;

public class TestEmployee {
	
	Vector<Employee> vector=new Vector<>();
	void addinput()
	{
		vector.add(new Employee(101,"Paul","Rajahmundry"));
		vector.add(new Employee(102,"Praveen","Pune"));
	}
	
	void display()
	{
		Enumeration<Employee> en=vector.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
	public static void main(String[] args) {
		TestEmployee testemployee=new TestEmployee();
		testemployee.addinput();
		testemployee.display();
	}

}
