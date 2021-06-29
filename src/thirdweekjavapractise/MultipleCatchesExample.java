package thirdweekjavapractise;
import java.util.*;
public class MultipleCatchesExample {
	
	
	public static void checkDivisibility(int array[],int index)
	{
		try {
			for(int i=0;i<array.length && i!=index;i++)
			{
				if(array[i]%array[index] ==0) {System.out.printf("%d properly divides %d",array[index],array[i]);}
				else {System.out.printf("%d cannot properly divides %d",array[index],array[i]);}
				System.out.println();
			}
		}
		//catch(Exception e) {System.out.println(e);}
		/*
		 * this will give a compilation error since all kinds of exceptions are handled
		 * by the above exception class and the below catch is not reachable, this kind
		 * of catch is a bad practice
		 */
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {System.out.println(e);} 
		//java7 and later allows this type of multiple exceptions in single catch
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of any array : ");
		int sizeOfArray=scanner.nextInt();
		if(sizeOfArray<=0) {System.out.println("Array size cannot be 0");}
		else {
		
			int array[]=new int[sizeOfArray];
		
			System.out.printf("Enter %d elements into the array :",sizeOfArray);
			for(int i=0;i<sizeOfArray;i++)
			{
				array[i]=scanner.nextInt();
			}
			for(int i=0;i<sizeOfArray;i++)
			{
				System.out.println("Element at index "+i+" is: "+array[i]);
			}
			
			if(sizeOfArray>1) {
				System.out.println("Enter the index of an element to check whether it can properly divide other elements :");
				int index=scanner.nextInt();
				checkDivisibility(array,index);
			}
		}
		scanner.close();
	}

}
