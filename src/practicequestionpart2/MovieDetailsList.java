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
		String name=sc1.next();
		
		System.out.println("Enter lead Actor:");
		String actor=sc1.next();
		
		System.out.println("Enter lead Actress:");
		String actress=sc1.next();
		
		System.out.println("Enter movie Genre:");
		String genre=sc1.next();
		Movie_Details md1=new Movie_Details(name,actor,actress,genre);
		alist.add(md1);
		
		menu();
		sc1.close();
	}
	
	void remove_movie()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter movie name:");
		String name=sc2.next();
		
		//System.out.println("Enter lead Actor:");
		//String actor=sc2.next();
		
		//System.out.println("Enter lead Actress:");
		//String actress=sc2.next();
		
		//System.out.println("Enter movie Genre:");
		//String genre=sc2.next();
		
		if(alist.remove(alist.indexOf(name) ) != null)
			System.out.println("removed succesfully");
		else
			System.out.println("movie not found");
		
		menu();
		sc2.close();
	}
	
	void remove_allMovies()
	{
		alist.removeAll(alist);
		menu();
	}
	void find_movie_by_movieName()
	{
		
	}
	
	void find_movie_by_Genre()
	{
		
	}
	
	void sortByName()
	{
		alist.sort(new NameSorter());
		
		for(Movie_Details m:alist)
			System.out.println(m);
		menu();
	}
	
	void sortByGenre()
	{
		alist.sort(new GenreSorter());
		
		for(Movie_Details m:alist)
			System.out.println(m);
		menu();
	}
	
	void display()
	{
		if(alist.isEmpty())
			System.out.println("List is empty");
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
		System.out.println("Press 6: To sort by movie name");
		System.out.println("Press 7: To sort by movie genre");
		System.out.println("Press 8: To view movies availale");
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
		case 6:sortByName();
				break;
		case 7: sortByGenre();
				break;
		case 8: display();
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
