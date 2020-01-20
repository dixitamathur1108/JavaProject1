package package1;

public class Book extends WrittenItem {

	public Book(int uid, String title, int no_of_copies, String author) {
		super(uid, title, no_of_copies, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("New Book added");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Check in!!");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Check Out!!");
	}

	@Override
	protected int getPublished_year() {
		// TODO Auto-generated method stub
		return 0;
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
	

}
