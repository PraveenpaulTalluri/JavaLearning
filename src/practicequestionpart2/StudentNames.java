package practicequestionpart2;
import java.util.*;


class StudentList{
	
	ArrayList<String> names=new ArrayList<>();
	
	void addName()
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name=sc1.next();
		
		names.add(name);
		System.out.println("Name added successfully");
		
		menu();
		sc1.close();
	}
	
	void isContains()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc2.next();
		
		boolean temp=names.contains(name);
		
		if(temp)
			System.out.println(name+" is present in the list");
		else
			System.out.println(name+" is not present in the list");
		
		menu();
		sc2.close();
	}
	
	void menu() throws InputMismatchException
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("         Select an operation         ");
		System.out.println("Press 1: To Enter name ");
		System.out.println("Press 2: To check if student name is present ");
		System.out.println("Press any other key to exit");
		int option=scanner.nextInt();
		
		switch(option)
		{
		case 1:addName();
				break;
		case 2:isContains();
				break;
		default: System.out.println("Exit");
		}
		
		scanner.close();
	}
	
}


public class StudentNames {
	
	public static void main(String[] args) throws InputMismatchException{
		StudentList studentlist=new StudentList();
		
		try {
			studentlist.menu();
		}
		catch(InputMismatchException e) {System.out.println("Invalid input");}
		
	}

}
