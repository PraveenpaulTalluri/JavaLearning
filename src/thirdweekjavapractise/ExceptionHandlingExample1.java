package thirdweekjavapractise;
import java.util.*;
public class ExceptionHandlingExample1 {
	
	public static void division(int a, int b)
	{
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {System.out.println("Zero division is undefined "+e);}
		
	}
	public static void getElement(int array[],int index)
	{
		try {
			System.out.println(array[index]);
		}catch(ArrayIndexOutOfBoundsException e) {System.out.println("Index exceeds array size "+e);}
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("For the division a/b, Enter the digits a & b : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		division(a,b);
		
		System.out.println("Enter the size of array : ");
		int sizeOfArray=scanner.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.printf("Enter %d elements into the array :",sizeOfArray);
		for(int i=0;i<sizeOfArray;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the index at which you want to fetch the element from the array : ");
		int index=scanner.nextInt();
		getElement(array,index);
		scanner.close();
	}

}
