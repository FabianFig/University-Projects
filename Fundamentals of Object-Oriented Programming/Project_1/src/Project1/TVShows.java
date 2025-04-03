package Project1;

public class TVShows {
	
	private int id;
	//private String type;
	private String title;
	private String director;
	private String country;
	private int releaseYr;
	private String rating;
	private int numSeasons;
	private String description;
	
	public TVShows(int id, String title, String director, String country, int releaseYr, String rating, int numSeasons, String description) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.country = country;
		this.releaseYr = releaseYr;
		this.rating = rating;
		this.numSeasons = numSeasons;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getNumSeasons() {
		return numSeasons;
	}
	public void setNumSeasons(int numSeasons) {
		this.numSeasons = numSeasons;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
