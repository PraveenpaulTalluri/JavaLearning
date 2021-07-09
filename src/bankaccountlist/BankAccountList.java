/*9.	Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. 
	Also add setter and getter methods with business method like withdraw and deposit.
-	Create class BankAccountList which will maintain SavingAccount objects.
 	Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/

package bankaccountlist;

import java.util.*;

public class BankAccountList {
	
	 ArrayList<SavingsAccount> alist=new ArrayList<>();
	 
	void menu() throws InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("         Select an operation         ");
		System.out.println("Press 1: To Enter bank account details");
		System.out.println("Press 2: To withdraw amount");
		System.out.println("Press 3: To view account details");
		System.out.println("Press 4: To deposit amount");
		System.out.println("Press any other key to exit");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:addInput();
				break;
		case 2:withdraw();
				break;
		case 3:view();
				break;
		case 4:deposit();
				break;
		default: System.out.println("Exited");
		}
		sc.close();
	}
	private void addInput() {
		Scanner sc1=new Scanner(System.in);
		boolean flag=false;
		
		System.out.println("Enter account ID: ");
		int id=Integer.parseInt(sc1.nextLine());
		
		if(!alist.isEmpty())
		{
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getAcc_ID()==id)
				{
					System.out.println("User with id-"+id+" is already Present, duplicates not allowed");
					flag=true;
					break;
				}
				
			}
		}
		
		if(flag==false)
		{
			System.out.println("Enter account holder name: ");
			String name=sc1.nextLine();
			
			System.out.println("Is this your salary account : Yes/No");
			
			String type=sc1.nextLine();
			
			alist.add(new SavingsAccount(0f,id,name,type));
		}
		
		menu();
		sc1.close();
	}
	
	private void view() {
		if(alist.isEmpty())
			System.out.println("List is empty");
		else
		{
			for(SavingsAccount s:alist)
			{
				System.out.println(s);
			}
		}
		menu();
	}
	
	
	public void withdraw() 
	{
		Scanner sc2=new Scanner(System.in);
		if(alist.isEmpty())
		{
			System.out.println("List is empty..!");
		}
		else
		{
			System.out.println("Enter account id :");
			int id=sc2.nextInt();
			
			boolean flag=false;
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getAcc_ID()==id)
				{
					float bal =alist.get(i).getAcc_balance();
					System.out.println("Enter amount you want to withdraw :");
					float amount=sc2.nextFloat();
					
					if(bal<amount)
						System.out.println("You have insufficient balance");
					else
					{
						alist.get(i).setAcc_balance(bal-amount);
						System.out.println("Amount withdrawn");
					}
					
					flag=true;
					
					break;
				}
			}
			
			 if(flag==false) { System.out.println("Account not found..!"); }
			 
		}
		
		menu();
		sc2.close();
	}
	
	public void deposit() 
	{

		Scanner sc2=new Scanner(System.in);
		if(alist.isEmpty())
		{
			System.out.println("List is empty..!");
		}
		else
		{
			System.out.println("Enter account id :");
			int id=sc2.nextInt();
			
			boolean flag=false;
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getAcc_ID()==id)
				{
					float bal =alist.get(i).getAcc_balance();
					System.out.println("Enter amount you want to deposite :");
					float amount=sc2.nextFloat();
				
					alist.get(i).setAcc_balance(bal+amount);
					System.out.println("Amount Deposited");
					
					flag=true;
					
					break;
				}
			}
			
			 if(flag==false) { System.out.println("Account not found..!"); }
			 
		}
		
		menu();
		sc2.close();
	}

	
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		BankAccountList ba=new BankAccountList();
		ba.menu();
		scanner.close();
	}

}


