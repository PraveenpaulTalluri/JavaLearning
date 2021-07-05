package practicequestionpart2;

public class SportCar extends Car{
	
	String airBallonType="Dual Air Ballons";
	
	void display()
	{
		System.out.println("No of AirBags :"+airBallonType);
	}
	
	public static void main(String args[])
	{
		Car car=new Car();
		car.drive(20, 6);
		car.display();
		SportCar sportcar=new SportCar();
		sportcar.display();
	}
}
