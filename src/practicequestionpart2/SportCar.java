
/*
1.	Create a class Car which contains members speed, noOfGear. The class has a method drive() which is responsible to provide starting speed and noOfGears to a Car.  Implement display() method which will display all attributes of Car class.
-	The class SportCar is derived from the class Car which adds new features AirBallonType. When this method is invoked, initial speed and gear status must be displayed on console.  Override the display method which display all attribute of the SportCar. Make use of super class display() method.
*/
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
