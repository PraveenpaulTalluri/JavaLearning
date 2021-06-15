package firstweekjavapractise;
class mobiles{
	void ring()
	{
		System.out.println("Ringing");
	}
}

class specs extends mobiles
{
	void gameready()
	{
		System.out.println("yes.! game ready");
	}
	}

class Honor extends specs{
	void displaytype()
	{
		System.out.println("UHD");
	}
}
public class hierarical {
	public static void main(String args[])
	{
		Honor h=new Honor();
		h.displaytype();
		h.gameready();
		h.ring();
	}

}
