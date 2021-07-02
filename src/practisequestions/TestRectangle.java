package practisequestions;

public class TestRectangle {
	public static void main(String args[]) 
	{
		
		Rectangle rectangle1=new Rectangle(); 
		rectangle1.display();
		 
		Rectangle rectangle2= new Rectangle(5,5);
		rectangle2.display();
		
		Rectangle rectangle3= new Rectangle(1000289,545689);
		rectangle3.display();
		
		Rectangle rectangle4= new Rectangle(25,0.56);
		rectangle4.display();
		
		Rectangle rectangle5= new Rectangle(5.454,5);
		rectangle5.display();
	}

}
