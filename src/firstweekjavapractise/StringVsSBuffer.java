package firstweekjavapractise;

public class StringVsSBuffer {
	public static void str(String s)
	{
		s=s+"is a programmer";
		
	}
	static void sbuffer(StringBuffer sb)
	{
		sb.append("is a programmer");
		
	}
	static void sbuilder(StringBuilder sb)
	{
		sb.append("is a programmer");
		
	}
	public static void main(String args[])
	{
		String s1="Praveen";
		StringBuffer s2=new  StringBuffer("Praveen"); // default capacity is 16 and are thread safe
		StringBuilder s3=new StringBuilder("Praveen");// not thread safe.
		
		str(s1);
		sbuffer(s2);
		sbuilder(s3);
		System.out.println(s1);// Strings are immutable
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
	}
}
