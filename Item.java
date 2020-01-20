package package1;

public abstract class Item {
	private int uid, no_of_copies;
	private String title;
	
	public Item(int uid, String title, int no_of_copies)
	{
		this.uid=uid;
		this.no_of_copies=no_of_copies;
		this.title=title;
		
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void addItem();
	public abstract void checkIn();
	public abstract void checkOut();

	protected abstract int getPublished_year();
	public abstract int getRuntime();
	public abstract int getReleasing_year();
	public abstract String getGenre();
	public abstract String setDirector();
	public abstract String setArtist();

}
