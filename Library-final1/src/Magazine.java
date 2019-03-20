
public class Magazine extends Library implements Printable {

	private String mediaType;
	
	public Magazine(String itemNo, String title) {
		super(itemNo, title);
		super.setMediaType("Magazine");		
	}
	
	public String toString() {
		return super.toString();
	}

}
