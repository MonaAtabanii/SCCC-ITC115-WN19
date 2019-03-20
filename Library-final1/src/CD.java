
public class CD extends Library implements Printable {

	private String mediaType;
	private String artist;
	
	public CD(String itemNo, String title, String artist) {
		super(itemNo, title);
		super.setMediaType("CD");
		this.artist = artist;		
	}

	public String toString() {
		return super.toString() + "\n Artist: " + artist;
	}
}

