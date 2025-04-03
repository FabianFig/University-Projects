package Project1;

public class VideoGames {
	
	private int id;
	//private String type;
	private String title;
	private String platform;
	private int releaseYr;
	private String genre;
	private String publisher;
	private int copiesSold;
	
	public VideoGames(int id, String title, String platform, int releaseYr, String genre, String publisher, int copiesSold) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.releaseYr = releaseYr;
		this.genre = genre;
		this.publisher = publisher;
		this.copiesSold = copiesSold;
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
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}
	
	
}
