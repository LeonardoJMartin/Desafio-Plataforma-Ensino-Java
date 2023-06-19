package utility;

public abstract class Lessoan {
	protected String title;

	public Lessoan(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract int duration();
	
}
