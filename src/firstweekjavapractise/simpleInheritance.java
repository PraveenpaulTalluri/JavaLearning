package firstweekjavapractise;
class Xoriant{
	int empID;
	String Name;
	String Dept;
	long Phn;
	float salary;
	
	
}

class manager extends Xoriant{
	int No_of_teams;
	float bonus;
}
public class simpleInheritance {

	public static void main(String[] args) {
		manager m1=new manager();
		manager m2=new manager();
		m1.empID=63141;
		m1.Dept="Delivery";
		m1.Name="Praveen";
		m1.No_of_teams=5;
		m1.bonus=50000;
		
		m2.empID=63142;
		m2.Dept="Delivery";
		m2.Name="Paul";
		m2.No_of_teams=10;
		m2.bonus=100000;
		
		
		System.out.println(m1.Name+'\t'+m1.empID+'\t'+m1.Dept+'\t'+m1.bonus+'\n');
		System.out.println(m2.Name+'\t'+m2.empID+'\t'+m2.Dept+'\t'+m2.bonus);
		

	}

}
