package practicequestionpart2;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape shape[]=new Shape[4];
		shape[0]=new Line();
		shape[0].draw();
		
		shape[1]=new Rectangle();
		shape[1].draw();
		
		shape[2]=new Cube();
		shape[2].draw();
		
		shape[3]=new Triangle();
		shape[3].draw();
		
	}

}
