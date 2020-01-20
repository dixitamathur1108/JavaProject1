package package1;

public class CD extends MediaItem{
	public CD(int uid, String title, int no_of_copies, int runtime, String artist, String genre) {
		super(uid, title, no_of_copies, runtime);
		this.artist=artist;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}

	private String artist, genre;

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("New CD added");
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

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	protected int getPublished_year() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getReleasing_year() {
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
