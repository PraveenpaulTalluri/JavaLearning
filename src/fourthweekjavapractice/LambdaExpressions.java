//Post Java 8: You can use lambda expression instead of anonymous inner classes.


package fourthweekjavapractice;

interface StringConcat {

    public String sconcat(String a, String b);
}


interface FunctionalInterface {

	//A method with single parameter
    public int decrementByTwo(int a);
}

interface FunctionalInterface2{

	//A method with no parameter
    public String sayHello();
}

public class LambdaExpressions {
	
	   public static void main(String args[]) {
		   
	      // lambda expression with multiple arguments
		   StringConcat s = (str1, str2) -> str1 + str2;
	       System.out.println("Result: "+s.sconcat("Hello ", "World"));
	        
	        
	     // lambda expression with single parameter number
	    	FunctionalInterface f = (number) -> number-2;
	        System.out.println(f.decrementByTwo(22));
	        
	     // lambda expression with no parameter
	    	FunctionalInterface2 msg = () -> {
	    		return "Hello";
	    	};
	        System.out.println(msg.sayHello());
	    }
	
}
