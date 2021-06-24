package secondweekjavapractise;
import java.util.*;
public class QueueExample {
	static void Countdown() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the timer range : ");
		 int time = Integer.parseInt(sc.nextLine());
	        Queue<Integer> queue = new LinkedList<Integer>();

	        for (int i = time; i >= 0; i--)
	            queue.add(i);

	        while (!queue.isEmpty()) {
	            System.out.println(queue.remove());
	            Thread.sleep(1000);
	        }sc.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Countdown();
		
		Queue<Integer> q1=new LinkedList<>();
		for(int i=0;i<10;i++)
		{
			q1.offer(i);
		}
		for(int i=0;i<q1.size();) {System.out.println(q1.peek());q1.remove();}
		
	}
		
	

}
