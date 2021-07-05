package practicequestionpart2;
import java.lang.Math;

public class TestMedicine{
	public static void main(String[] args) {
		Medicine medicine[]=new Medicine[10];

		int min=1;
		int max=3;
		
		  
		
		for(int i=0;i<10;i++)
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


