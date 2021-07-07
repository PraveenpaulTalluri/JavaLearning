package fourthweekjavapractice;
import java.util.*;
public class ForEachMethod {
	
	public static void main(String[] args) {
		
		List<String> states= new ArrayList<>();
		
		states.add("Andhra");
		states.add("Telangana");
		states.add("Kerala");
		states.add("Tamil nadu");
		states.add("Punjab");
		
		states.forEach(
				(names)->System.out.println(names)
				);
	}
}
