/*5.	Create an abstract class Instrument which is having the abstract function play. Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message.
-	?Piano is playing  tan tan tan tan  ?  for Piano class
-	?Flute is playing  toot toot toot toot?  for Flute class
-	?Guitar is playing  tin  tin  tin ?  for Guitar class 
-	You must not allow the user to declare an object of Instrument class.
-	Create an array of 10 Instruments.
-	Assign different type of instrument to Instrument reference.
-	Check for the polymorphic behavior of  play method.

*/
package practicequestionpart2;

public class TestInstrument {
	public static void main(String args[])
	{
		Instrument instrument[]=new Instrument[10];
		instrument[0]=new Piano();
		instrument[0].play();
		
		instrument[1]=new Flute();
		instrument[1].play();
		
		instrument[2]=new Piano();
		instrument[2].play();
		
		instrument[3]=new Guitar();
		instrument[3].play();
		
		instrument[4]=new Flute();
		instrument[4].play();
		
		instrument[5]=new Piano();
		instrument[5].play();
		
		instrument[6]=new Guitar();
		instrument[6].play();
		
		instrument[7]=new Flute();
		instrument[7].play();
		
		instrument[8]=new Guitar();
		instrument[8].play();
		
		instrument[9]=new Piano();
		instrument[9].play();
	}

}
