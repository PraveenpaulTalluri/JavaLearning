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
