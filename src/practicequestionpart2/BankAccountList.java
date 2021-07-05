/*9.	Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
-	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/

package practicequestionpart2;

import java.util.*;


class SortbyID implements Comparator<SavingAccount> {
    // Used for sorting in ascending order of account ID
    public int compare(SavingAccount a, SavingAccount b)
    {
        return a.acc_ID - b.acc_ID;
    }
}


public class BankAccountList{
	
	 TreeSet<SavingAccount> tset=new TreeSet<>(new SortbyID());
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
		default: System.out.println("Exit");
		}
		menu();
		sc.close();
	}
	private void addInput() {
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter account ID: ");
		int id=sc1.nextInt();
		
		System.out.println("Enter account holder name: ");
		String name=sc1.next();
		
		System.out.println("Is this your salary account : Yes/No");
		
		String s=sc1.next();
		
		tset.add(new SavingAccount(0f,id,name,s,"add"));
		menu();
		sc1.close();
	}
	
	private void view() {
		
		for(SavingAccount s:tset)
		{
			System.out.println(s);
		}
	}
	
	
	public void withdraw() 
	{
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter account id :");
		int id=sc2.nextInt();
		
		System.out.println("Enter amount you want to withdraw :");
		float amount=sc2.nextFloat();
		
		boolean bool =tset.add(new SavingAccount(amount,id,"","false","withdraw"));
		
		if(!bool)
			System.out.println("You have insufficiant balance");
		else
			System.out.println("amount withdrawn");
		
		menu();
		sc2.close();
	}
	
	public void deposit() 
	{
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter account id :");
		int id=sc3.nextInt();
		
		System.out.println("Enter amount you want to Deposit :");
		float amount=sc3.nextFloat();
		
		tset.add(new SavingAccount(amount,id,"","false","deposit"));
		
		System.out.println("amount deposited");
		
		menu();
		sc3.close();
	}

	
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		BankAccountList ba=new BankAccountList();
		ba.menu();
		scanner.close();
	}

}
