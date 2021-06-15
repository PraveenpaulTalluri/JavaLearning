package firstweekjavapractise;
class BankLoan{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class CarLoan extends BankLoan{  
int getRateOfInterest(){return 8;}  
}  
  
class EducationLoan extends BankLoan{  
int getRateOfInterest(){return 7;}  
}  
class HouseLoan extends BankLoan{  
int getRateOfInterest(){return 9;}  
}  
public class overRiding {
	public static void main(String args[])
	{
		CarLoan c=new CarLoan();  
		EducationLoan e=new EducationLoan();  
		HouseLoan h=new HouseLoan();  
		System.out.println("CarLoan Rate of Interest: "+c.getRateOfInterest());  
		System.out.println("EducationLoan Rate of Interest: "+e.getRateOfInterest());  
		System.out.println("HouseLoan Rate of Interest: "+h.getRateOfInterest());  
	}

}
