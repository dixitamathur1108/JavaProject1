package package1;

public abstract class WrittenItem extends Item{
	public WrittenItem(int uid, String title, int no_of_copies, String author) {
		super(uid, title, no_of_copies);
		this.author=author;
		// TODO Auto-generated constructor stub
	}

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String setArtist() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGenre() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
