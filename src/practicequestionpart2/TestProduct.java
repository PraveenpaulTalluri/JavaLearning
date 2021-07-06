package practicequestionpart2;
import java.util.*;
public class TestProduct {
	
	String productName;
	String productID;
	
	void display(Hashtable<String,String> table)
	{
		System.out.println(table);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TestProduct p=new TestProduct();
		
		Hashtable<String,String> table=new Hashtable<>(); //default capacity is 11
		
		table.put("P001", "Maruti800");
		table.put("P002","MarutiZen");
		table.put("P003", "MarutiEsteem");
		
		p.display(table);
		
		sc.close();
	}

}
