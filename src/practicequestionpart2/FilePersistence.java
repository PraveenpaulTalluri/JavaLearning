/*4.	Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. The base class with have an abstract method persist() which will be overridden by its sub classes. 
Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database
*/
package practicequestionpart2;

public class FilePersistence extends Persistence{
	void persist()
	{
		System.out.println("Succesfully saved into files");
	}

}
