package secondweekjavapractise;

import java.util.*;
public class StringBufferVSStringBuilder {
	
	
	/*
	 * If we are in a single-threaded environment or don’t care about thread
	 * safety, ywe should use StringBuilder. Otherwise, use StringBuffer for
	 * thread-safe operations.
	 */
	
	public static void main(String[] args) {
		
		long start=new GregorianCalendar().getTimeInMillis();
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();  //Here if we run in singled threaded string builder gave better performance than buffer. This is due to synchronization of buffer
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		long end=new GregorianCalendar().getTimeInMillis();
		
		System.out.println("Time Taken:"+(end-start));
		
	}
}

