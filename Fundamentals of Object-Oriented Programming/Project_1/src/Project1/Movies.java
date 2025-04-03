package Project1;

public class Movies {
	private int id;
	//private String type;
	private String title;
	private String director;
	private String country;
	private int releaseYr;
	private String rating;
	private double durationM;
	private String description;
	
	public Movies(int id, String title, String director, String country, int releaseYr, String rating, double durationM, String description) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.country = country;
		this.releaseYr = releaseYr;
		this.setRating(rating);
		this.durationM = durationM;
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

	public double getDurationM() {
		return durationM;
	}
	public void setDurationM(double durationM) {
		this.durationM = durationM;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
