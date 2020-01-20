package package1;

public class Main {
	public static void main(String args[])
	{
		Item i1=new Book(1,"2 States",30,"Chetan Bhagat");
		Item i2=new JournalPaper(2,"New Paper",15,"XYZ",2018);
		Item i3=new Video(3,"Rare",100,4,"Selena Gomez","Romance",2020);
		Item i4=new CD(4,"Manic",20,3,"Halsey","Romance");
		System.out.println("Unique ID: "+i1.getUid()+"   No of Copies: "+ i1.getNo_of_copies()+"   Title: "+i1.getTitle());
		System.out.println("Unique ID: "+i2.getUid()+"   No of Copies: "+ i2.getNo_of_copies()+"   Title: "+i2.getTitle()+"   Published Year: "+i2.getPublished_year());
		System.out.println("Unique ID: "+i3.getUid()+"   No of Copies: "+ i3.getNo_of_copies()+"  Title: "+i3.getTitle()+"   Genre: "+i3.getGenre()+"   Releasing Year: "+i3.getReleasing_year()+"   Runtime: "+i3.getRuntime());
		System.out.println("Unique ID: "+i4.getUid()+"   No of Copies: "+ i4.getNo_of_copies()+"   Title: "+i4.getTitle()+"   Genre: "+i4.getGenre()+"   Runtime: "+i4.getRuntime());
		System.out.println();
		i1.addItem();
		i2.addItem();
		i3.addItem();
		i4.addItem();
	}

}
