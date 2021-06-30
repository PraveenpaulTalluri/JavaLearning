package thirdweekjavapractise;

import java.io.*;

public class TryWithResourceExample {
	static String readFirstLineFromFile(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}
	public static void main(String args[]) throws IOException
	{
		String firstLine=readFirstLineFromFile("C://Users//praveen_t//eclipse-workspace//FirstMonthJava//OutFile.txt");
		System.out.println(firstLine);
	}

}
