package practisequestions;
import java.util.*;
public class LuckySum {
	
	static int luckySum(int a, int b, int c)
	{
		if(a==13)
			return 0;
		else if(b==13)
			return a;
		else if(c==13)
			return a+b;
		else
			return a+b+c; 

	}
	
	public static void main(String[] args) throws InputMismatchException {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter 3 intergers : ");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=scanner.nextInt();			
			System.out.println(luckySum(a,b,c));
		}
		catch(InputMismatchException e) {System.out.println(" Invalid input format : "+e);}
		
		
		scanner.close();
	}

}
