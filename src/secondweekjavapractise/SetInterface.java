package secondweekjavapractise;
import java.util.*;
//import java.util.stream.*;

public class SetInterface {
	static void BulkOperation(Set<String> s1)
	{
		System.out.println("******Start of BulkOperation method ******");
		System.out.println(s1.contains("i"));
		Set<String>s2= new HashSet<>();
		s2.add("can");
		s2.add("see");
		
		System.out.println(s1.containsAll(s2)); //returns true if s2 is a subset of s1.
		
		s2.addAll(s1);  //  transforms s2 into the union of s1 and s2.
		System.out.println(s2);
		
		s1.add("sandy");
		s2.remove("and");
		s2.add("London");
		s2.add("NewYork");
		s1.retainAll(s2);  //transforms s1 into the intersection of s1 and s2. 
		System.out.println(s1);
		
		s2.removeAll(s1);// s2=s2-s1
		System.out.println(s2);
		
		
		System.out.println("------End of BulkOperation method------- ");
	}
	
	    public static void main(String[] args) {
	    	String[] s1= {"I","can","see","and","I","can","walk"};
	    	
	    	Set<String>distinctWords= new HashSet<>();
	    	
	       // Set<String> distinctWords = Arrays.asList(s1).stream().collect(Collectors.toSet()); 
	    	
	    	for(String s:s1)
	    	{
	    		distinctWords.add(s);
	    	}
	        System.out.println("HashSet Size is : "+distinctWords.size()+  " and distinct words: " +  distinctWords);
	        
	        Set<String> ts=new TreeSet<>();
			for(String s:s1) {ts.add(s);}
			System.out.println("TreeSet: "+ts); //TreeSet returns elements in ascending alphabetical order
	        
			 Set<String> lhs=new LinkedHashSet<>();
				for(String s:s1) {lhs.add(s);}
				System.out.println("LinkedHashSet: "+lhs); //LinkedHashSet preserves the order in which the elements were inserted
			
	        System.out.println(distinctWords.isEmpty());
	        distinctWords.add("Candy");
	        System.out.println(distinctWords.size()+  " distinct words: " +  distinctWords);
	        
	        
	        System.out.println(distinctWords.add("i"));
	        System.out.println(distinctWords.add("I"));
	        BulkOperation(distinctWords);
	        
	        System.out.println(distinctWords.remove("i"));
	        
	        
	    }
	    
	
	
}
