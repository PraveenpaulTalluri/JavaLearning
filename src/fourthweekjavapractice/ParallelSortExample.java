package fourthweekjavapractice;
import java.util.*;
public class ParallelSortExample {
	public static void main(String[] args) {
		String cities[] = {"NewYork","Hyderabad", "Rajahmundry","Konthamru","Pune","Lonovala"};
		
		//Parallel Sort method for sorting int array
		Arrays.parallelSort(cities);
		
		//converting the array to stream and displaying using forEach
		Arrays.stream(cities).forEach(c->System.out.print(c+" "));
	    }

}
