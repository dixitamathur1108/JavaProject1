package package1;

public class JournalPaper extends WrittenItem{
	public JournalPaper(int uid, String title, int no_of_copies, String author, int published_year) {
		super(uid, title, no_of_copies, author);
		this.published_year=published_year;
		// TODO Auto-generated constructor stub
	}

	private int published_year;

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("New Journal added");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Check in!!");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Check out!!");
	}

	public int getPublished_year() {
		return published_year;
	}

	public void setPublished_year(int published_year) {
		this.published_year = published_year;
	}

	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getReleasing_year() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return null;
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
