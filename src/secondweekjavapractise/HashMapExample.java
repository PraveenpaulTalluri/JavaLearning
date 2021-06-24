package secondweekjavapractise;
import java.util.*;
public class HashMapExample {
	
	static void FindFrequency()
	{
		final int n=5;
		Map<String,Integer>m=new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter %d Words : ",n);
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			Integer freq=m.get(s);
			m.put(s, freq==null?1:freq+1);
		}
		System.out.println(m);
		sc.close();
	}
	public static void main(String[] args) {
		Map<Integer,String>hm=new HashMap<>();
		Map<Integer,String>lhm=new LinkedHashMap<>();
		
		hm.put(000, "Praveen");
		hm.put(001, "Paul");
		hm.put(002, "Harsha");
		
		lhm.put(000, "Praveen");
		lhm.put(001, "Paul");
		lhm.put(002, "Harsha");
		
		/*
		 * for(Map.Entry m:hm.entrySet()){
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 * 
		 * for(Map.Entry m:lhm.entrySet()){
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */
		 
		System.out.println(hm); //order Unpredictable
		System.out.println(lhm); //follows insertion order
		FindFrequency();
	}

}
