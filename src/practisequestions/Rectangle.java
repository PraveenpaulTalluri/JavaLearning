package practisequestions;
import java.util.*;
public class Rectangle {
	float length;
	float breadth;
	
	private Rectangle() {
		area(length,breadth);
	}

	private Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	}
	
	
	double area(float length,float breadth)
	{
		return length*breadth;
	}
	
	void display()
	{
		System.out.println("Length of the rectangle is: "+length);
		System.out.println("Breadth of the rectangle is: "+breadth);
		System.out.println("Area of rectangle is: "+area(length,breadth));
	}
	
	
	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle : ");
		float length=scanner.nextFloat();
		float breadth=scanner.nextFloat();
		/*
		 * Rectangle rectangle=new Rectangle(); rectangle.display();
		 */
		Rectangle rectangle1= new Rectangle(length,breadth);
		rectangle1.display();
		
		scanner.close();
	}

}
