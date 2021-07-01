package practisequestions;
import java.util.*;
public class TeaParty {
	
	
	static int teaParty(int tea, int candy)
	{	
		return (tea<5||candy<5)?0:(tea<(candy*2) && candy<(tea*2))?1:2;
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter amounts of tea and candy");
		int tea=scanner.nextInt();
		int candy=scanner.nextInt();
		
		System.out.println(teaParty(tea,candy));
		
		scanner.close();
	}

}
