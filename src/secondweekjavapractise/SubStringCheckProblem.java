package secondweekjavapractise;
import java.util.*;

public class SubStringCheckProblem {
	
	static void check(String[] arrayOfStrings,int noOfStrings)
	{
		for(int i=0;i<noOfStrings-1;i++)
		{
			for(int j=i+1;j<noOfStrings;j++)
			{
			
				
				  if(arrayOfStrings[j].contains(arrayOfStrings[i])) {
				  System.out.println("["+i+","+j+"]"); }
				  else if(arrayOfStrings[i].contains(arrayOfStrings[j])) {
				  System.out.println("["+j+","+i+"]"); }
				 
			}
			
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of Strings: ");
		int noOfStrings=sc.nextInt();
		
		String []arrayOfStrings=new String[noOfStrings];
		System.out.println("Enter Strings into the array: ");
		
		for(int i=0;i<noOfStrings;i++)
		{
			arrayOfStrings[i]=sc.next();
		}
		
		check(arrayOfStrings,noOfStrings);
		
		sc.close();
		
	}
			

}
