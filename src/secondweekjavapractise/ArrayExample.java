package secondweekjavapractise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	 static void ArrayDeclaration()
		{
			boolean arrBoolean[]= {true,false};
			byte arrByte[]= {123,12,1};       //8 bit
			short arrShort[]= {12345,320,32,3};//16bit
			char arrChar[]= {'P','r','a','v','e','e','n'};
			int arrInt[]= {123456,2000,30};    //32bit
			long aarLong[]= {123456789L,12345678L};//64bit
			float arrFloat[]= {0.2f,4.5f};//32bit
			double arrDouble[]= {0.23,2.56};//64bit
			//String arrString[]= {"Praveen","Paul"};
			
			
			System.out.println(Arrays.toString(arrBoolean));
			System.out.println(Arrays.toString(arrByte));
			System.out.println(Arrays.toString(arrShort));
			System.out.println(Arrays.toString(arrChar));
			System.out.println(Arrays.toString(arrInt));
			System.out.println(Arrays.toString(aarLong));
			System.out.println(Arrays.toString(arrFloat));
			System.out.println(Arrays.toString(arrDouble));
		}
		 
		 static void MultiDimArrayDeclaration()
		 {
			 String MultiArr[][]= { {"Mr.","Ms."},
					 				{"Praveen","Honey"} };
			 
			 System.out.println(Arrays.toString(MultiArr[0]));
			 System.out.println(Arrays.toString(MultiArr[1]));
			 System.out.println(MultiArr[0][0]+MultiArr[1][0]);
		 }
		 
		 static void OperationsOnArray() 
		 {
			 
				
				
				Scanner sc= new Scanner(System.in);
				
				//declaring an array with size
				int arr[]=new int[5];
				System.out.println("Length of the Arrays is : "+arr.length);
				System.out.println("Enter Elements into the array : ");
				
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				
				// Sorts an array in ascending order.We can also use parallelSort()
				Arrays.sort(arr);
				System.out.println("The Sorted Array is : "+Arrays.toString(arr));
				
				System.out.println("Enter the Element you want to for ");
				int key=sc.nextInt();
				sc.close();
				
				int temp=Arrays.binarySearch(arr, key);
				if(temp>0) {
					
					//Searches for the specified key value in the given SortedArray
					System.out.println("The Searched element is at the index of : "+Arrays.binarySearch(arr, key));
				}
				else {System.out.println("Element not found");}
				 
				
				//Cloning an array
				int[] CloneArray=arr.clone();
				System.out.println("The CLonedArray is : "+Arrays.toString(CloneArray));
				
		 }

		public static void main(String[] args) {
			OperationsOnArray();
			
			ArrayDeclaration();
			
			MultiDimArrayDeclaration();
			
			
			

		}


}
