package firstweekjavapractise;


class Test{
	int x;
	int y;
}

 class Test2 implements Cloneable{
	Test t=new Test();
	int a;
	int b;
	public  Object clone() throws  CloneNotSupportedException
	{
		return super.clone();
	}
}
public class objectEquals {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Test2 t2=new Test2();
		t2.a=10;
		t2.b=20;
		t2.t.x=100;
		t2.t.y=200;
		Test2 t3=(Test2) t2.clone();
		
		System.out.println(t2.a +" "+ t2.b + " "+t2.t.x+ " "+ t2.t.y);
		
		
		System.out.println(t3.a +" "+ t3.b + " "+t3.t.x+ " "+ t3.t.y);
		
		t2.t.x=500;
		System.out.println(t3.a +" "+ t3.b + " "+t3.t.x+ " "+ t3.t.y);
		t2.a=800;
		System.out.println(t3.a +" "+ t3.b + " "+t3.t.x+ " "+ t3.t.y);
		System.out.println(t2.a +" "+ t2.b + " "+t2.t.x+ " "+ t2.t.y);
		
		t3.a=1;
		t3.t.x=2;
		System.out.println(t3.a +" "+ t3.b + " "+t3.t.x+ " "+ t3.t.y);
		System.out.println(t2.a +" "+ t2.b + " "+t2.t.x+ " "+ t2.t.y);
		System.out.println(t2.toString());
		
		
	}

}
