/*4.	Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. 
The base class with have an abstract method persist() which will be overridden by its sub classes.
Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database.
*/
package practicequestionpart2;
import java.util.*;
public class TestPersistence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Persistence p[]=new Persistence[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Choose '1' if you want to store for long term else choose '2'");
			int choice=sc.nextInt();
			if(choice==1)
			{
				p[i]=new FilePersistence();
				p[i].persist();
			}
			else if(choice==2)
			{
				p[i]=new DatabasePersistence();
				p[i].persist();
			}
			else
			{
				System.out.println("Invalid option");
			}
		}
		
		
		sc.close();
	}

}
