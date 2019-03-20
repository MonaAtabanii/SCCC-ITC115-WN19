
public class Book extends Library implements Printable {

	private String type;
	private String author;

	
	public Book(String itemNo, String title, String author) {
		super(itemNo, title);
		super.setMediaType("Book");
		this.author = author;		
	}


	public String toString() {
		return super.toString() + "\nAuthor: " + author;
	}
	
}
