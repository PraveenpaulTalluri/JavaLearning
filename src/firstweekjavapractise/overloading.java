package firstweekjavapractise;
class pubg{  
static int Drop(int AKM,int Granade){return AKM+Granade;}  
static int Drop(int AKM,int Thompson,int AWM){return AKM+Thompson+AWM;}  
}  
public class overloading {
	public static void main(String args[])
	{
	
		System.out.println("Total Ammo : "+pubg.Drop(10,20));
		System.out.println("Total Ammo in lastZone : "+pubg.Drop(50,60,80));
	}

}
