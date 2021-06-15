package firstweekjavapractise;

public class Main {
	int s=20;// instance variable
	static int a; // static variable
	void info() {
		
		char c='C'; //local variable
		System.out.println(s+" "+c);
	}
	public static void main(String args[])
	{
		
		Main m= new Main();
		m.info();
		System.out.println("Hai this is Bobby ");
		//System.out.println(s);//error
		m.s=30;
		System.out.println(m.s);
		System.out.println(a);
		
	}

}
