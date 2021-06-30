package secondweekjavapractise;
import java.util.*;
public class SetsExample1 {
	
	
	//This is to separate repeated word and non-repeated words using sets
	public static void main(String[] args) {
		String[] cities= {"newyork","London","france","new","London"};
		Set<String>unique=new HashSet<>();
		Set<String>dup=new HashSet<>();
		
		for(String s1:cities)
		{
			if(!unique.add(s1)) {dup.add(s1);}
		}
		
		unique.removeAll(dup);
		System.out.println("The unique words are : "+unique);
		System.out.println("The repeated words are: "+dup);
	}

}
