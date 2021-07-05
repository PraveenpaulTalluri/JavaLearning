/*6.	Create an abstract class Compartment to represent a rail coach. Provide a abstract function notice in this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the compartment.
-	Create a class TestCompartment . Write main function to do the following:
-	Declare an array of Compartment pointers of size 10.
-	Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
-	Check the polymorphic behavior of the notice method.
*/

package practicequestionpart2;
import java.lang.Math;
public class TestCompartment {
	public static void main(String[] args) {
		Compartment compartment[]=new Compartment[10];
		
		int min=1;
		int max=4;
		
		  
		
		for(int i=0;i<10;i++)
		{
			int b = (int)(Math.random()*(max-min+1)+min);
			switch(b) {
			
			case 1:
				compartment[i]=new FirstClass();
				compartment[i].notice();
				break;
			
			case 2:
				compartment[i]=new Ladies();
				compartment[i].notice();
				 break;
			
			case 3:
				compartment[i]=new General();
				compartment[i].notice();
				 break;
			case 4:
				compartment[i]=new Luggage();
				compartment[i].notice();
				break;
			}
			System.out.println();
		}
	}

}
