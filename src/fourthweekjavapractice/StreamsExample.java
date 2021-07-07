package fourthweekjavapractice;
import java.util.*;
import java.util.stream.Collectors;
public class StreamsExample {
	
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> items=new ArrayList<>();
		
		items.add("MilkShake");
		items.add("Cool drink");
		items.add("Milk Biscuit");
		items.add("DairyMilk");
		items.add("Milk Powder");
		
		System.out.println("Enter prefix with which you want to filter items: ");
		String prefix=sc.next();
		List<String> filteredList = items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
		
		
		filteredList.forEach(
				names->System.out.println(names)
				);
		sc.close();
	}

}
