package practicequestionpart2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parked_CarOwner_List {
	
	ArrayList<ArrayList<Parked_CarOwner_Details>> Mlist=new ArrayList<ArrayList<Parked_CarOwner_Details>>();
	
	ArrayList<Parked_CarOwner_Details> alist[]=new ArrayList[3];
	
	static int count=0;
	static int inner_count=1;
	void add_new_car()
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter owner's name:");
		String name=sc1.next();
		
		System.out.println("Enter car model:");
		String model=sc1.next();
		
		System.out.println("Enter car number:");
		Integer car_number=sc1.nextInt();
		
		System.out.println("Enter owner mobile number:");
		Integer mobile_number=sc1.nextInt();
		
		System.out.println("Enter owner's address:");
		String address=sc1.next();
		
		if(inner_count<40)
			{alist[count].add(new Parked_CarOwner_Details(name,model,car_number,mobile_number,address));}
		
		else
			{
			inner_count=1;
			count++;
			alist[count].add(new Parked_CarOwner_Details(name,model,car_number,mobile_number,address));
			}
			
		inner_count++;
		menu();
		sc1.close();
	}
	
	void remove_car()
	{
		
	}
	
	void get_parked_car_location()
	{
		
	}

	void menu() throws InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("         Select an operation         ");
		System.out.println("Press 1: To add new car details");
		System.out.println("Press 2: To remove car");
		System.out.println("Press 3: To get parked car location");
		System.out.println("Press any other key to exit");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:add_new_car();
				break;
		case 2:remove_car();
				break;
		case 3:get_parked_car_location();
				break;
		default: System.out.println("Exit");
		}
		sc.close();
	}
	
	
}
