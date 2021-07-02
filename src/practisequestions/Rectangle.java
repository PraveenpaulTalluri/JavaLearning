package practisequestions;


public class Rectangle {
	double length;
	double breadth;
	
	public Rectangle() {
		this.length=0;
		this.breadth=0;
	}

	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	}
	
	
	double area(double length,double breadth)
	{
		return length*breadth;
	}
	
	void display()
	{
		System.out.println("Length of the rectangle is: "+length);
		System.out.println("Breadth of the rectangle is: "+breadth);
		System.out.println("Area of rectangle is: "+area(length,breadth)+"\n");
	}
	

}
