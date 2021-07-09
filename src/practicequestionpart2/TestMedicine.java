/*1.	Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company. 
-	Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.
-	Create a class TestMedicine . Write main function to do the following:
-	Declare an array of Medicine references of size 10
-	Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
-	Refer Java API Documentation to find out random generation feature. 
-	Check the polymorphic behavior of the displayLabel() method.
*/

package practicequestionpart2;
import java.lang.Math;

public class TestMedicine{
	public static void main(String[] args) {
		Medicine medicine[]=new Medicine[10];

		int min=1;
		int max=3;
		
		  
		
		for(int i=0;i<9;i++)
		{
			int b = (int)(Math.random()*(max-min+1)+min);
			switch(b) {
			
			case 1:
				medicine[i]=new Medicine();
				medicine[i].displayLabel();
				medicine[i+1]=new Ointment();
				medicine[i+1].displayLabel();
				break;
			
			case 2:
				 medicine[i]=new Medicine();
				 medicine[i].displayLabel();
				 medicine[i+1]=new Syrup();
				 medicine[i+1].displayLabel();
				 break;
			
			case 3:
				 medicine[i]=new Medicine();
				 medicine[i].displayLabel();
				 medicine[i+1]=new Tablet();
				 medicine[i+1].displayLabel();
				 break;
			}
			System.out.println();
		}
	
		
	}
}


