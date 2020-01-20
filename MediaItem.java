package package1;

public abstract class MediaItem extends Item{
	public MediaItem(int uid, String title, int no_of_copies, int runtime) {
		super(uid, title, no_of_copies);
		this.runtime=runtime;
		// TODO Auto-generated constructor stub
	}

	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runntime) {
		this.runtime = runntime;
	}

}
