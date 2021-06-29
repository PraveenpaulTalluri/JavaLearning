package thirdweekjavapractise;
import java.io.*;
import java.util.*;
public class ExceptionHandlingExample {
	
	    private List<Integer> list;
	    private static final int SIZE = 10;

	    public ExceptionHandlingExample () {
	        list = new ArrayList<Integer>(SIZE);
	        for (int i = 0; i < SIZE; i++) {
	            list.add(i);
	        }
	    }
	    public static void main(String[] args) {
	    	ExceptionHandlingExample obj=new ExceptionHandlingExample();
			obj.writeList();
		}

	    public void writeList() {
	    	PrintWriter out =null;
	    	try {
	    		// The FileWriter constructor throws IOException, which is checked Exception
	    		out = new PrintWriter(new FileWriter("OutFile.txt"));

	    		for (int i = 0; i < SIZE; i++) {
	            // The get(i) method throws IndexOutOfBoundsException, which must be caught.
	    			out.println("Value at: " + i + " = " + list.get(i));
	    		}
	        
	    	}
	        catch (IndexOutOfBoundsException e) {
	            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
	        } 
	    	catch (IOException e) {
	            System.out.println("Caught IOException: " + e.getMessage());
	        }
	    	finally {
	    	    if (out != null) { 
	    	        System.out.println("Closing PrintWriter");
	    	        out.close(); 
	    	    } else { 
	    	        System.out.println("PrintWriter not open");
	    	    } 
	    	} 

	    }
	
}
