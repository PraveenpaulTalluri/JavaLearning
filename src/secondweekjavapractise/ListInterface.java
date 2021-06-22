package secondweekjavapractise;
import java.util.*;
public class ListInterface {
	
	static void Swap(List<Integer> al,int i,int j)
	{
		int temp=al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
		System.out.println(al);
		
	}
	
	public static void main(String args[])
	{
		List<Integer>al=new ArrayList<>();
		//Generic Arraylist with the given capacity
		//List<Integer> numbers = new ArrayList<>(6); 
		 
		//Generic Arraylist initialized with another collection
		//List<Integer> numbers = new ArrayList<>( Arrays.asList(1,2,3,4,5) ); 
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		System.out.println(al.size());
		List<Integer>al2=new ArrayList<>();
		al2.addAll(al);
		Swap(al2,4,8);
		
		//using iterator
		Iterator<Integer> iterator = al2.iterator();
		 
		while(iterator.hasNext()) 
		{
		    System.out.println(iterator.next());
		}
		
		Collections.sort(al2);
		System.out.println(al2);
		
		
	}

}
