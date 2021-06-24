package secondweekjavapractise;
import java.util.*;

public class LinkedListExample  {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<>();
		String[]arr= {"hello","Rajahmundry"};
		
		ll.add("i");
		ll.add("am");
		ll.add("a");
		ll.add("rider");
		System.out.println("List-1 : "+ll+" Size : "+ll.size());
		//ll.add(null);// null values are also allowed
		ll.add("i"); //duplicates are allowed
		System.out.println(ll); 
		
		
		LinkedList<String> ll2=new LinkedList<>(Arrays.asList(arr));
		System.out.println(ll2);
		
		ll2.addFirst("Hai");
		ll2.addLast("ap");
		System.out.println(ll2);
		
		System.out.println(ll2.contains("hello"));
		ll2.remove("Rajahmundry");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf("am"));
		System.out.println(ll.lastIndexOf("i"));
		System.out.println(ll.subList(0, 3));
		System.out.println("At the Index 3 : "+ll.get(3));
		
		Collections.sort(ll);
		
		Iterator<String> iterator=ll.listIterator();
		while(iterator.hasNext()) {System.out.println(iterator.next());}
		
		String []arr2=ll.toArray(new String[0]);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[1]);
	}

}
