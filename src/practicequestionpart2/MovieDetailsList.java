/*10.	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actrress, and genre  add setter and getter method in that class. 
•         After creating this class create class Movie_DetailsList class who will maintain all the objects.
•         Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
•         Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 
*/

package practicequestionpart2;

import java.util.*;

class NameSorter implements Comparator<Movie_Details> 
{
   
    public int compare(Movie_Details o1, Movie_Details o2) {
        return o1.getMovie_Name().compareToIgnoreCase(o2.getMovie_Name());
    }
}

class GenreSorter implements Comparator<Movie_Details> 
{
   
    public int compare(Movie_Details o1, Movie_Details o2) {
        return o1.getGenre().compareToIgnoreCase(o2.getGenre());
    }
}

public class MovieDetailsList {
	
	ArrayList<Movie_Details> alist=new ArrayList<>();
	
	void add_movie()
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter movie name:");
		String name=sc1.nextLine();
		
		System.out.println("Enter lead Actor:");
		String actor=sc1.nextLine();
		
		System.out.println("Enter lead Actress:");
		String actress=sc1.nextLine();
		
		System.out.println("Enter movie Genre:");
		String genre=sc1.nextLine();
		
		Movie_Details md1=new Movie_Details(name,actor,actress,genre);
		alist.add(md1);
		
		menu();
		sc1.close();
	}
	
	void remove_movie()
	{
		Scanner sc2=new Scanner(System.in);
		
		if(alist.isEmpty())
		{
			System.out.println("List is empty..!");
		}
		else
		{
			boolean flag=false;
			System.out.println("Enter movie name:");
			String name=sc2.next();
			
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getMovie_Name().equals(name))
				{
					alist.remove(i);
					flag=true;
				}
			}
			if(flag==false)
				System.out.println("Movie not found");
		}
		
		menu();
		sc2.close();
	}
	
	void remove_allMovies()
	{
		if(alist.isEmpty())
			System.out.println("List is empty..!");
		else
			alist.clear();
		
		menu();
	}
	
	void find_movie_by_movieName()
	{
		Scanner sc=new Scanner(System.in);
		
		if(alist.isEmpty())
		{
			System.out.println("List is empty..!");
		}
		else
		{
			boolean flag=false;
			System.out.println("Enter movie name: ");
			String name=sc.nextLine();
			
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getMovie_Name().equals(name))
				{
					flag=true;
					System.out.println(alist.get(i));
				}
			}
			if(flag==false)
				System.out.println("Movie not found");
		}
		
		menu();
		sc.close();
	}
	
	void find_movie_by_Genre()
	{
		Scanner sc=new Scanner(System.in);
		
		if(alist.isEmpty())
		{
			System.out.println("List is empty..!");
		}
		else
		{
			boolean flag=false;
			System.out.println("Enter movie Genre: ");
			String genre=sc.nextLine();
			
			for(int i=0;i<alist.size();i++)
			{
				if(alist.get(i).getGenre().equals(genre))
				{
					System.out.println(alist.get(i));
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println("Movie Not Found");
			}
		}
		
		menu();
		sc.close();
	}
	
	void sortByField(int arg)
	{
		if(alist.isEmpty())
		{
			System.out.println("List is Empty..!");
		}
		else
		{
			if(arg==0)
			{
				Collections.sort(alist,new NameSorter());
				
				for(Movie_Details m:alist)
					System.out.println(m);
			}
			else if(arg==1)
			{
				Collections.sort(alist,new GenreSorter());
				
				for(Movie_Details m:alist)
					System.out.println(m);
			}
			else
				System.out.println("Invalid option..!");
			
		}
		
		menu();
	}
	
	void display()
	{
		if(alist.isEmpty())
			System.out.println("List is empty");
		else
			for(Movie_Details m:alist)
				System.out.println(m);
		
		menu();
		
	}
	void menu() throws InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("         Select an operation         ");
		System.out.println("Press 1: To add movie");
		System.out.println("Press 2: To remove movie");
		System.out.println("Press 3: To remove all movies");
		System.out.println("Press 4: To find movie by movie name");
		System.out.println("Press 5: To find movie by movie Genre");
		System.out.println("Press 6: To sort movies");
		System.out.println("Press 7: To view movies availale");
		System.out.println("Press any other key to exit");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:add_movie();
				break;
		case 2:remove_movie();
				break;
		case 3:remove_allMovies();
				break;
		case 4:find_movie_by_movieName();
				break;
		case 5:find_movie_by_Genre();
				break;
		case 6:
				System.out.println("Enter '0' to sort by Movie Name OR Enter '1' to sort by Genre");
				int arg=sc.nextInt();
				sortByField(arg);
				break;
		case 7: display();
				break;
		default: System.out.println("Exit");
		}
		sc.close();
	}
	
	
	public static void main(String args[])
	{
		MovieDetailsList md= new MovieDetailsList();
		md.menu();
	}

}
