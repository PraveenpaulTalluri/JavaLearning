package secondweekjavapractise;
import java.util.*;

public class SubStringCheckProblem {
	/*
	 * static boolean check(String a,String b) { boolean flag=b.contentEquals(a);
	 * return flag; }
	 */
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of Strings: ");
		int noOfStrings=sc.nextInt();
		
		String []arrayOfStrings=new String[noOfStrings];
		//System.out.println(arrayOfStrings.length);
		
	
		
		for(int i=0;i<noOfStrings;i++)
		{
			//System.out.println(i);
			
			arrayOfStrings[i]=sc.next();
		}
		
		//System.out.println(Arrays.toString(arrayOfStrings));
		
		
		
		//String sortedArray[]=
			//	Arrays.sort(arrayOfStrings);
		
		System.out.println(arrayOfStrings[1].contains(arrayOfStrings[0]));
		for(int i=0;i<noOfStrings-1;i++)
		{
			//System.out.println(i);
			for(int j=i+1;j<noOfStrings;j++)
			{
				//System.out.print(j);
				
				  if(arrayOfStrings[j].contains(arrayOfStrings[i])) {
				  System.out.println("["+i+","+j+"]"); }
				  else if(arrayOfStrings[i].contains(arrayOfStrings[j])) {
				  System.out.println("["+j+","+i+"]"); }
				 
			}
			//System.out.println();
			
		}
		sc.close();
		
	}
			

}
