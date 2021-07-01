package practisequestions;
import java.util.*;
public class LuckySum {
	
	static int luckySum(int a, int b, int c)
	{
		return (a==13)?0:(b==13?a:(c==13)?(a+b):(a+b+c));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 intergers : ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		System.out.println(luckySum(a,b,c));
		
		scanner.close();
	}

}
