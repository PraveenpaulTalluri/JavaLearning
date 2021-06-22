package secondweekjavapractise;
import java.util.*;

public class ArrayListExample {
	static void ArrayListMethodsImplemtation(List<Integer> al)
	{
		for(int i=0;i<=20;i++) {
		al.add(i);
		}
		System.out.println("List-1 : "+al);
		
		List<Integer> al2=new ArrayList<>();
		for(int i=10;i<=30;i++)
		{
			al2.add(i);
		}
		System.out.println("List-2 : "+al2);
		
		List<Integer>al3=new ArrayList<>();
		al3.addAll(al);
		System.out.println("List-3 : "+al3);
		al.add(999);
		System.out.println(al3);
		al.remove(al.indexOf(999));
		
		
		al3.addAll(4,al2);
		System.out.println("Modified List-3 : "+al3);
		al3.clear();
		System.out.println(al3);
		
		System.out.println(al.contains(15));
		System.out.println(al3.containsAll(al));
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("A","B","C","D")); 
	       //1 
	       names.forEach(name -> System.out.println(name.toLowerCase()));
	 
	       
	       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	        numbers.removeIf( number -> number%2 == 0 );   
	        System.out.println(numbers);
	        
	        
	        
	}
	public static void main(String args[])
	{
		List<Integer> al=new ArrayList<>();
		ArrayListMethodsImplemtation(al);
	}

}
