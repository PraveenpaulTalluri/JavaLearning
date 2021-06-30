package thirdweekjavapractise;


class Demo1 implements AutoCloseable  //since we have created custom resources we have to implement AutoCloseable interface
{
	void show1()
	{
		System.out.println("Demo1 show method opened");
	}
	
	public void close()
	{
		System.out.println("Demo1 close method opened");
	}
	
}

class Demo2 implements AutoCloseable  //since we have created custom resources we have to implement AutoCloseable interface
{
	void show2()
	{
		System.out.println("Demo2 show method opened");
	}
	
	public void close()
	{
		System.out.println("Demo2 close method opened");
	}
	
}
public class TryWithMultipleResources {
	public static void main(String[] args) {
		 try(Demo1 demo1 = new Demo1(); Demo2 demo2 = new Demo2()) //the resources will be closed in the reverse oder in which they were created.
	        {
	            int x = 10/0;
	            System.out.println(x);
	            demo1.show1();
	            demo2.show2();
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println(e);
	        }
	}

}
