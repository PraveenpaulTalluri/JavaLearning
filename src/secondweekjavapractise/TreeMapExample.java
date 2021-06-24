package secondweekjavapractise;
import java.util.*;
public class TreeMapExample {
	public static void main(String[] args) {
		Map<String,Integer>tm=new TreeMap<>();
		final int n=6;
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter %d Words : ",n);
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			Integer freq=tm.get(s);
			tm.put(s, freq==null?1:freq+1);
		}
		System.out.println(tm.size()+" distinct words with frequency : "+tm); //Prints the words in alphabetical order
		sc.close();
		
		Map<String,Integer>tm2=new TreeMap<>();
		tm2.putAll(tm);
		System.out.println(tm2);
		
		for(String key:tm2.keySet()) {System.out.println(key);}
		for(Integer value:tm2.values()) {System.out.println(value);}
		
		for(Iterator<String>it=tm.keySet().iterator();it.hasNext();) {if(it.next().length()>2) {it.remove();}}
		System.out.println(tm);
	}

}
