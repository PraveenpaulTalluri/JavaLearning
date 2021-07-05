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
