package firstweekjavapractise;
class Xoriant2{
	int empID;
	String Name;
	String Dept;
	long Phn;
	float salary;
	
	
}

class manager2 extends Xoriant2{
	int No_of_teams;
	float bonus;
}
class accounts extends manager2{
	void netSalary()
	{
		float netSalary=salary+bonus;
		System.out.println(netSalary);
	}
}
public class multilevelinheritance {
	public static void main(String[] args) {
		accounts a1= new accounts();
		accounts a2= new accounts();
		
		a1.empID=63141;
		a1.Dept="Delivery";
		a1.Name="Libin";
		a1.No_of_teams=5;
		a1.salary=100000;
		a1.bonus=50000;
		
		a2.empID=63142;
		a2.Dept="Delivery";
		a2.Name="Paul";
		a2.No_of_teams=10;
		a2.salary=200000;
		a2.bonus=100000;
		
		
		
		System.out.println(a1.Name+'\t'+a1.empID+'\t'+a1.Dept+'\t'+a1.bonus+'\t');
		a1.netSalary();
		System.out.println(a2.Name+'\t'+a2.empID+'\t'+a2.Dept+'\t'+a2.bonus );
		a2.netSalary();

	}

}
