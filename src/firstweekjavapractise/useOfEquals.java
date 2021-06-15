package firstweekjavapractise;

public class useOfEquals {
	public static void main(String args[])
	{
		String s1="Praveen";
		String s2="Praveen";
		String s3= new String("Praveen");
		//String s4=new String();
		
		System.out.println(s1==s2);
		System.out.println(s2==s1);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
	}

}
