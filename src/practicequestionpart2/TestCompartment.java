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
