package practisequestions;
import java.util.*;
public class IncomeTaxCalculator {
	
	static void slabA(double income)
	{
		final int taxPercentage=0;
		double tax=taxPercentage*income/100;
		System.out.println("Tax Payable : "+tax);
	}
	
	static void slabB(double income)
	{
		final int taxPercentage=10;
		double tax=taxPercentage*income/100;
		System.out.println("Tax Payable : "+tax);
	}
	static void slabC(double income)
	{
		final int taxPercentage=20;
		double tax=taxPercentage*income/100;
		System.out.println("Tax Payable : "+tax);
	}
	static void slabD(double income)
	{
		final int taxPercentage=30;
		double tax=taxPercentage*income/100;
		System.out.println("Tax Payable : "+tax);
	}
	
	public static void main(String[] args) throws InputMismatchException{
		Scanner scanner =new Scanner(System.in);
		
		try {
			
		System.out.println("Enter employee CTC : ");
		double income=scanner.nextDouble();
		if(income>=0 && income<180000)
			slabA(income);
		if(income>=180001 && income<=300000)
			slabB(income);
		if(income>=300001 && income<=500000)
			slabC(income);
		if(income>=500001 && income<=1000000)
			slabD(income);
		else
			System.out.println("Entered CTC is invalid or not acceptable by this tax calculator.");
		
		}catch(InputMismatchException e) {System.out.println("You have entered invalid input format for CTC");}
		scanner.close();
	}

}
