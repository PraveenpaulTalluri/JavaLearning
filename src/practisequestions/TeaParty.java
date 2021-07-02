package practisequestions;
import java.util.*;
public class TeaParty {
	
	
	static int teaParty(int tea, int candy)
	{	
		if(tea<5 || candy<5)
			return 0;
		else if(tea<(candy*2) && candy<(tea*2))
			return 1;
		else
			return 2;
		
		//return (tea<5||candy<5)?0:(tea<(candy*2) && candy<(tea*2))?1:2;
	}
	
	public static void main(String[] args) throws InputMismatchException{
		Scanner scanner =new Scanner(System.in);
		
		try {
			System.out.println("Enter amount of tea :");
			int tea=scanner.nextInt();
			
			System.out.println("Enter amount of candy : ");
			int candy=scanner.nextInt();
			
			System.out.println(teaParty(tea,candy));
			
		}
		catch(InputMismatchException e) {System.out.println("Invalid Input Format");}
		scanner.close();
	}

}
