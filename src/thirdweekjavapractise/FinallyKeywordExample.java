package thirdweekjavapractise;

public class FinallyKeywordExample {
	public static void main(String[] args) {
		String name="Praveen";
		try {
			System.out.println(name.charAt(7));
		}catch(Exception e){System.out.println(e);}
		
		finally {
			System.out.println("Rest of the code");
		}
	}

}
