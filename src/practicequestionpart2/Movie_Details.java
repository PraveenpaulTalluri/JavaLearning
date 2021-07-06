package practicequestionpart2;

public class Movie_Details {
	String movie_Name;
	String lead_Actor;
	String lead_Actress;
	String genre;
	
	
	public Movie_Details(String movie_Name, String lead_Actor, String lead_Actress, String genre) {
		super();
		this.movie_Name = movie_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		this.genre = genre;
	}
	
	public String getMovie_Name() {
		return movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}
	public String getLead_Actor() {
		return lead_Actor;
	}
	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}
	public String getLead_Actress() {
		return lead_Actress;
	}
	public void setLead_Actress(String lead_Actress) {
		this.lead_Actress = lead_Actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString()
	{
		return "Movie"+"[ "+"Name:"+movie_Name+" Lead Actor:"+lead_Actor+" Lead Actress:"+lead_Actress+" Genre:"+genre+" ]";
	}
	
}
