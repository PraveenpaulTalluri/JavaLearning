package secondweekjavapractise;
public class StringsUseCases {
	
	/*
	 * String is immutable in Java. So it’s suitable to use in a multi-threaded
	 * environment. We can share it across functions because there is no concern of
	 * data inconsistency.
	 */
	static void Concatination() throws NullPointerException {
		/*String+String - string+string produces a new string leaving the older ones in the garbage,
		 *which gets cleared later by JVM. 
		 *It internally gets converted to StringBuilder.append() and toString() methods.
		 */
		String s1="Praveen";
		String s2="Paul";
		 s1=s1+s2;
		System.out.println(s1);



		//String.concat() - Unlike string+string, if the object on which concat method is called is null, NullPointerException will be thrown.
		//String a = null, b="hello"; a.concat(b);

		//StringBuffer - They are mutable but they are slower as the methods inside them are synchronized and thread safe
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello").append("world");
		System.out.println(sb1.toString());

		//StringBuilder - They are mutable and faster than StringBuffer, but not thread safe
		StringBuilder sb2 = new StringBuilder();
		sb2.append("hello").append("world");
		sb2.toString();
		System.out.println(sb2.toString());

		/*String.join - If the strings to be concatenated is in the form of array,
		its better to use String.join rather than looping through the array and appending using a StringBuilder, 
		which String.join does it already internally. If the array passed is null, it throws NullPointerException.
		*/
		String[] b1 = {"hello", "world"};
		System.out.println(String.join("", b1));
		
	}
	public static void main(String args[])
	{
		String s="Praveen";
		String s1="Praveen"; // Doesn't create an extra memory for same literals
		System.out.println(s==s1);
		String s2= new String("Praveen"); //allocates a new location in heap memory
		System.out.println(s1==s2);
		
		System.out.println(s+" "+s1+" "+s2);
		Concatination();
	}

}
