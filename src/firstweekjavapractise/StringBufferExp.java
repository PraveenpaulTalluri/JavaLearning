package firstweekjavapractise;

public class StringBufferExp {
	
	
	static void buffer1(StringBuffer sb)
	{
		sb.append("It's the Month of June");
	}
	static void buffer2(StringBuffer sb)
	{
		sb.append(", Still it's raining..!");
	}
	
	static void buffer3(StringBuffer sb)
	{
		sb.delete(35,sb.length() );
	}
	
	static void buffer4(StringBuffer sb)
	{
		sb.deleteCharAt(3);
	}
	static void buffer5(StringBuffer sb)
	{
		sb.insert(0, 'O');
	}
	static void buffer6(StringBuffer sb)
	{
		char []arr= {'R','A','I','N','I','N','G'};
		sb.insert(35, arr);
	}
	static void buffer7(StringBuffer sb)
	{
		sb.reverse();
	}
	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer();
		System.out.println("Initial capacity: "+sb.capacity());
		//sb.ensureCapacity(40);
		//System.out.println("Updated Capacity : "+sb.capacity());
		buffer1(sb);
		System.out.println("Updated Capacity : "+sb.capacity());// capacity increases by (oldCapacity*2)+2
		System.out.println(sb);
		
		buffer2(sb);
		System.out.println("Updated Capacity : "+sb.capacity());
		System.out.println(sb);
		
		System.out.println("Length: "+sb.length());
		buffer3(sb);
		System.out.println("Updated Capacity : "+sb.capacity());
		System.out.println(sb);
		System.out.println("Length: "+sb.length());
		
		buffer4(sb);
		System.out.println("Length: "+sb.length());
		System.out.println(sb);
		
		buffer5(sb);
		System.out.println(sb);
		
		buffer6(sb);
		System.out.println(sb);
		
		buffer7(sb);
		System.out.println(sb);
	}

}

