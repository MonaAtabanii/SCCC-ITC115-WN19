
public class DVD extends Library implements Printable {

	private String mediaType;
	
	public DVD(String itemNo, String title) {
		super(itemNo, title);
		super.setMediaType("DVD");		
	}
	
	public String toString() {
		return super.toString();
	}

}
