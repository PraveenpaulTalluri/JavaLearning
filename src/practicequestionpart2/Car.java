package practicequestionpart2;

public class Car {
	int speed;
	int noOfGears;
	
	void drive(int speed,int noOfGears)
	{
		 this.speed=speed;
		 this.noOfGears=noOfGears;
	}
	
	void display()
	{
		System.out.println("Initial speed :"+speed+"kmph");
		System.out.println("Initial gear :"+noOfGears);
	}

}

