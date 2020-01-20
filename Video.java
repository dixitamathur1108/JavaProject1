package package1;

public class Video extends MediaItem {
	public Video(int uid, String title, int no_of_copies, int runtime, String director, String genre, int 
			releasing_year) {
		super(uid, title, no_of_copies, runtime);
		this.director=director;
		this.genre=genre;
		this.releasing_year=releasing_year;
		// TODO Auto-generated constructor stub
	}
	private String director, genre;
	private int releasing_year;
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("New Video added");
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Check In!!");
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Check Out!!");
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleasing_year() {
		return releasing_year;
	}
	public void setReleasing_year(int releasing_year) {
		this.releasing_year = releasing_year;
	}
	@Override
	protected int getPublished_year() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String setDirector() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String setArtist() {
		// TODO Auto-generated method stub
		return null;
	}

}
