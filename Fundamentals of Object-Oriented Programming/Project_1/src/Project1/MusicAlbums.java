package Project1;

public class MusicAlbums {
	
	private int id;
	//private String type;
	private int releaseYr;
	private String artist;
	private int global_sales;
	private int tracks;
	private double durationM;
	private String genre;
	
	public MusicAlbums(int id, int releaseYr, String artist, int global_sales, int tracks, double durationM, String genre) {
		super();
		this.id = id;
		this.releaseYr = releaseYr;
		this.artist = artist;
		this.global_sales = global_sales;
		this.tracks = tracks;
		this.durationM = durationM;
		this.genre = genre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getGlobal_sales() {
		return global_sales;
	}
	public void setGlobal_sales(int global_sales) {
		this.global_sales = global_sales;
	}
	public int getTracks() {
		return tracks;
	}
	public void setTracks(int tracks) {
		this.tracks = tracks;
	}
	public double getDurationM() {
		return durationM;
	}
	public void setDurationM(double durationM) {
		this.durationM = durationM;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
